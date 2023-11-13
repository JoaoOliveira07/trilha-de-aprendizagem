package testeconhecimento;

public class Main {
    public static void main(String[] args) {
        Metodo.jogar("Hugo");
        lerLivros("Julia");
        falarMuito();
        jogarVideoGame("Bruna");

    }
    public static String lerLivros(String nome){
    System.out.println(nome + ", Gosta de Ler");
    return nome;
    }

    public static void falarMuito(){
        System.out.println("Gosta de Falar com pessoas novas");
    }

    public static void jogarVideoGame(String nome){
        System.out.println(nome +", Gosta de jogar Video-Games");
    }

}


//Metodo falar
//Metodo ler
//Metodo jogar
