package testeconhecimento;

import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = in.nextDouble();

        System.out.println("Digite sua altura");
        double altura = in.nextDouble();

        double resultado = peso / (altura * altura);

        System.out.println("Seu imc é: " + resultado);
    }
}
