package trilha.core.oop.polymorphism.payment;


public class PagamentoDinheiro extends Pagamento{
    public PagamentoDinheiro(double valor){
        super(valor);
        aplicarDesconto(6);
    }
}
