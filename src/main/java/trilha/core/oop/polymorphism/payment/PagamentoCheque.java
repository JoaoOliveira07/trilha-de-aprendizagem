package trilha.core.oop.polymorphism.payment;

public class PagamentoCheque extends Pagamento{
    public PagamentoCheque(double valor){
        super(valor);
        aplicarAcrescimo(2);
    }
}
