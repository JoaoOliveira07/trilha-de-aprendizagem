package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.aguardar("SEGREDO!");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.aguardar(89787.14);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
