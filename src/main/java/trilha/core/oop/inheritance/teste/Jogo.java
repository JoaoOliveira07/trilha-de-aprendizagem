package trilha.core.oop.inheritance.teste;
import trilha.core.oop.inheritance.Direcao;
import trilha.core.oop.inheritance.Heroi;
import trilha.core.oop.inheritance.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro(10,10);

        Heroi heroi = new Heroi(10,11);

       System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        System.out.println(monstro.vida);
        monstro.andar(Direcao.NORTE);
        heroi.andar(Direcao.SUL);
        System.out.println(heroi.vida);
    }
}
