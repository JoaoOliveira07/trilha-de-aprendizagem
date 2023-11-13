package testeconhecimento;

import java.util.Scanner;

public class Inferencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o primeiro salário: ");
        String valor1 = in.next().replace(",", ".");
        System.out.println("Informe o segundo salário: ");
        String valor2 = in.next().replace(",", ".");
        System.out.println("Informe o terceiro salário: ");
        String valor3 = in.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média dos salários é " + media);

        in.close();
    }
}
