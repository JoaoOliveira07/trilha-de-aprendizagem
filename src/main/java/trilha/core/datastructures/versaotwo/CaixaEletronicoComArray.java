package trilha.core.datastructures.versaotwo;


import trilha.core.datastructures.caixaeletronico.RecebeNotas;

import java.util.Scanner;

public class CaixaEletronicoComArray {
    public static void main(String[] args) {
        CaixaEletronicoComArray caixaEletronicoComArray = new CaixaEletronicoComArray();
        Scanner in = new Scanner(System.in);
        int[] notas = {200, 100, 50, 20, 10, 5, 2};
        int[] quantidade = {5, 13, 26, 30, 35, 60, 100};
        int valorDeposito = 0;

        System.out.println("Seja bem-vindo ao Caixa Eletrônico.");
        System.out.print("Temos as seguintes opções: \n1 - Sacar \n2 - Depositar\n");
        int numeroDigitado = in.nextInt();

        switch (numeroDigitado) {
            case 1:
                System.out.println("Notas Disponiveis: ");
                if (numeroDigitado == 1) {
                    for (int i = 0; i < 7; i++) {
                        System.out.println("Quantidades de notas no caixa: " + quantidade[i] + " de R$" + notas[i] + ",00");
                    }
                }
                System.out.print("\nLimite para saque no caixa R$5.000,00" + "\n" + "Digite o valor que deseja sacar: R$");
                if (in.hasNextInt()) {
                    int valor = in.nextInt();
                    int valorOriginal = valor;

                    if (validarValor(valor)) {
                        System.out.println("Valor não é válido.");
                    } else {
                        RecebeNotas recebeNotas = caixaEletronicoComArray.calcularNotas(valor, notas, quantidade);
                        if (recebeNotas.valor == 1) {
                            valor = valorOriginal - 4;
                            recebeNotas = caixaEletronicoComArray.calcularNotas(valor, notas, quantidade);
                            recebeNotas.notas2 = recebeNotas.notas2 + 2;
                        }
                        if (valor == 3) {
                            valor = valorOriginal - 6;
                            recebeNotas = caixaEletronicoComArray.calcularNotas(valor, notas, quantidade);
                            recebeNotas.notas2 = recebeNotas.notas2 + 3;
                        }
                        System.out.println("Notas sacadas:");
                        if (!verificarQuantidadeNotasSuficientes(notas, quantidade, valor)) {
                            System.out.println();
                        }

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
                break;
            case 2:
                if (numeroDigitado == 2) {
                    System.out.print("Digite o valor que deseja depositar: R$");
                    valorDeposito = in.nextInt();
                }
                if (valorDeposito < 10) {
                    System.out.println("Depósito inválido, para depositar o valor deve ser maior ou equivalente a R$10,00");
                } else {
                    if (valorDeposito > 0) {
                        System.out.println("Seu depósito foi de R$" + valorDeposito + ",00");
                    }
                }
                break;
            default:
                if (numeroDigitado != 1 && numeroDigitado != 2) {
                    System.out.println("Opção inválida.");
                }
        }
    }

    public RecebeNotas calcularNotas(int valor, int[] notas, int[] quantidade) {
        int[] notasRetiradas = new int[notas.length];
        int valorRestante = valor;

        for (int i = 0; i < notas.length; i++) {
            if (quantidade[i] > 0 && valorRestante >= notas[i]) {
                int maxNotas = Math.min(quantidade[i], valorRestante / notas[i]);
                notasRetiradas[i] = maxNotas;
                valorRestante -= maxNotas * notas[i];
            }
        }

        if (valorRestante == 0) {
            // O saque foi bem-sucedido
            for (int i = 0; i < notas.length; i++) {
                quantidade[i] -= notasRetiradas[i];
            }
            return new RecebeNotas(notasRetiradas[0], notasRetiradas[1], notasRetiradas[2], notasRetiradas[3],
                    notasRetiradas[4], notasRetiradas[5], notasRetiradas[6], valorRestante);
        } else {
            // Não há notas suficientes para o saque
            return new RecebeNotas(0, 0, 0, 0, 0, 0, 0, valorRestante);
        }
    }


    public static boolean validarValor(int valor) {
        return valor <= 0 || valor == 1 || valor == 3 || valor > 5000;
    }

    public static boolean verificarQuantidadeNotasSuficientes(int[] notas, int[] quantidade, int valor) {
        for (int i = 0; i < notas.length; i++) {
            if (valor >= notas[i]) {
                int notasNecessarias = valor / notas[i];
                if (notasNecessarias > quantidade[i]) {
                    return false; // Não há notas suficientes desta denominação.
                }
                valor %= notas[i];
            }
        }
        return valor == 0; // Todas as denominações necessárias estão disponíveis.
    }

}


