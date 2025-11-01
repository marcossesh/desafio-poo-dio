package br.com.dio.desafio.dominio;


public class Mentorias extends Conteudos {
    private String dataMentoria;
    private String horarioMentoria;

    public Mentorias(String titulo, String descricao, String dataMentoria, String horarioMentoria) {
        super(titulo, descricao);
        this.dataMentoria = dataMentoria;
        this.horarioMentoria = horarioMentoria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public String getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(String dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    public String getHorarioMentoria() {
        return horarioMentoria;
    }

    public void setHorarioMentoria(String horarioMentoria) {
        this.horarioMentoria = horarioMentoria;
    }
}
