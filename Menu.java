package com.example.alunetteste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button btLogAcessar, btFaleComProf, btEventos, btNotas, btDisciplinas, btMenu, btConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Inicializa os botões
        btLogAcessar = findViewById(R.id.btLogAcessar);
        btFaleComProf = findViewById(R.id.btFaleComProf);
        btEventos = findViewById(R.id.btEventos);
        btNotas = findViewById(R.id.btNotas);
        btDisciplinas = findViewById(R.id.btDisciplinas);
        btConfig = findViewById(R.id.btConfig);
        btMenu = findViewById(R.id.btMenu);

        // Define os listeners
        if (btLogAcessar != null) {
            btLogAcessar.setOnClickListener(this);
        }
        if (btMenu != null) {
            btMenu.setOnClickListener(this);
        }
        if (btFaleComProf != null) {
            btFaleComProf.setOnClickListener(this);
        }
        if (btEventos != null) {
            btEventos.setOnClickListener(this);
        }
        if (btNotas != null) {
            btNotas.setOnClickListener(this);
        }
        if (btDisciplinas != null) {
            btDisciplinas.setOnClickListener(this);
        }
        if (btConfig != null) {
            btConfig.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btLogAcessar) {
            startActivity(new Intent(this, Login.class));
        } else if (v.getId() == R.id.btFaleComProf) {
            startActivity(new Intent(this, FaleComProf.class));
        } else if (v.getId() == R.id.btEventos) {
            startActivity(new Intent(this, Eventos.class));
        } else if (v.getId() == R.id.btNotas) {
            startActivity(new Intent(this, Notas.class));
        } else if (v.getId() == R.id.btDisciplinas) {
            startActivity(new Intent(this, Disciplinas.class));
        } else if (v.getId() == R.id.btConfig) {
            startActivity(new Intent(this, Config.class));
        } else if (v.getId() == R.id.btMenu) {
            startActivity(new Intent(this, Config.class));
        }
        if (v.getId() == R.id.btMenu) {
            startActivity(new Intent(this, Menu.class));
        }

    }
}
