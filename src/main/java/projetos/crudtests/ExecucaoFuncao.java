package projetos.crudtests;

import java.sql.SQLException;
import java.util.Scanner;

public class ExecucaoFuncao {
    public static void main(String[] args) throws SQLException {
        opcoes();
    }
    private static void opcoes() throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEscolha uma das opções abaixo: ");
        System.out.println("1- Cadastro de Produtos\n" +
                "2- Consultar Produtos\n" +
                "3- Alterar Produtos\n" +
                "4- Excluir Produtos\n" +
                "5- Sair");
        int opcaoSelecionada = in.nextInt();

        FuncionabilidadeDeProdutos funcionabilidadeDeProdutos = new FuncionabilidadeDeProdutos();
        switch (opcaoSelecionada) {
            case 1:
                funcionabilidadeDeProdutos.cadastrar(new Produto("a",457.45,678.45,3));
                break;
            case 2:
                FuncionabilidadeDeProdutos.consultar();
                break;
            case 3:
                funcionabilidadeDeProdutos.alterar(new Produto("b",459.45,688.45,5));
                break;
            case 4:
                funcionabilidadeDeProdutos.excluir("a");
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

