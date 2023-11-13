package trilha.core.datastructures.versaotwo;

import java.util.Scanner;

public class TheArrayDesafio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantidades de notas: ");
        int qtdeNotas = in.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = in.nextDouble();
        }

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }

        System.out.println("A média é " + total / notas.length);
    }
}
