package trilha.core.oop.polymorphism.payment;

public class PagamentoBoleto extends Pagamento{
    public PagamentoBoleto(double valor){

        super(valor);
        aplicarAcrescimo(1);
    }
}
