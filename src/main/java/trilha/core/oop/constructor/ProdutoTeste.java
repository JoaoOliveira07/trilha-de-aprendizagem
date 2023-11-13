package trilha.core.oop.constructor;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook",4356.89,0.25);

        Produto p3 = new Produto("Impressora",5984.89);

        Produto p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p3.nome);


        double precoFinal3 = p3.precoComDesconto(0.2);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal3 + precoFinal2) / 3;

        System.out.printf("Média do carrinho = R$%.2f.",mediaCarrinho);
    }


}
