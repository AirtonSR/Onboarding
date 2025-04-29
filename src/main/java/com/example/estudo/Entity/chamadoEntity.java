package com.example.estudo.Entity;

public class chamadoEntity {
    private int id;
    private String nome;
    private String titulo;
    private String descricao;
    private boolean status;
    private String datadeAbertura;
    private String deadLine;

    public chamadoEntity() {}

    public chamadoEntity(int id, String nome, String titulo, String descricao, String dataDeAbertura, String deadLine, boolean isStatus) {
        this.id = id;
        this.nome = nome;
        this.titulo = titulo;
        this.descricao = descricao;
        this.datadeAbertura = dataDeAbertura;
        this.status = isStatus;
        this.deadLine = deadLine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDatadeAbertura() {
        return datadeAbertura;
    }

    public void setDatadeAbertura(String datadeAbertura) {
        this.datadeAbertura = datadeAbertura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public chamadoEntity setStatus(boolean status) {
        this.status = status;
        return this;  // Retorna o próprio objeto para encadeamento
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeAbertura() {
        return datadeAbertura;
    }

    public chamadoEntity setDataDeAbertura(String dataDeAbertura) {
        this.datadeAbertura = dataDeAbertura;
        return this;  // Retorna o próprio objeto para encadeamento
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }
}
