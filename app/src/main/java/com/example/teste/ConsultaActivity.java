package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConsultaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        Button btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ao clicar em "Voltar", retorne para a tela anterior
                onBackPressed();
            }
        });

        // Adicione mais lógica conforme necessário
    }
}