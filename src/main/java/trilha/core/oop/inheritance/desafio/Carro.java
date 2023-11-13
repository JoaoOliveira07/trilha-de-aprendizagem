package trilha.core.oop.inheritance.desafio;

public class Carro {
    //VELOCIDADE ATUAL
    //ACELERAR
    //FREAR

    protected int velocidadeAtual;
    public final int VELOCIDADE_MAXIMA;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    private int delta = 5;

     protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }


    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += getDelta();
        }
    }

    public void frear() {
        if (velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
    }
    public String toString()
    {
        return "Velocidade atual é "+ velocidadeAtual+"km/h.";
    }


}
