package trilha.core.oop.encapsulation;

public class Homem {
    private String nome;
    private int idade;
    private double peso;
    private String numeroIdentidade;

    public Homem(String nome, int idade, double peso, String numeroIdentidade) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.numeroIdentidade = numeroIdentidade;
    }

    public String infomacoesHumano(){
        return  "O meu nome é " + nome+ ", tenho " + idade +" anos, atualmente peso " + peso + "kg, meu numero de identificação é "+ numeroIdentidade;
    }

    public String andar() {
        return nome + " está andando.";
    }

    public String falar(String mensagem) {
        return nome + " diz: " + mensagem;
    }
}
