package trilha.core.oop.abstraction;

public class ContaSalario extends Conta {
    public ContaSalario(String nome, int numero, double saldo, double limite) {
        this.setNome(nome);
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setLimite(limite);
    }
}
