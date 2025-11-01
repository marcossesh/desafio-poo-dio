import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Mentorias;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Devs;


public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gerenciamento de Bootcamps");
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Aprenda Java do zero");
        Mentorias mentoria = new Mentorias("Mentoria Java", "Tire suas dúvidas sobre Java", "10/10/2023", "14:00");
        Cursos curso = new Cursos("Java Básico", "Introdução ao Java", "Iniciante");


        
        Devs dev = new Devs("João", "joao@example.com");
        System.out.println(bootcamp.getNome());
        System.out.println(bootcamp.getDescricao());
        System.out.println("Dev: " + dev.getNome() + ", Email: " + dev.getEmail());
        System.out.println("Curso: " + curso.getTitulo() + ", Nível: " + curso.getNivel());
        curso.inscreverDev(dev);
        System.out.println("Devs inscritos no curso: " + curso.getDevsInscritos().size());
        System.out.println("Mentoria: " + mentoria.toString());
    }
}
