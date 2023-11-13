package trilha.core.oop.inheritance.desafio;

public class Mercedes extends Carro implements Esportivo, Luxo {


    private boolean ligarAr;
    private boolean ligarTurbo;

    public Mercedes(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    public int getDelta(){
        if (ligarTurbo && !ligarAr){
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        }else if (!ligarAr && !ligarTurbo){
            return 20;
        }else{
            return 15;
        }
    }

}
