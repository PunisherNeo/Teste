package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;

public class CalculadorasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadoras);

        Button btnCalculadoraMods = findViewById(R.id.btnCalculadoraMods);

        btnCalculadoraMods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ao clicar em "Calculadora de Mods", vá para a tela CalculadoraModsActivity
                Intent intent = new Intent(CalculadorasActivity.this, CalculadoraModsActivity.class);
                startActivity(intent);
            }
        });

        Button btnCalculadoraOperadores = findViewById(R.id.btnCalculadoraOperadores);
        btnCalculadoraOperadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadorasActivity.this, CalculadoraOperadoresActivity.class);
                startActivity(intent);
            }
        });

        Button btnCalculadoraMissoes = findViewById(R.id.btnCalculadoraMissoes);
        btnCalculadoraMissoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadorasActivity.this, CalculadoraMissoesActivity.class);
                startActivity(intent);
            }
        });


        Button btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ao clicar em "Voltar", retorne para a tela anterior
                onBackPressed();
            }
        });

        // Adicione mais inicializações ou lógica conforme necessário
    }
}