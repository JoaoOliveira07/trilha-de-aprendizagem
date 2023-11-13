package projetos.crudtests;

public class Produto {
    private int codigoDoProduto;
    private String nomeDoProduto;
    private double valorDeCusto;
    private double valorDeVenda;
    private int quantidadeDeEstoque;

    public Produto(int codigoDoProduto, String nomeDoProduto, double valorDeCusto, double valorDeVenda, int quantidadeDeEstoque) {
        this.codigoDoProduto = codigoDoProduto;
        this.nomeDoProduto = nomeDoProduto;
        this.valorDeCusto = valorDeCusto;
        this.valorDeVenda = valorDeVenda;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }
    public Produto(String nomeDoProduto, double valorDeCusto, double valorDeVenda, int quantidadeDeEstoque) {
        this.nomeDoProduto = nomeDoProduto;
        this.valorDeCusto = valorDeCusto;
        this.valorDeVenda = valorDeVenda;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(double valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public int getQuantidadeDeEstoque() {
        return quantidadeDeEstoque;
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }
}

