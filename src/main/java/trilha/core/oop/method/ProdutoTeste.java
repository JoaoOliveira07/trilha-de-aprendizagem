package trilha.core.oop.method;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook",7809.49);

        var p2 = new Produto("Carregador",78.59);
        p2.nome = "Caneta Big";
        p2.preco = 29.99;

        Produto.desconto = 0.29;

        System.out.println(p1.nome + " valor R$" + p1.precoComDesconto());
        System.out.println(p2.nome + " valor R$" + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.",mediaCarrinho);
    }
}
