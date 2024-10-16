package com.example.apptccplus.model;

import java.util.Date;

public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String nivelAcesso;
    private byte[] foto; // VARBINARY(MAX)
    private Date dataCadastro; // SMALLDATETIME
    private String statusUsuario;



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }
    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public byte[] getFoto() {
        return foto;
    }
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }
    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }
}
