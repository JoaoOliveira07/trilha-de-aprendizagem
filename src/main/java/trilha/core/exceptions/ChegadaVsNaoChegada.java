package trilha.core.exceptions;

public class ChegadaVsNaoChegada {
    public static void main(String[] args) {
        try {
            erro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            erro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim :)");
    }

    //Não chegada ou não verificada
    static void erro1() {
        throw new RuntimeException("Ocorreu um erro #01");
    }

    //Chegada ou verificda
    static void erro2() throws Exception{
       throw new Exception("Ocorreu um erro #02");
    }
}

