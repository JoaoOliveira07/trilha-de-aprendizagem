package generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();
        resultadoConcurso.adicionar(1, "Nair");
        resultadoConcurso.adicionar(2, "Gabi");
        resultadoConcurso.adicionar(3, "Everton");
        resultadoConcurso.adicionar(4, "Diogo");
        resultadoConcurso.adicionar(2, "João");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(2));

    }
}
