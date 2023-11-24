package com.example.teste;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraOperadoresActivity extends AppCompatActivity {

    private Spinner spinnerNivelAtual;
    private Spinner spinnerNivelDesejado;
    private TextView resultadoCalculo;
    private TabelaNiveis tabelaNiveis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_operadores);

        spinnerNivelAtual = findViewById(R.id.spinnerNivelAtual);
        spinnerNivelDesejado = findViewById(R.id.spinnerNivelDesejado);
        resultadoCalculo = findViewById(R.id.resultadoCalculo);

        ArrayAdapter<String> adapterNivelAtual = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, criarArrayDeValores(1, 99));
        adapterNivelAtual.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNivelAtual.setAdapter(adapterNivelAtual);

        spinnerNivelAtual.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                int valorSelecionado = Integer.parseInt(spinnerNivelAtual.getSelectedItem().toString());
                ArrayAdapter<String> adapterNivelDesejado = new ArrayAdapter<>(CalculadoraOperadoresActivity.this, android.R.layout.simple_spinner_item, criarArrayDeValores(valorSelecionado + 1, 100));
                adapterNivelDesejado.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerNivelDesejado.setAdapter(adapterNivelDesejado);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Implementação se nada for selecionado
            }
        });

        spinnerNivelAtual.setSelection(0); // Definindo o valor inicial para 1

        spinnerNivelDesejado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                // Lógica adicional, se necessário, quando algo for selecionado na segunda ComboBox
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Implementação se nada for selecionado
            }
        });

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularMods();
            }
        });

        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Encerra a activity atual e volta para a anterior
            }
        });

        tabelaNiveis = new TabelaNiveis();
    }

    private void calcularMods() {
        int diferencaFrags = 0;
        int diferencaPrata = 0;
        int diferencaOuro = 0;

        int nivelAtual = Integer.parseInt(spinnerNivelAtual.getSelectedItem().toString());
        int nivelDesejado = Integer.parseInt(spinnerNivelDesejado.getSelectedItem().toString());

        for (NivelDados nivel : tabelaNiveis.getTabela()) {
            int nivelAtualTabela = nivel.getLevel();
            if (nivelAtualTabela >= nivelAtual && nivelAtualTabela < nivelDesejado) {
                Integer frags = nivel.getFrags();
                Integer prata = nivel.getPrata();
                Integer ouro = nivel.getOuro();

                if (frags != null) {
                    diferencaFrags += frags;
                }
                if (prata != null) {
                    diferencaPrata += prata;
                }
                if (ouro != null) {
                    diferencaOuro += ouro;
                }
            }
        }

        if (diferencaFrags != 0 || diferencaPrata != 0 || diferencaOuro != 0) {
            String textoResultado = "\nVocê precisa de " + diferencaFrags + " Frags e " + diferencaPrata + " Prata para chegar ao nível desejado.\n";
            textoResultado += "O que equivale a " + diferencaOuro + " Ouro caso sejam comprados os fragmentos na loja.";

            resultadoCalculo.setText(textoResultado);
        } else {
            resultadoCalculo.setText("\nNíveis não encontrados na tabela ou nível atual maior ou igual ao nível desejado.");
        }
    }

    private String[] criarArrayDeValores(int inicio, int fim) {
        String[] valores = new String[fim - inicio + 1];
        for (int i = inicio; i <= fim; i++) {
            valores[i - inicio] = String.valueOf(i);
        }
        return valores;
    }

   
    
}
