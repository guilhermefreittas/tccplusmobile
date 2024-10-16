package com.example.apptccplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.apptccplus.crud.UsuarioCrud;
import com.example.apptccplus.model.Usuario;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

public class Cadastro extends AppCompatActivity {

   EditText editNome, editEmail, editSenha;
   Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editNome = (EditText) findViewById(R.id.editNomeCadastro);
        editEmail = (EditText) findViewById(R.id.editEmailCadastro);
        editSenha = (EditText) findViewById(R.id.editSenhaCadastro);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = editNome.getText().toString();
                String email = editEmail.getText().toString();
                String senha = editSenha.getText().toString();
                if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                    Snackbar.make(btnCadastrar, "Preencha todos os campos!",
                            Snackbar.LENGTH_LONG).show();
                    return;
                }

                Usuario user = new Usuario(
                      //  editNome.getText().toString(),
                        editNome.getText().toString(),
                        editEmail.getText().toString(),
                        //editSenha.getText().toString()
                        editSenha.getText().toString()
                );

                int res = UsuarioCrud.InserirUsuario(user, getBaseContext());
                if( res <=0){
                    Snackbar.make(btnCadastrar, "Dados não inseridos!", Snackbar.LENGTH_LONG).show();
                } else {
                    Snackbar.make(btnCadastrar, "Dados Cadastrados com Sucesso", Snackbar.LENGTH_LONG).show();
                }
            }
        });




    }
}