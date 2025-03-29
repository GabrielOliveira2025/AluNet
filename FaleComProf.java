package com.example.alunetteste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FaleComProf extends AppCompatActivity {

    Button btMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fale_com_prof);


        btMenu = findViewById(R.id.btMenu);


        btMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(FaleComProf.this, Menu.class));
                finish(); // Fecha a tela atual
            }
        });
    }
}
