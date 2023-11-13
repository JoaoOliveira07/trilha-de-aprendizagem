package trilha.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Daniel", 5.8);
        Aluno a3 = new Aluno("Bia", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebecca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);
        Aluno a7 = new Aluno("João", 4.8);
        Aluno a8 = new Aluno("Diogo", 3.2);


        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        List<String> anuncioDasListas = Arrays.asList("Lista de Aprovados:", "\nLista de Recuperação:", "\nLista de Reprovado:");

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns " + a.nome + "! Você foi aprovado";

        Predicate<Aluno> recuperacao = a -> a.nota < 7 && a.nota >= 5;
        Function<Aluno, String> saudacaoRecuperado =
                a -> "Não desista " + a.nome + "! Você está em recuperação";

        Predicate<Aluno> reprovado = a -> a.nota < 5;
        Function<Aluno, String> saudacaoReprovado =
                a -> "Não foi dessa vez " + a.nome + "! Você foi reprovado";


        System.out.println(anuncioDasListas.get(0));
        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);

        System.out.println(anuncioDasListas.get(1));
        alunos.stream()
                .filter(recuperacao)
                .map(saudacaoRecuperado)
                .forEach(System.out::println);

        System.out.println(anuncioDasListas.get(2));
        alunos.stream()
                .filter(reprovado)
                .map(saudacaoReprovado)
                .forEach(System.out::println);
    }
}
