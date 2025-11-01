package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDateTime dataInicio;
    private final LocalDateTime dataFim;
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = LocalDateTime.now();
        this.dataFim = dataInicio.plusDays(45);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}