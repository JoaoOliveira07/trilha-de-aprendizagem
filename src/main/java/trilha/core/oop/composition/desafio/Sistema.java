package trilha.core.oop.composition.desafio;

public class Sistema {
    public static void main(String[] args) {

        Compra compra = new Compra();
        compra.adicionarItem("Caneta", 9.57, 100);
        compra.adicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 7.80, 10);
        compra2.adicionarItem(new Produto("Impressora", 878.90), 1);

        Cliente cliente = new Cliente("Maria Julia MOraes");
        cliente.compras.add(compra);
        cliente.compras.add(compra2);

        System.out.println("Valor total gasto: " + cliente.obterValorTotal());
    }
}
