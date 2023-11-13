package trilha.core.datastructures.versaotwo;

import java.util.Scanner;

public class TheArray2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdeAlunos = in.nextInt();

        System.out.println("Quantas notas por alunos? ");
        int qtdeNotas = in.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", j +1, i +1);
                notasDaTurma[i][j] = in.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é " + media);
        in.close();
    }
}
