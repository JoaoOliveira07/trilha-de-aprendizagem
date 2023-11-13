package trilha.core.threads;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("Corrida entre a Tartaruga e o Coelho.");
        new Thread(t3).start();
        new Thread(t1).start();
        new Thread(t2).start();


    }

    private static Runnable t3 = new Runnable() {
        @Override
        public void run() {
            String nome = "Coelho";
            String nome1 = "Tartaruga";
            System.out.println("Piloto T1 -> "+nome);
            System.out.println("Piloto T2 -> "+nome1);

        }
    };
    private static Runnable t1 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 11; i++) {
                System.out.println("Tartaruga Avançou para casa #" + i);
            }
            System.out.println("Chegou na última casa.");
        }
    };

    private static Runnable t2 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 11; i++) {
                System.out.println("Coelho Avançou para casa #" + i);
            }
            System.out.println("Chegou na última casa.");

        }
    };
}

