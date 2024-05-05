import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
     }
}