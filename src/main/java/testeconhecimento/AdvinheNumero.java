package testeconhecimento;

import java.util.Scanner;

public class AdvinheNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Você tem 10 tentativas");

        int numAleatorio = 51;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número de 0 a 100:");
            int valor = in.nextInt();
            if (valor == numAleatorio) {
                System.out.println("Você acertou");
                break;
            } else if(valor < numAleatorio){
                System.out.println("Número é maior que "+valor);
                System.out.println("Tentativas " + i);
            }else {
                System.out.println("Número é menor que "+valor);
                System.out.println("Tentativas " + i);
            }
        }
    }
}
//Precisa ordenar
//Validar se é maior ou menor e ir dividindo a lista em 2,