package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.50,0.10);
        imprimir.accept(p1);
        Produto p2 = new Produto("Notebook", 2872.50,0.20);
        Produto p3 = new Produto("Caderno", 19.50,0.10);
        Produto p4 = new Produto("Lapis", 7.60,0.10);
        Produto p5 = new Produto("Borracha", 4.50,0.10);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
