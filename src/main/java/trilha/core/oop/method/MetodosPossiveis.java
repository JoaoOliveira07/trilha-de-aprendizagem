package trilha.core.oop.method;

public class MetodosPossiveis {
    public static void main(String[] args) {

        soma();
        msg("Metodo com parametros");
        msg1("Métodos com parametros que usam for",3);
        System.out.println("Método que recebe um retorno de valor "+somaR(10,5));
        //Sobre carga de métodos
        System.out.println("Método que recebe um retorno de valor, porém não definido quantos "+somaRes(10,5,4,8,9,5));
        System.out.println("Método que recebe um retorno de valor, porém não definido quantos "+somaRes(10.5,5.4,4.9,8.7,9.8,5));

    }
    public static void soma(){
        System.out.println("Metodo que não tem retorno nenhum de valor");
    }
    public static void msg(String m){
        System.out.println(m);
    }
    public static void msg1(String m, int l){
        for (int i = 0; i < l; i++){
            System.out.println(m);
        }
    }
    public static int somaR(int n1, int n2){
        int res = n1+ n2;
        return res;
    }
    public static double somaRes(double... numeros){//Método somaRes sofrendo sobrecarga
        double res=0;
        for (double n:numeros){
            res+=n;
        }
        return res;
    }
    //nivel da visibilidade, static pois não precisa instaciar, nome do método(Parametros se houver)
    public static int somaRes(int... numeros){
        int res=0;
        for (int n:numeros){
            res+=n;
        }
        return res;
    }
}
