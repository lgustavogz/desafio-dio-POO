import br.com.grassi.desafio.dominio.Bootcamp;
import br.com.grassi.desafio.dominio.Curso;
import br.com.grassi.desafio.dominio.Dev;
import br.com.grassi.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos:" + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        System.out.println("______");
        System.out.println("Conteúdos inscritos:" + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos:" + devGustavo.getConteudosConcluidos());
        System.out.println("XP:" + devGustavo.calcularTotalXp());

        System.out.println("______");

        Dev devFrancesca = new Dev();
        devFrancesca.setNome("Francesca");
        devFrancesca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos:" + devFrancesca.getConteudosInscritos());
        devFrancesca.progredir();
        System.out.println("______");
        System.out.println("Conteúdos inscritos:" + devFrancesca.getConteudosInscritos());
        System.out.println("Conteúdos concluídos:" + devFrancesca.getConteudosConcluidos());
        System.out.println("XP:" + devFrancesca.calcularTotalXp());
    }
}
