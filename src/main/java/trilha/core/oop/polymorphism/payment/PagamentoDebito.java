package trilha.core.oop.polymorphism.payment;


public class PagamentoDebito extends Pagamento{
    public PagamentoDebito(double valor){
        super(valor);
        aplicarDesconto(5);
    }
}
