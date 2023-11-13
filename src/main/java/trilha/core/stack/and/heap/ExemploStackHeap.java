package trilha.core.stack.and.heap;

public class ExemploStackHeap {
    public static void main(String[] args) {
        // Variável local (na stack)
        int x = 10;

        // Criação de um objeto no heap
        Pessoa pessoa1 = new Pessoa("João", 19);

        // Criação de outra referência na stack que aponta para o mesmo objeto no heap
        Pessoa pessoa2 = pessoa1;

        // Modificando o objeto no heap através de uma das referências
        pessoa1.setIdade(20);

        // Imprimindo o valor da variável local (na stack)
        System.out.println("Valor da variável x: " + x);

        // Imprimindo informações do objeto no heap
        System.out.println("Nome: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());

        // Imprimindo informações do objeto referenciado pela segunda variável
        System.out.println("Nome: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
    }
}



