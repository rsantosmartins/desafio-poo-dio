
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
public class Main {

    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        Bootcamp Bootcamp;
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rafael" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        System.out.print("-");
        System.out.println("Conteudos Inscritos Rafael" + devRafael.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rafael" + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

        System.out.println("----");

        Dev devLaissa = new Dev();
        devLaissa.setNome("Laissa");
        devLaissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Laissa" + devLaissa.getConteudosInscritos());
        devLaissa.progredir();
        devLaissa.progredir();
        devLaissa.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos Laissa" + devLaissa.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Laissa" + devLaissa.getConteudosConcluidos());
        System.out.println("XP:" + devLaissa.calcularTotalXp());





    }
}
