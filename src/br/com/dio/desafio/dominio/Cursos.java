package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cursos extends Conteudos {
    private String nivel;
    private final List<Devs> devsInscritos = new ArrayList<>();

    public Cursos(String titulo, String descricao, String nivel) {
        super(titulo, descricao);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<Devs> getDevsInscritos() {
        return devsInscritos;
    }

    public void inscreverDev(Devs dev) {
        this.devsInscritos.add(dev);
    }

}