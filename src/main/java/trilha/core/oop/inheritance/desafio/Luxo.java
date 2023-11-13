package trilha.core.oop.inheritance.desafio;

public interface Luxo {
    void ligarAr();

    abstract void desligarAr();

    default int velocidadeDoAr() {
        return 1;
    }
}
