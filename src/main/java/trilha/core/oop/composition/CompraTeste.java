package trilha.core.oop.composition;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.cliente = "João Pedro";
        compra.adicionarItem(new Item("Caneta",20,7.47));
        compra.adicionarItem(new Item("Borracha",13,5.49));
        compra.adicionarItem(new Item("Caderno",3,15.49));

        System.out.println("Quantidades de itens comprado: "+compra.itens.size());
        System.out.println("Valor total da compra: R$"+ compra.obterValorTotal());
    }
}
