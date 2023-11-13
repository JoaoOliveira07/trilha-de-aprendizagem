package testeconhecimento;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite primeira nota: ");
        double n1 = in.nextDouble();
        System.out.println("Digite primeira nota: ");
        double n2 = in.nextDouble();

        double soma = (n1 + n2) / 2;

        if (soma <= 10 && soma >= 7 && n1 <= 10 && n1 >= 0 && n2 <= 10 && n2 >= 0){
            System.out.println("Aprovado, média " +soma);
        } else if (soma < 7 && soma >=4 && n1 <= 10 && n1 >= 0 && n2 <= 10 && n2 >= 0) {
            System.out.println("Recuperação, média " +soma);
        }else if (soma < 4 && soma >= 0 && n1 <= 10 && n1 >= 0 && n2 <= 10 && n2 >= 0){
            System.out.println("Reprovado, média " +soma);
        } else {
            System.out.println("Nota inválida");
        }
    }

}
