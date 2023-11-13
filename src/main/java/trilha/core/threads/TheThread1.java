package trilha.core.threads;

public class TheThread1 {
    public static void main(String[] args) {
        //Thread atual
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        //Criando nova thread
        Thread t2 = new Thread(new MeuRunnable());
        //t2.run(); //Apenas executando na mesma thread
        t2.start();//Executando uma nova thread

        //Runnable como Lambda
        Thread t3 = new Thread(
                () -> System.out.println("Testes"));
        t3.start();

        Thread t4 = new Thread(new MeuRunnable());
        t4.start();
    }
}
