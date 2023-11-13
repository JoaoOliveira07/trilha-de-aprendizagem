package trilha.core.oop.method;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        this(1,1,1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDatarFormatada() {
        return String.format("%d/%d/%d", this.dia, mes, ano);
    }

}
