package projetos.crudorigin;

import java.sql.SQLException;
import java.util.Scanner;

public class InterfaceDoCliente {
    public static void main(String[] args) throws SQLException {
       opcoes();

    }

    private static void opcoes() throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEscolha uma das opções abaixo: ");
        System.out.println("1- Cadastro de Produtos\n" +
                "2- Consultar Produtos\n" +
                "3- Alterar Produtos\n" +
                "4- Excluir Produtos\n ");
        int opcaoSelecionada = in.nextInt();


        OperacoesProdutos op = new OperacoesProdutos();
        switch (opcaoSelecionada) {
            case 1:
                op.cadastrar();
                break;
            case 2:
                op.consultar();
                break;
            case 3:
                op.alterar();
                break;
            case 4:
                op.excluir();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Você não selecionou nenhuma das opções.");
        }

        opcoes();
    }
}
