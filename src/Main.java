import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

     public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java POO ");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Javascript");
        curso2.setDescricao("Curso DIO Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria DIO Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Dio Becas Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso2);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteúdos Concluídos" + devPedro.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devPedro.getConteudosInscritos());
        
        Dev devTati = new Dev();
        devTati.setNome("Tati");
        devTati.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devTati.getConteudosInscritos());
        devTati.progredir();
        System.out.println("Conteúdos Concluídos" + devTati.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devTati.getConteudosInscritos());
     }
}