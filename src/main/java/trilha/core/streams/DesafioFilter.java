package trilha.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Produto p1 = new Produto("iPad", 1990.00, 0.30, true);
        Produto p2 = new Produto("Teclado Mecânico", 329.00, 0.30, false);
        Produto p3 = new Produto("Mouse Redragon", 190.00, 0.20, true);
        Produto p4 = new Produto("Monitor Dell", 1250.00, 0.30, true);
        Produto p5 = new Produto("MacBook", 7990.00, 0.40, false);
        Produto p6 = new Produto("iPhone", 5990.00, 0.30, true);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Predicate<Produto> ProdutoComFreteGratisE30desconto = p -> p.desconto == 0.30 && p.freteGratis;
        Function<Produto, String> ProdutosOfertasEfreteGratis =
                p -> "APROVEITE!!! " +p.nome + " está em OFERTA DE 30% DE DESCONTO R$ "+p.preco+ "e frete Grátis";


        produtos.stream()
                .filter(ProdutoComFreteGratisE30desconto)
                .map(ProdutosOfertasEfreteGratis)
                .forEach(System.out::println);


    }
}
