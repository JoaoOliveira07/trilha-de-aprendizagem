package trilha.core.oop.abstraction;

public class ContaCorrente extends Conta {
    // Adicione um construtor se necessário
    public ContaCorrente(String nome, int numero, double saldo, double limite) {
        this.setNome(nome);
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setLimite(limite);
    }

}
