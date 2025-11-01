package br.com.dio.desafio.dominio;

public abstract class Conteudos {
    private String titulo;
    private String descricao;
    protected static final double XP_PADRAO = 10d;

    public Conteudos(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double calcularXp() {
        return XP_PADRAO;
    }

}
