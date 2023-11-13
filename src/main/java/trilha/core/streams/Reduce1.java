package trilha.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce1 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Gwen", 7.2);
        Aluno a2 = new Aluno("Briar", 6.2);
        Aluno a3 = new Aluno("Annie", 8.2);
        Aluno a4 = new Aluno("Janna", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
