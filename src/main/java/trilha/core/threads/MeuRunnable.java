package trilha.core.threads;

public class MeuRunnable implements Runnable{

    @Override
    public void run() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome);
    }
}
