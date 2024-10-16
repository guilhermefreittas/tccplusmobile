package com.example.apptccplus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.apptccplus.crud.UsuarioCrud;
import com.example.apptccplus.model.Usuario;

public class Login extends AppCompatActivity {

    EditText editEmail, editSenha;
    TextView lbResultado;
    Button btnLogar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editEmail = findViewById(R.id.editEmailLogin);
        editSenha = findViewById(R.id.editSenhaLogin);
        lbResultado = findViewById(R.id.lbResultadoLogin);
        btnLogar = findViewById(R.id.btnLogar);
    }

    public void login(View v){
        String email = editEmail.getText().toString();
        String senha = editSenha.getText().toString();

        Usuario usu = new UsuarioCrud().selecionarUsuario(email, senha);
        if(usu != null){
                lbResultado.setText("login com sucesso!");
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);

               // finish();
        }else{
            lbResultado.setText("Email e/ou Senha inválida");
            limpar();
        }
     /*   if(email.equalsIgnoreCase("admin")){
            if(senha.equalsIgnoreCase("12345")){
            lbResultado.setText("login com sucesso!");
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);

            finish();
        }else {
                lbResultado.setText("senha inválida");
                limpar();
            }
        }else{
            lbResultado.setText("Usuário Inválido");
            limpar();
        }
        */

    }

    private  void limpar(){
        //editEmail.setText("");
        editSenha.setText("");
        editEmail.requestFocus();
    }

}