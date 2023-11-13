package trilha.core.expressions.and.controlflow;

public class ExampleNumber1 {
    public static void main(String[] args) {
        //Exemplo de expressões
        String nome = "João";
        int x = 1;
        int soma = 5 + 3;          // Expressão de adição
        boolean condicao = x > 10; // Expressão de comparação
        String mensagem = "Olá, " + nome; // Concatenação de strings
        System.out.println(mensagem + " " + condicao + " " + soma);

        //Exemplo de Controles de FLuxos
        int idade = 17;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        //Exemplo de estruturas de repetição
        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
        }

    }

}

