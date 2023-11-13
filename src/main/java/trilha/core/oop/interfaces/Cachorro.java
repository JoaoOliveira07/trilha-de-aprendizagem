package trilha.core.oop.interfaces;

public class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz latidos.");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro se move correndo.");
    }
}
