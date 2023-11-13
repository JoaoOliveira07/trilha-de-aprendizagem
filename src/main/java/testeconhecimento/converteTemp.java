package testeconhecimento;

public class converteTemp {
    public static void main(String[] args) {
        double tempF = 86;
        double tempG = 30;
        final double AJUSTEF = 32;//const
        final double FATORF = 5.0 /9.0;//const
        final double AJUSTEC = 32;//const
        final double FATORC = 9.0 / 5.0;//const
        double converteCelsius = (tempF - AJUSTEF) * FATORF;
        double converteFahrenheit = (tempG * FATORC) + AJUSTEC;

        System.out.println("A temperatura atual é de "+converteCelsius+"ºC");
        System.out.println("A temperatura atual é de "+converteFahrenheit+"ºF");
    }
}
//Variaveis são valores que pode ser alterado
//Const são valores que são predefinido