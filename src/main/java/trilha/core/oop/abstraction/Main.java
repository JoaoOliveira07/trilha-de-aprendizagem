package trilha.core.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        // Crie uma instância da classe ContaCorrente
        ContaCorrente minhaConta = new ContaCorrente("João",12345, 1000.0,500.0);
        ContaSalario minhaConta1 = new ContaSalario("Ana", 15798, 1500.0, 500.0);
        // Faça operações na conta
        System.out.println("Seja bem-vindo "+ minhaConta.getNome() +", o numero da sua conta é: " + minhaConta.getNumero());
        System.out.println("Limite da sua conta é para saque é de: R$" + minhaConta.getLimite());
        minhaConta.depositar(150.0);
        minhaConta.sacar(240.0);

        // Imprima o extrato da conta
        minhaConta.imprimeExtrato();

        System.out.println("Seja bem-vindo "+ minhaConta1.getNome() +", o numero da sua conta é: " + minhaConta1.getNumero());
        System.out.println("Limite da sua conta é para saque é de: R$" + minhaConta1.getLimite());
        minhaConta1.depositar(-150.0);
        minhaConta1.sacar(510.0);

        // Imprima o extrato da conta
        minhaConta1.imprimeExtrato();
    }
}

