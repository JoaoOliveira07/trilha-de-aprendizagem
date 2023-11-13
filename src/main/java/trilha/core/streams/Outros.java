package trilha.core.streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gwen", 7.2);
        Aluno a2 = new Aluno("Briar", 6.2);
        Aluno a3 = new Aluno("Annie", 8.2);
        Aluno a4 = new Aluno("Janna", 10);
        Aluno a5 = new Aluno("DeiJJ", 9.5);
        Aluno a6 = new Aluno("Briar", 6.2);
        Aluno a7 = new Aluno("Annie", 8.2);
        Aluno a8 = new Aluno("Bjorn", 9);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);

        System.out.println("\nTakeWhile");
        alunos.stream().distinct().skip(2).takeWhile(a -> a.nota >= 7).forEach(System.out::println);

    }
}
