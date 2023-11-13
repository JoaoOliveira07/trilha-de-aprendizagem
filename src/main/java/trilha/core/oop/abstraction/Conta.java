package trilha.core.oop.abstraction;

public abstract class Conta { //ENTIDADE

    //CARACTERISTICAS
    private String nome;
    private int numero;
    private double saldo;
    private double limite;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    //AÇÕES
    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("O valor não foi possivel" +
                    " depositar pois é negativo");
        }
    }

    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Não é possivel sacar, pois seu saque é maior que seu saldo");
        } else if (valor > 0 && valor <= 500) {
            this.saldo -= valor;
        } else if (valor > 500) {
            System.out.println("O valor não pode ser sacado pois passou " +
                    "do limite");
        } else {
            System.out.println("O valor não pode ser sacado pois não é" +
                    " possível sacar negativo");
        }
    }

    void imprimeExtrato() {

           System.out.println("Saldo: R$" + this.saldo + "\n");
        }
}