package com.example.alunetteste;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.alunetteste.Login;



public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText txtLogEmail, txtLogSenha;
    Button btLogAcessar, btLogCadastre_se;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btLogAcessar = findViewById(R.id.btLogAcessar);
        btLogCadastre_se = findViewById(R.id.btLogCadastre_se);
        txtLogEmail = findViewById(R.id.txtLogEmail);
        txtLogSenha = findViewById(R.id.txtLogSenha);

        btLogAcessar.setOnClickListener(this);
        btLogCadastre_se.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btLogAcessar){
            Intent tela = new Intent(this, Menu.class);
            startActivity(tela);
        }
        if (v.getId()==R.id.btLogCadastre_se) {
            Intent tela = new Intent(this, Cadastre_se.class);
            startActivity(tela);
        }
    }
}
