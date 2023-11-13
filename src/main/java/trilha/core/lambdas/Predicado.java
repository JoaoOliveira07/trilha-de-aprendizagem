package lambdas;

import java.util.function.Predicate;

public class Predicado{
    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                produto -> (produto.preco * (1 - produto.desconto)) >= 750;


        Produto produto = new Produto("Notebook",7898.11,0.15);
        System.out.println(isCaro.test(produto));
    }
}
