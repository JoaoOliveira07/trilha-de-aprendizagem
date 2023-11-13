package trilha.core.oop.abstraction;


public class TesteAnimal{
    public static void main(String[] args) {
        // Crie uma instância de Cachorro
        Gato meuGato = new Gato();
        Cachorro meuCachorro = new Cachorro();

        // Chame o método fazerBarulho do Cachorro
        meuGato.fazerBarulho();
        meuGato.andar();
        meuCachorro.fazerBarulho();
        meuCachorro.andar();
    }
}

