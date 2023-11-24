package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciar os elementos da UI
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        // Adicionar um listener de clique ao botão de login
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obter o texto dos campos de usuário e senha
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Implementar a lógica de autenticação (pode ser uma verificação simples)
                if (username.equals("") && password.equals("")) {
                    // Autenticação bem-sucedida

                    // Iniciar a HomeActivity
                    Intent intent = new Intent(MainActivity.this, com.example.teste.HomeActivity.class);
                    startActivity(intent);

                    // Fechar a MainActivity para evitar que o usuário retorne pressionando o botão "Voltar"
                    finish();
                } else {
                    // Autenticação falhou
                    Toast.makeText(MainActivity.this, "Login falhou", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}