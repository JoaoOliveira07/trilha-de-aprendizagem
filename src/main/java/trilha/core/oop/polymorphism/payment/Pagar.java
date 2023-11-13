package trilha.core.oop.polymorphism.payment;

public class Pagar {
    public static void main(String[] args) {
        Pagamento pg1 = new PagamentoBoleto(250); //Boleto 1% acrescimo
        Pagamento pg2 = new PagamentoCheque(250); //Cheque 2% acrescimo
        Pagamento pg3 = new PagamentoCredito(250); //2% de desconto
        Pagamento pg4 = new PagamentoDebito(250); //5% De desconto
        Pagamento pg5 = new PagamentoDinheiro(250); // 6% de desconto

        System.out.println("Pagamento Total seria de R$" + pg1.getValorPadrao() + ", com acréscimo de 1%, ficando no valor Total de : R$" + pg1.getValor());
        System.out.println("Pagamento Total seria de R$" + pg2.getValorPadrao() + ", com acréscimo de 2%, ficando no valor Total de : R$" + pg2.getValor());
        System.out.println("Pagamento Total seria de R$" + pg3.getValorPadrao() + ", com desconto de 2%, ficando no valor Total de : R$" + pg3.getValor());
        System.out.println("Pagamento Total seria de R$" + pg4.getValorPadrao() + ", com desconto de 5%, ficando no valor Total de : R$" + pg4.getValor());
        System.out.println("Pagamento Total seria de R$" + pg5.getValorPadrao() + ", com desconto de 7%, ficando no valor Total de : R$" + pg5.getValor());
    }
}
