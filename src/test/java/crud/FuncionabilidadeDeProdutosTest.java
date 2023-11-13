package crud;

import org.junit.jupiter.api.*;
import projetos.crudtests.ConectorComBanco;
import projetos.crudtests.FuncionabilidadeDeProdutos;
import projetos.crudtests.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FuncionabilidadeDeProdutosTest {
    FuncionabilidadeDeProdutos funcionabilidadeDeProdutos = new FuncionabilidadeDeProdutos();

    @BeforeEach
    public void beforeEach() throws SQLException {
        Connection connection = ConectorComBanco.getConexao();
        try {
            String select = "DELETE from produtos";
            PreparedStatement stmtSelect = connection.prepareStatement(select);
            stmtSelect.executeUpdate();
        } finally {
            connection.close();
        }
    }


    @Test
    public void deveCadastrarProduto() throws SQLException {
        Assertions.assertEquals(funcionabilidadeDeProdutos
                        .cadastrar(criarProdutoPadrao())
                , "Produto cadastrado com Sucesso!");
        List<Produto> produtos = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertEquals(1, produtos.size());
        Assertions.assertAll("Produto",
                () -> assertEquals("a", produtos.get(0).getNomeDoProduto()),
                () -> assertEquals(457.45, produtos.get(0).getValorDeCusto()),
                () -> assertEquals(592.45, produtos.get(0).getValorDeVenda()),
                () -> assertEquals(3, produtos.get(0).getQuantidadeDeEstoque())
        );
    }

    @Test
    public void deveExcluirProduto() throws SQLException {
        Assertions.assertEquals(funcionabilidadeDeProdutos
                .cadastrar(criarProdutoPadrao()), "Produto cadastrado com Sucesso!");
        List<Produto> produtos = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertEquals(1, produtos.size());
        Assertions.assertEquals(funcionabilidadeDeProdutos.excluir("a"), "Produto excluida com sucesso!");
        produtos = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertEquals(0, produtos.size());
    }

    @Test
    public void nãoEncontrarProdutoParaExcluir() throws SQLException {
        Assertions.assertEquals(funcionabilidadeDeProdutos
                .cadastrar(criarProdutoPadrao()), "Produto cadastrado com Sucesso!");
        List<Produto> produtos = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertEquals(1, produtos.size());
        Assertions.assertEquals(funcionabilidadeDeProdutos.excluir("a"), "Produto excluida com sucesso!");
        Assertions.assertEquals(funcionabilidadeDeProdutos.excluir("a"), "Produto não encontrado!");
        produtos = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertEquals(0, produtos.size());
    }

    @Test
    public void trazerRelacaoDosProdutos() throws SQLException {
        Assertions.assertEquals(funcionabilidadeDeProdutos
                .cadastrar(criarProdutoPadrao()), "Produto cadastrado com Sucesso!");
        List<Produto> produtos = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertFalse(produtos.isEmpty());
        Assertions.assertEquals(1, produtos.size());
    }

    @Test
    public void alterarProduto() throws SQLException {
        Assertions.assertEquals(funcionabilidadeDeProdutos
                        .cadastrar(criarProdutoPadrao())
                , "Produto cadastrado com Sucesso!");
        List<Produto> produtos = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertEquals(1, produtos.size());
        Assertions.assertAll("Produto",
                () -> assertEquals("a", produtos.get(0).getNomeDoProduto()),
                () -> assertEquals(457.45, produtos.get(0).getValorDeCusto()),
                () -> assertEquals(592.45, produtos.get(0).getValorDeVenda()),
                () -> assertEquals(3, produtos.get(0).getQuantidadeDeEstoque())
        );
        Produto produtoAlterado = produtos.get(0);
        produtoAlterado.setNomeDoProduto("b");
        produtoAlterado.setValorDeCusto(459.45);
        produtoAlterado.setValorDeVenda(569.45);
        produtoAlterado.setQuantidadeDeEstoque(6);
        Assertions.assertEquals(funcionabilidadeDeProdutos
                .alterar(produtoAlterado), "Produto alterado com sucesso!");

        List<Produto> produtosAlterados = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertAll("Produto",
                () -> assertEquals("b", produtosAlterados.get(0).getNomeDoProduto()),
                () -> assertEquals(459.45, produtosAlterados.get(0).getValorDeCusto()),
                () -> assertEquals(569.45, produtosAlterados.get(0).getValorDeVenda()),
                () -> assertEquals(6, produtosAlterados.get(0).getQuantidadeDeEstoque())
        );
    }

    @Test
    public void alterarProdutoNaoEncontrado() throws SQLException {
        Assertions.assertEquals(funcionabilidadeDeProdutos
                        .cadastrar(criarProdutoPadrao())
                , "Produto cadastrado com Sucesso!");
        List<Produto> produtos = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertEquals(1, produtos.size());
        Assertions.assertAll("Produto",
                () -> assertEquals("a", produtos.get(0).getNomeDoProduto()),
                () -> assertEquals(457.45, produtos.get(0).getValorDeCusto()),
                () -> assertEquals(592.45, produtos.get(0).getValorDeVenda()),
                () -> assertEquals(3, produtos.get(0).getQuantidadeDeEstoque())
        );
        Produto produtoAlterado = produtos.get(0);
        produtoAlterado.setNomeDoProduto("b");
        produtoAlterado.setValorDeCusto(459.45);
        produtoAlterado.setValorDeVenda(569.45);
        produtoAlterado.setQuantidadeDeEstoque(6);
        Assertions.assertEquals(funcionabilidadeDeProdutos
                .alterar(produtoAlterado), "Produto alterado com sucesso!");

        List<Produto> produtosAlterados = FuncionabilidadeDeProdutos.consultar();
        Assertions.assertAll("Produto",
                () -> assertEquals("b", produtosAlterados.get(0).getNomeDoProduto()),
                () -> assertEquals(459.45, produtosAlterados.get(0).getValorDeCusto()),
                () -> assertEquals(569.45, produtosAlterados.get(0).getValorDeVenda()),
                () -> assertEquals(6, produtosAlterados.get(0).getQuantidadeDeEstoque())
        );
        Assertions.assertEquals(funcionabilidadeDeProdutos.excluir("b"), "Produto excluida com sucesso!");
        Assertions.assertEquals(funcionabilidadeDeProdutos.alterar(produtoAlterado), "Produto não encontrado com o código informado.");
    }

    private Produto criarProdutoPadrao() {
        return new Produto("a", 457.45, 592.45, 3);
    }

}