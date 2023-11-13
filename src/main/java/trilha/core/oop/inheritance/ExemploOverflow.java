package trilha.core.oop.inheritance;
public class ExemploOverflow {
    public static void main(String[] args) {
        int numeroMaximo = Integer.MAX_VALUE; // Valor máximo de um int
        int numeroOverflow = numeroMaximo + 1; // Tentando adicionar 1 ao valor máximo

        System.out.println("Valor máximo de um int: " + numeroMaximo);
        System.out.println("Tentativa de adicionar 1 ao valor máximo: " + numeroOverflow);
    }
}

