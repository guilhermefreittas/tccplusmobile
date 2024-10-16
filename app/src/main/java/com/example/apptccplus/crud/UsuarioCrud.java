package com.example.apptccplus.crud;

import android.content.Context;

import com.example.apptccplus.conexao;
import com.example.apptccplus.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioCrud {


    //MODELO DO ED
public  static int InserirUsuario(Usuario usuario, Context ctx){

        int resposta = 0;

        try {
            PreparedStatement pst = conexao.conectar().prepareStatement(
                    "Insert Into Usuario(id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario)" + "values (?, ?, ?, ?, ?, ?, ?, ?)");
            //pst.setInt(1, Usuario.getId());
            pst.setString(2, Usuario.getNome());
            pst.setString(3, Usuario.getEmail());
            pst.setString(4, Usuario.getSenha());
            //pst.setString(5, Usuario.getNivelAcesso());

            resposta = pst.executeUpdate();
        } catch (Exception e){
            e.getMessage();
        }
        return resposta;
    }

    //MODELO DO YOUTUBE
    /*
    public Usuario selecionarUsuario(String email, String senha) {
        try {
            Connection conn = conexao.conectar();
            if (conn != null) {
                String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, email);
                pst.setString(2, senha);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    Usuario usu = new Usuario();
                    usu.setId(rs.getInt("id"));
                    usu.setEmail(rs.getString("email"));
                    usu.setSenha(rs.getString("senha"));
                    // Preencha outros atributos, se necessário
                    conn.close();
                    return usu;
                }
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


  /*  public static int inserirUsuario (Usuario usuario, Context ctx){

        int resposta = 0;

        try{
            PreparedStatement pst = conexao.conectar(ctx).prepareStatement(
                    "Insert into Usuario (id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario)" + "values(1, 2, 3,4, 5, 6, 7, 8)");

            pst.setInt(1, Usuario.getId());
            pst.setString(2, Usuario.getNome());
            pst.setString(3, Usuario.getEmail());
            pst.setString(4, Usuario.getSenha());
            pst.setString(5, Usuario.getNivelAcesso());
            pst.setByte(6, Usuario.getFoto());
            pst.setDate(7, Usuario.getDataCadastro());
            pst.setString(8, Usuario.getStatusUsuario());

            resposta = pst.executeUpdate();
        } catch (Exception e) {
            e.getMessage();
        }
        return resposta;
    }*/
}
