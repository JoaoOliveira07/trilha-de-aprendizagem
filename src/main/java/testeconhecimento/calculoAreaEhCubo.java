package testeconhecimento;

import java.util.Scanner;

public class calculoAreaEhCubo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do Triângulo: ");
        double base = in.nextDouble();

        System.out.println("Digite o tamanho da altura do Triângulo: ");
        double altura = in.nextDouble();

        double resultado = (base * altura) / 2;

        System.out.println("Digite um valor: ");
        double valor = in.nextDouble();

        double cuboValor = Math.pow(valor, 3);
        double quadradoValor = Math.pow(valor, 2);
        System.out.println("Valor elevado ao Cubo "+cuboValor+", e o valor elevado Quadrado "+quadradoValor);
        System.out.println("A área do Triângulo é: " +resultado );

    }
}
