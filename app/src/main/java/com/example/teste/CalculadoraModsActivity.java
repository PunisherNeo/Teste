package com.example.teste;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraModsActivity extends AppCompatActivity {

        private Spinner comboMods1;
        private EditText quantidadeMods;
        private EditText valorModBranco;
        private TextView resultadoCalculo;

        private final int[] taxasDeConversao = {6, 30, 120, 360};

        private int calcularQuantidadeMods(int quantidade, int posicaoComboMods) {
                int taxaConversao = 1;
                for (int i = 0; i < posicaoComboMods; i++) {
                        taxaConversao *= taxasDeConversao[i];
                }
                return quantidade * taxaConversao;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_calculadora_mods);

                quantidadeMods = findViewById(R.id.quantidadeMods);
                comboMods1 = findViewById(R.id.comboMods1);
                valorModBranco = findViewById(R.id.valorModBranco);
                resultadoCalculo = findViewById(R.id.resultadoCalculo);

                valorModBranco.setText("2000"); // Valor padrão para valorModBranco

                final String[] opcoesMods1 = {"Branco", "Azul", "Roxo", "Laranja", "Amarelo"};

                ArrayAdapter<String> adapterMods1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcoesMods1);
                adapterMods1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                comboMods1.setAdapter(adapterMods1);

                comboMods1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                                calcularConversao();
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
                                calcularConversao();
                        }
                });

                Button btnVoltar = findViewById(R.id.btnVoltar);
                btnVoltar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                finish(); // Encerra a activity atual e volta para a anterior
                        }
                });
        }

        private void calcularConversao() {
                String quantidadeStr = quantidadeMods.getText().toString();
                String valorModStr = valorModBranco.getText().toString();

                if (!quantidadeStr.isEmpty() && !valorModStr.isEmpty()) {
                        int quantidade = Integer.parseInt(quantidadeStr);
                        int valorMod = Integer.parseInt(valorModStr);

                        int posicaoComboMods = comboMods1.getSelectedItemPosition();
                        String corSelecionada = comboMods1.getSelectedItem().toString();

                        String textoResultado = "";

                        switch (corSelecionada.toLowerCase()) {
                                case "branco":
                                        textoResultado = "Para " + quantidade + " Mods Branco você precisa de " + (valorMod * quantidade) + " Prata.";
                                        break;
                                case "azul":
                                        int modsBranco = calcularQuantidadeMods(quantidade, posicaoComboMods);
                                        textoResultado = "Para " + quantidade + " Mods Azuis você precisa de " + modsBranco +
                                                " Mods Brancos. Totalizando " + (modsBranco * valorMod) + " Prata.";
                                        break;
                                case "roxo":
                                        int modsRoxos = calcularQuantidadeMods(quantidade, posicaoComboMods);
                                        int modsBrancosRoxos = quantidade*30;
                                        int modsAzuisRoxos = quantidade*5;
                                        textoResultado = "Para " + quantidade + " Mods Roxos você precisa de " + modsAzuisRoxos + " Mods Azuis ou " + modsBrancosRoxos +
                                                        " Mods Brancos. Totalizando " + (modsBrancosRoxos * valorMod) + " Prata.";
                                        break;
                                case "laranja":
                                        int modsLaranjas = calcularQuantidadeMods(quantidade, posicaoComboMods);
                                        int modsRoxosLaranjas = quantidade*4;
                                        int modsAzuisLaranjas = quantidade*20;
                                        int modsBrancosLaranjas = quantidade*120;
                                        textoResultado = "Para " + quantidade + " Mods Laranjas você precisa de " + modsRoxosLaranjas + " Mods Roxos ou " + modsAzuisLaranjas +
                                                        " Mods Azuis ou " + modsBrancosLaranjas + " Mods Brancos. Totalizando " +
                                                        (modsBrancosLaranjas * valorMod) + " Prata.";
                                        break;
                                case "amarelo":
                                        int modsAmarelos = calcularQuantidadeMods(quantidade, posicaoComboMods);
                                        int modsLaranjasAmarelos = quantidade*3;
                                        int modsRoxosAmarelos = quantidade*12;
                                        int modsAzuisAmarelos = quantidade*60;
                                        int modsBrancosAmarelos = quantidade*360;
                                        textoResultado = "Para " + quantidade + " Mods Amarelos você precisa de " + modsLaranjasAmarelos + " Mods Laranjas ou " + modsRoxosAmarelos +
                                                        " Mods Roxos ou " + modsAzuisAmarelos + " Mods Azuis ou " + modsBrancosAmarelos + " Mods Brancos. Totalizando " +
                                                        (modsBrancosAmarelos * valorMod) + " Prata.";
                                        break;
                        }

                        resultadoCalculo.setText(textoResultado);
                } else {
                        // Lógica para lidar com campos vazios, se necessário
                }
        }
}