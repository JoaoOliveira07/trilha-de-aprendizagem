package trilha.core.datastructures.caixaeletronico;
//Ver como criar com Array 2D, sendo o primeiro a array a cedula e o segundo é a quantidade de notas

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        Scanner in = new Scanner(System.in);
        System.out.println("Limite para saque no caixa R$5.000,00" + "\n" + "Digite o valor que deseja sacar:");
        if (in.hasNextInt()) { // Verifica se o próximo token é um número inteiro
            int valor = in.nextInt();
            int valorOriginal = valor;

            if (validarValor(valor)) {
                System.out.println("Valor não é válido.");
            } else {
                RecebeNotas recebeNotas = caixaEletronico.calcularNotas(valor);
                if (recebeNotas.valor == 1) {
                    valor = valorOriginal - 4;
                    recebeNotas = caixaEletronico.calcularNotas(valor);
                    recebeNotas.notas2 = recebeNotas.notas2 + 2;
                }
                if (valor == 3) {
                    valor = valorOriginal - 6;
                    recebeNotas = caixaEletronico.calcularNotas(valor);
                    recebeNotas.notas2 = recebeNotas.notas2 + 3;
                }
                System.out.println("Notas sacadas:");
                if (recebeNotas.notas200 > 0) {
                    System.out.println(recebeNotas.notas200 + " notas de R$200,00");
                }
                if (recebeNotas.notas100 > 0) {
                    System.out.println(recebeNotas.notas100 + " notas de R$100,00");
                }
                if (recebeNotas.notas50 > 0) {
                    System.out.println(recebeNotas.notas50 + " notas de R$50,00");
                }
                if (recebeNotas.notas20 > 0) {
                    System.out.println(recebeNotas.notas20 + " notas de R$20,00");
                }
                if (recebeNotas.notas10 > 0) {
                    System.out.println(recebeNotas.notas10 + " notas de R$10,00");
                }
                if (recebeNotas.notas5 > 0) {
                    System.out.println(recebeNotas.notas5 + " notas de R$5,00");
                }
                if (recebeNotas.notas2 > 0) {
                    System.out.println(recebeNotas.notas2 + " notas de R$2,00");
                }
            }
        } else {
            System.out.println("Valor não é válido.");
        }
    }

    public RecebeNotas calcularNotas(int valor) { //Metodo da classe
        int notas200 = valor / 200;
        valor = valor % 200;
        int notas100 = valor / 100;
        valor = valor % 100;
        int notas50 = valor / 50;
        valor = valor % 50;
        int notas20 = valor / 20;
        valor = valor % 20;
        int notas10 = valor / 10;
        valor = valor % 10;
        int notas5 = valor / 5;
        valor = valor % 5;
        int notas2 = valor / 2;
        valor = valor % 2;
        return new RecebeNotas(notas200, notas100, notas50, notas20, notas10, notas5, notas2, valor);
    }

    public static boolean validarValor(int valor) {
        return valor <= 0 || valor == 1 || valor == 3 || valor > 5000;
    }
}
