package trilha.core.oop.abstraction;

class Cachorro extends Animal {
    void fazerBarulho() {
        System.out.println("O cachorro late.");
    }

    @Override
    void andar() {
        System.out.println("Correndo");
    }
}

