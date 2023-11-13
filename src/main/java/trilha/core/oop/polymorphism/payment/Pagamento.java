package trilha.core.oop.polymorphism.payment;

public class Pagamento {
    private double valor;
    private double valorPadrao;
    // Campo para armazenar o valor padrão

    public Pagamento(double valor) {
        this.valor = valor;
        this.valorPadrao = valor; // Armazena o valor padrão
    }

    public double getValor() {
        return valor;
    }

    public double getValorPadrao() {
        return valorPadrao;
    }

    // Método para aplicar acréscimo
    public void aplicarAcrescimo(double percentual) {
        valor = valorPadrao * (1 + percentual / 100);
    }

    // Método para aplicar desconto
    public void aplicarDesconto(double percentual) {
        valor = valorPadrao * (1 - percentual / 100);
    }
}