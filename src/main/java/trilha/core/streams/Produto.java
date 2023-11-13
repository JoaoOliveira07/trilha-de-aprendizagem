package trilha.core.streams;

public class Produto {
    String nome;

    double preco;
    double desconto;
    boolean freteGratis;

    public Produto(String nome, double preco, double desconto, boolean freteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.freteGratis = freteGratis;

    }
}
