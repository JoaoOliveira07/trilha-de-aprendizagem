package testeconhecimento;

import java.util.Scanner;

public class desafioModuloFundamentos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite primeiro numero: ");
        double num1 = in.nextDouble();

        System.out.println("Digite segundo numero: ");
        double num2 = in.nextDouble();

        System.out.println("Digite a expressão que deseja: ");
        String expressao = in.next();

        double resultado = "+".equals(expressao) ? num1 + num2 : 0;
        resultado = "-".equals(expressao) ? num1 - num2 : resultado;
        resultado = "*".equals(expressao) ? num1 * num2 : resultado;
        resultado = "/".equals(expressao) ? num1 / num2 : resultado;
        resultado = "%".equals(expressao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f",
                num1, expressao, num2, resultado);
        in.close();
    }
}
