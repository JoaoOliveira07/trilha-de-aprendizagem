package testeconhecimento;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorMaximo = 1000;
        int valorMinimo = 0;
        int i = 1;
        int meio = valorMaximo / 2;

        System.out.print("Digite um numero inteiro: ");
        int valor = in.nextInt();

        while (i < 9) {
            if (valor > meio) { // X > 50, sim
                valorMinimo = meio; //VALOR MINIMO 50
                System.out.println("O numero está entre " + valorMinimo + " e " + valorMaximo); // 50 E 100
                meio = (valorMaximo + valorMinimo) / 2;
            }if (valor == meio){
                System.out.println("Valor achado: " + meio);
                break;
            }
            else{
                if (valor < meio){
                    valorMaximo = meio;
                    System.out.println("O numero está entre " + valorMinimo + " e " + valorMaximo); // 50 E 100
                    meio = (valorMaximo + valorMinimo) / 2;
                }
            }

            System.out.println("Contagem: " + (i++));
        }
    }
}


//GERAR UM NUMERO ALEATORIO ENTRE 0 A 1000
//Criar um While que valida se o numero aleatorio for achado
//Divide o valor total e compara se é maior ou igual a 500
