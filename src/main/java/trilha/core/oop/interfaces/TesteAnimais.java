package trilha.core.oop.interfaces;

public class TesteAnimais  {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.fazerSom();
        cachorro.mover();
        gato.fazerSom();
        gato.mover();
    }
}
