package trilha.core.oop.polymorphism.payment;


public class PagamentoCredito extends Pagamento{
    public PagamentoCredito(double valor){
        super(valor);
        aplicarDesconto(2);
    }
}
