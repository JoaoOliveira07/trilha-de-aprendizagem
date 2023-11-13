package projetos.crudorigin;


import trilha.databases.FabricaConexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacoesProdutos {
    public void cadastrar() throws SQLException {
        Scanner in = new Scanner(System.in);

        System.out.println("Opção de cadastro de produtos selecionado:");

        System.out.println("Informe o nome do produto:");
        String nomeDoProduto = in.nextLine();
        System.out.println("Informe o valor de custo:");
        double valorDoCusto = in.nextDouble();
        System.out.println("Informe o valor de venda:");
        double valorDeVenda = in.nextDouble();
        System.out.println("Informe a quantidade de produtos:");
        int quantidadeDeEstoque = in.nextInt();

        Connection conexao = ConectorComBanco.getConexao();

        String sql = "INSERT INTO produtos (nomedoproduto, valordecusto, valordevenda, quantidadedeestoque) VALUES (?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomeDoProduto);
        stmt.setDouble(2, valorDoCusto);
        stmt.setDouble(3, valorDeVenda);
        stmt.setInt(4, quantidadeDeEstoque);

        stmt.execute();

        System.out.println("Produto cadastrado com Sucesso!");
        in.close();
    }

    public void excluir() throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("Opção de exclusão de produtos selecionada:");

        System.out.println("Informe o código do Produtos: ");
        int codigoDoProduto = in.nextInt();

        Connection conexao = ConectorComBanco.getConexao();
        String sql = "DELETE FROM produtos WHERE codigodoproduto = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigoDoProduto);

        if (stmt.executeUpdate() > 0){
            System.out.println("Produto excluida com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }

        conexao.close();
        in.close();

    }


    public void alterar() {
        Scanner in = new Scanner(System.in);

        System.out.println("Opção de alteração de produtos selecionada:");
        System.out.println("Informe o código do produto: ");
        int codigoDoProduto = in.nextInt();

        Connection connection = ConectorComBanco.getConexao();

        try {
            String select = "SELECT * FROM produtos WHERE codigodoproduto = ?";
            PreparedStatement stmtSelect = connection.prepareStatement(select);
            stmtSelect.setInt(1, codigoDoProduto);
            ResultSet resultado = stmtSelect.executeQuery();

            if (resultado.next()) {
                Produto p = new Produto(resultado.getInt(1), resultado.getString(2),
                        resultado.getDouble(3), resultado.getDouble(4), resultado.getInt(5));

                System.out.println("Digite o que deseja alterar:\n" +
                        "1- Nome do Produto\n" +
                        "2- Valor de Custo\n" +
                        "3- Valor de Venda\n" +
                        "4- Quantidade em Estoque");

                int qualCaracteristicaDesejaTrocar = in.nextInt();
                in.nextLine(); // Consume the newline character

                if (qualCaracteristicaDesejaTrocar == 1) {
                    System.out.println("O nome do produto atual é " + p.getNomeDoProduto());
                    System.out.println("Informe o novo nome: ");
                    String novoNomeDoProduto = in.nextLine();
                    p.setNomeDoProduto(novoNomeDoProduto);
                } else if (qualCaracteristicaDesejaTrocar == 2) {
                    System.out.println("O valor de custo atual é " + p.getValorDeCusto());
                    System.out.println("Informe o novo valor de custo: ");
                    double novoPrecoCDoProduto = in.nextDouble();
                    p.setValorDeCusto(novoPrecoCDoProduto);
                } else if (qualCaracteristicaDesejaTrocar == 3) {
                    System.out.println("O valor de venda atual é " + p.getValorDeVenda());
                    System.out.println("Informe o novo valor de venda: ");
                    double novoPrecoVDoProduto = in.nextDouble();
                    p.setValorDeVenda(novoPrecoVDoProduto);
                } else if (qualCaracteristicaDesejaTrocar == 4) {
                    System.out.println("A quantidade em estoque atual é " + p.getQuantidadeDeEstoque());
                    System.out.println("Informe a nova quantidade em estoque: ");
                    int novoQntdEstDoProduto = in.nextInt();
                    p.setQuantidadeDeEstoque(novoQntdEstDoProduto);
                }

                // Atualiza o produto no banco de dados
                String update = "UPDATE produtos SET nomedoproduto = ?, valordecusto = ?, valordevenda = ?, quantidadedeestoque = ? WHERE codigodoproduto = ?";
                PreparedStatement stmtUpdate = connection.prepareStatement(update);
                stmtUpdate.setString(1, p.getNomeDoProduto());
                stmtUpdate.setDouble(2, p.getValorDeCusto());
                stmtUpdate.setDouble(3, p.getValorDeVenda());
                stmtUpdate.setInt(4, p.getQuantidadeDeEstoque());
                stmtUpdate.setInt(5, codigoDoProduto);
                stmtUpdate.executeUpdate();

                System.out.println("Produto alterado com sucesso!");
            } else {
                System.out.println("Produto não encontrado com o código informado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close(); // Fecha o scanner
        }
    }

    public void consultar() throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        String sql = "select *  from produtos";

        Statement stmt = connection.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Produto> produtos = new ArrayList<>();

        System.out.println("Opção de consulta de produtos selecionada:");

        while (resultado.next()) {
            int codigo = resultado.getInt("codigodoproduto");
            String nome = resultado.getString("nomedoproduto");
            double valorC = resultado.getInt("valordecusto");
            double valorV = resultado.getInt("valordevenda");
            int quantidadeEst = resultado.getInt("quantidadedeestoque");

            produtos.add(new Produto(codigo, nome, valorC, valorV, quantidadeEst));
        }

        for (Produto p : produtos) {
            System.out.println(p.getCodigoDoProduto() + " | " + p.getNomeDoProduto() + " | " + p.getValorDeCusto()
                    + " | " + p.getValorDeVenda() + " | " + p.getQuantidadeDeEstoque());
        }
        stmt.close();
        connection.close();
    }
}
