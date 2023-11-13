package trilha.core.oop.constructor;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial, double precoInicial, double descontoInicial){//Definindo parametro para o construtor
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }
    Produto(String nomeInicial, double precoInicial){//Definindo parametro para o construtor
        nome = nomeInicial;
        preco = precoInicial;
    }
    Produto(){

    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
