package com.example.teste;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.teste.R;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnCalculadoras = findViewById(R.id.btnCalculadoras);
        Button btnCadastro = findViewById(R.id.btnCadastro);
        Button btnConsulta = findViewById(R.id.btnConsulta);

        Button btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ao clicar em "Voltar", retorne para a tela anterior
                onBackPressed();
            }
        });

        btnCalculadoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ao clicar em Calculadoras, vá para a tela de Calculadoras
                Intent intent = new Intent(HomeActivity.this, CalculadorasActivity.class);
                startActivity(intent);
            }
        });

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ao clicar em Cadastro, vá para a tela de Cadastro
                Intent intent = new Intent(HomeActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ao clicar em Consulta, vá para a tela de Consulta
                Intent intent = new Intent(HomeActivity.this, ConsultaActivity.class);
                startActivity(intent);
            }
        });
    }
}
