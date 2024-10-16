package com.example.apptccplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button abrindo_tela = findViewById(R.id.btnEntrar);
        Button abrindo_tela_cadastro = findViewById(R.id.btnCadastrar);


        abrindo_tela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);

                startActivity(intent);
            }
        });

       abrindo_tela_cadastro.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cadastro.class);

                startActivity(intent);
            }
        }));

    }


}