package trilha.core.datastructures.caixaeletronico;

public class RecebeNotas { //armazenar quantidade de notas

    public int notas200;
    public int notas100;
    public int notas50;
    public int notas20;
    public int notas10;
    public int notas5;
    public int notas2;
    public int valor;

    public RecebeNotas(int notas200, int notas100, int notas50, int notas20, int notas10, int notas5, int notas2, int valor) {
        this.notas200 = notas200;
        this.notas100 = notas100;
        this.notas50 = notas50;
        this.notas20 = notas20;
        this.notas10 = notas10;
        this.notas5 = notas5;
        this.notas2 = notas2;
        this.valor = valor;
    }
}

