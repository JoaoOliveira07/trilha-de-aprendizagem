package trilha.core.oop.abstraction;

public class Gato extends Animal{
    void fazerBarulho() {
        System.out.println("O gato mia.");
    }

    @Override
    void andar() {
        System.out.println("Pulando muros");
    }
}
