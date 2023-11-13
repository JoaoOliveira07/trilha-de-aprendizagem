package trilha.core.oop.method;

public class PassagemPorValorReferencia {
    public static void main(String[] args) {
        double x = 10;
        double z = x; // Atribuição por valor(Tipo primitivo)

        x++;
        z--;

        System.out.println(x + " " + z);

        Data d1 = new Data(1, 6, 2022);
        System.out.println(d1.obterDatarFormatada());
        Data d2 = d1; //Atribuição por referencia(Objeto
        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.obterDatarFormatada());
        System.out.println(d2.obterDatarFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDatarFormatada());
        System.out.println(d2.obterDatarFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}

