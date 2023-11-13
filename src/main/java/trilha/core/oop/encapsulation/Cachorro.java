package trilha.core.oop.encapsulation;

public class Cachorro {
    private String nome;
    private int idade;
    private double peso;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public String infomacoesCachorro(){
        return  "O meu nome é " + nome+ ", tenho " + idade +" anos, atualmente peso " + peso + "kg, meu minha raça é "+ raca;
    }
    public String andar() {
        return nome + " está correndo.";
    }

    public String latir() {
        return nome + " está latindo.";
    }
}