package trilha.core.oop.encapsulation;

public class Main{
    public static void main(String[] args) {

    // Criando instâncias de Homem e Cachorro
    Homem homem = new Homem("João", 30, 70.5, "12345");
    Cachorro cachorro = new Cachorro("Rex", 5, 15.0, "Labrador");

// Usando os métodos públicos
    System.out.println(homem.infomacoesHumano());
    System.out.println(homem.falar("Olá"));
    System.out.println(homem.andar()); // Saída: João está andando.
    System.out.println(cachorro.infomacoesCachorro());
    System.out.println(cachorro.latir());
    System.out.println(cachorro.andar()); // Saída: Rex está latindo.
    }
}
