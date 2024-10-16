package com.example.apptccplus.model;

import java.util.Date;

public class Usuario {

    private Integer id;
    private static String nome;
    private static String email;
    private static String senha;
    private String nivelAcesso;
    private byte[] foto; // VARBINARY(MAX)
    private Date dataCadastro; // SMALLDATETIME
    private String statusUsuario;


    // Construtor padrão
    public Usuario() {
    }

    // Construtor simplificado com apenas nome, email e senha
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        // Você pode definir valores padrão para os outros campos se necessário
        this.nivelAcesso = "usuario"; // Exemplo: nível de acesso padrão
        this.dataCadastro = new Date(); // Exemplo: data atual
        this.statusUsuario = "ativo"; // Exemplo: status padrão
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getSenha() {
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

