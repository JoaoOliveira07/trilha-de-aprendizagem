package trilha.core.oop.method;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();

        Data d2 = new Data(7,04,2003);

        System.out.println(d1.obterDatarFormatada());
        System.out.printf(d2.obterDatarFormatada());
    }
}
