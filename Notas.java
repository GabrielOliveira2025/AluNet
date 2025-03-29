package com.example.alunetteste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Notas extends AppCompatActivity {

    Button btMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        // Inicializa o botão
        btMenu = findViewById(R.id.btMenu);

        // Adiciona o evento de clique
        btMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vai para a tela inicial (Menu)
                startActivity(new Intent(Notas.this, Menu.class));
                finish(); // Fecha a tela atual para não acumular na pilha
            }
        });
    }
}