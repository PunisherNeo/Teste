package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CalculadoraMissoesActivity extends AppCompatActivity {
    private Map<String, Map<String, Integer>> pontuacoesMissao;
    private Spinner[] spinners;
    private Map<Spinner, List<String>> availableOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_missoes);


        pontuacoesMissao = PontuacoesMissao.getPontuacoes();
        Button btnCalcular = findViewById(R.id.btnCalcular);
        TextView textViewResultadoCalculo = findViewById(R.id.textViewResultadoCalculo);

        btnCalcular.setOnClickListener(view -> {
            Log.d("Calculadora", "Botão de calcular pressionado");
            Map<String, String> missoesSelecionadas = new HashMap<>();

            for (int i = 0; i < spinners.length; i++) {
                String missao = "MISSAO" + (i + 1);
                String selectedItem = spinners[i].getSelectedItem().toString();
                missoesSelecionadas.put(missao, selectedItem);
            }

            // Calcular operadores ideais
            String resultadoCalculo = calcularOperadoresPorMissao(pontuacoesMissao, missoesSelecionadas.toString());

            // Exibir resultado onde desejar, como em um TextView
            exibirModalResultado(resultadoCalculo);
        });


        spinners = new Spinner[]{
                findViewById(R.id.comboBoxMissao1), findViewById(R.id.comboBoxMissao2),
                findViewById(R.id.comboBoxMissao3), findViewById(R.id.comboBoxMissao4),
                findViewById(R.id.comboBoxMissao5), findViewById(R.id.comboBoxMissao6),
                findViewById(R.id.comboBoxMissao7), findViewById(R.id.comboBoxMissao8)
        };

        availableOptions = new HashMap<>();

        List<String> opcoesDisponiveis = Arrays.asList(
                "Selecione", "BAIONETA", "BRECHA", "B.S.S.", "COBERTURA", "DEMONSTRAÇÃO", "FACA",
                "HABITANTES", "HILDR", "LIMPEZA", "LOGÍSTICA", "MARTELO", "M. BÁSICA",
                "RECONHECIMENTO", "S. COMUM", "S. INCOMUM", "S. RARO"
        );

        for (Spinner spinner : spinners) {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new ArrayList<>(opcoesDisponiveis));
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);

            availableOptions.put(spinner, new ArrayList<>(opcoesDisponiveis.subList(1, opcoesDisponiveis.size())));
            configurarListeners(spinner);
        }

        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(view -> onBackPressed());
    }
    private void exibirModalResultado(String resultado) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.modal_resultado, null);
        builder.setView(dialogView);
        AlertDialog dialog = builder.create();

        TextView textViewResultadoModal = dialogView.findViewById(R.id.textViewResultadoModal);
        Button btnFecharModal = dialogView.findViewById(R.id.btnFecharModal);


        Map<String, String> missoesSelecionadas = new HashMap<>();
        for (int missao = 1; missao <= 8; missao++) {
            String spinnerId = "comboBoxMissao" + missao;
            int spinnerResourceId = getResources().getIdentifier(spinnerId, "id", getPackageName());
            Spinner spinner = findViewById(spinnerResourceId);
            String missaoSelecionada = spinner.getSelectedItem().toString();
            missoesSelecionadas.put("MISSAO" + missao, missaoSelecionada);
        }

        String resultadoOrdenado = organizarResultadoPorMissao(missoesSelecionadas);

        textViewResultadoModal.setText(resultadoOrdenado);

        final String finalResultadoOrdenado = resultadoOrdenado;

        // Código para copiar o resultado para o clipboard
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Resultado", finalResultadoOrdenado);
        clipboardManager.setPrimaryClip(clip);
        Toast.makeText(this, "Resultado copiado para o clipboard", Toast.LENGTH_SHORT).show();

        btnFecharModal.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }



    private int extrairNumeroMissao(String linha) {
        String[] partes = linha.split(":");
        if (partes.length > 0 && partes[0].matches(".*\\d+.*")) {
            String numeroMissao = partes[0].replaceAll("\\D+", "");
            return Integer.parseInt(numeroMissao);
        }
        return -1;
    }


    private void configurarListeners(final Spinner currentSpinner) {
        currentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedItem = adapterView.getItemAtPosition(position).toString();
                updateOptions(selectedItem, currentSpinner);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Implementação se nada for selecionado
            }
        });
    }

    private void updateOptions(String selectedItem, Spinner currentSpinner) {
        for (Spinner spinner : spinners) {
            if (spinner != currentSpinner) {
                ArrayAdapter<String> adapter = (ArrayAdapter<String>) spinner.getAdapter();
                List<String> options = availableOptions.get(spinner);

                if (selectedItem.equals("Selecione")) {
                    if (!options.contains(selectedItem)) {
                        options.add(selectedItem);
                        Collections.sort(options.subList(1, options.size()));
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    for (Spinner otherSpinner : spinners) {
                        if (otherSpinner != spinner && !otherSpinner.equals(currentSpinner)) {
                            String otherSelectedItem = otherSpinner.getSelectedItem().toString();
                            if (selectedItem.equals(otherSelectedItem)) {
                                currentSpinner.setSelection(0);
                                return;
                            }
                        }
                    }

                    if (options.contains(selectedItem)) {
                        options.remove(selectedItem);
                        adapter.notifyDataSetChanged();
                    }

                    if (!options.contains("Selecione")) {
                        options.add(0, "Selecione");
                        adapter.notifyDataSetChanged();
                    }
                }
            }
        }
    }


    private String organizarResultadoPorMissao(Map<String, String> missoesSelecionadas) {
        Map<Integer, StringBuilder> resultadoPorMissao = new TreeMap<>();

        for (Map.Entry<String, String> entry : missoesSelecionadas.entrySet()) {
            String missaoKey = entry.getKey();
            String missaoSelecionada = entry.getValue();

            if (!missaoSelecionada.equals("Selecione")) {
                int numeroMissao = Integer.parseInt(missaoKey.replaceAll("MISSAO", ""));
                String resultadoMissao = calcularOperadoresPorMissao(pontuacoesMissao, missaoSelecionada);

                if (!resultadoPorMissao.containsKey(numeroMissao)) {
                    resultadoPorMissao.put(numeroMissao, new StringBuilder());
                }

                StringBuilder resultadoAtual = resultadoPorMissao.get(numeroMissao);
                resultadoAtual.append("Missao ").append(numeroMissao).append(" - \"").append(missaoSelecionada).append("\"\n");
                resultadoAtual.append(resultadoMissao).append("\n");
            }
        }

        StringBuilder resultadoFormatado = new StringBuilder();
        for (StringBuilder resultadoMissao : resultadoPorMissao.values()) {
            resultadoFormatado.append(resultadoMissao);
        }

        return resultadoFormatado.toString();
    }


    private String calcularOperadoresPorMissao(Map<String, Map<String, Integer>> pontuacoesMissao, String missaoSelecionada) {
        StringBuilder resultado = new StringBuilder();

        if (pontuacoesMissao.containsKey(missaoSelecionada)) {
            Map<String, Integer> pontuacoesOperadores = pontuacoesMissao.get(missaoSelecionada);
            int pontuacaoMaxima = Collections.max(pontuacoesOperadores.values());

            List<String> operadoresMaxPontuacao = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : pontuacoesOperadores.entrySet()) {
                String operador = entry.getKey();
                int pontuacao = entry.getValue();

                if (pontuacao == pontuacaoMaxima) {
                    operadoresMaxPontuacao.add(operador);
                }
            }

            if (!operadoresMaxPontuacao.isEmpty()) {
                resultado.append("[").append(String.join(", ", operadoresMaxPontuacao)).append("]\n");
            }
        }

        return resultado.toString();
    }

    private String encontrarOperadorMaxPontuacao(Map<String, Integer> pontuacoesOperadores) {
        String operadorMaxPontuacao = "";
        int pontuacaoMaxima = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : pontuacoesOperadores.entrySet()) {
            String operador = entry.getKey();
            int pontuacao = entry.getValue();

            if (pontuacao > pontuacaoMaxima) {
                operadorMaxPontuacao = operador;
                pontuacaoMaxima = pontuacao;
            }
        }
        return operadorMaxPontuacao;
    }

}

