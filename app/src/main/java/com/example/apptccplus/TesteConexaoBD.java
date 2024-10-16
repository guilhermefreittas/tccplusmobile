package com.example.apptccplus;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.Connection;

public class TesteConexaoBD extends AppCompatActivity {


    TextView BancoTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_conexao_bd);

        Connection conn = conexao.conectarr(TesteConexaoBD.this);
        BancoTeste = findViewById(R.id.BancoTeste);

        try {
            if (conn != null) {
                if (!conn.isClosed())
                    BancoTeste.setText("Conexão realizada com sucesso");
                else
                    BancoTeste.setText("A conexão está fechada");
            } else {
                BancoTeste.setText("Conexão Nula, não realizada");
            }
    } catch (java.sql.SQLException ex){
            ex.printStackTrace();
            BancoTeste.setText("Conexão falhou!!\n"+
                    ex.getMessage());
        }



    }
}