package projetos.crudtests;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionabilidadeDeProdutos {
    public Object cadastrar(Produto produto) throws SQLException {
        Connection conexao = ConectorComBanco.getConexao();
        String sql = "INSERT INTO produtos (nomedoproduto, valordecusto, valordevenda, quantidadedeestoque) VALUES (?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, produto.getNomeDoProduto());
        stmt.setDouble(2, produto.getValorDeCusto());
        stmt.setDouble(3, produto.getValorDeVenda());
        stmt.setInt(4, produto.getQuantidadeDeEstoque());
        stmt.execute();
        return "Produto cadastrado com Sucesso!";
    }

    public Object excluir(String nomeDoProduto) throws SQLException {
        Connection conexao = ConectorComBanco.getConexao();
        String sql = "DELETE FROM produtos WHERE nomedoproduto = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomeDoProduto);
        if (stmt.executeUpdate() > 0) {
            conexao.close();
            return "Produto excluida com sucesso!";
        } else {
            return "Produto não encontrado!";
        }
    }

    public Object alterar(Produto produto) {
        try {
            Connection connection = ConectorComBanco.getConexao();
            String select = "SELECT * FROM produtos WHERE codigodoproduto = ?";
            PreparedStatement stmtSelect = connection.prepareStatement(select);
            stmtSelect.setInt(1, produto.getCodigoDoProduto());
            ResultSet resultado = stmtSelect.executeQuery();
            if (resultado.next()) {
                String update = "UPDATE produtos SET nomedoproduto = ?, valordecusto = ?, valordevenda = ?, quantidadedeestoque = ? WHERE codigodoproduto = ?";
                PreparedStatement stmtUpdate = connection.prepareStatement(update);
                stmtUpdate.setString(1, produto.getNomeDoProduto());
                stmtUpdate.setDouble(2, produto.getValorDeCusto());
                stmtUpdate.setDouble(3, produto.getValorDeVenda());
                stmtUpdate.setInt(4, produto.getQuantidadeDeEstoque());
                stmtUpdate.setInt(5, produto.getCodigoDoProduto());
                stmtUpdate.executeUpdate();
                return "Produto alterado com sucesso!";
            } else {
                return ("Produto não encontrado com o código informado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public static List<Produto> consultar() throws SQLException {
        Connection connection = ConectorComBanco.getConexao();
        String sql = "select * from produtos";

        Statement stmt = connection.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Produto> produtos = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigodoproduto");
            String nome = resultado.getString("nomedoproduto");
            double valorC = resultado.getDouble("valordecusto");
            double valorV = resultado.getDouble("valordevenda");
            int quantidadeEst = resultado.getInt("quantidadedeestoque");

            produtos.add(new Produto(codigo, nome, valorC, valorV, quantidadeEst));
        }
        stmt.close();
        connection.close();
        return produtos;
    }
}
