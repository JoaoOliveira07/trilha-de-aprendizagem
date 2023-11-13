package trilha.core.oop.inheritance.teste;


import trilha.core.oop.inheritance.desafio.Clio;
import trilha.core.oop.inheritance.desafio.Mercedes;

public class Pista {
    public static void main(String[] args) {
        Clio clio = new Clio(170);
        Mercedes mercedes = new Mercedes(300);

        mercedes.acelerar();
        mercedes.acelerar();
        mercedes.acelerar();
        mercedes.acelerar();
        mercedes.acelerar();
        mercedes.acelerar();
        mercedes.acelerar();
        mercedes.acelerar();
        mercedes.acelerar();
        mercedes.ligarTurbo();
        mercedes.desligarTurbo();
        System.out.println(mercedes);


        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        System.out.println(clio);

        clio.frear();
        clio.frear();
        clio.frear();
        clio.frear();
        System.out.println(clio);


        mercedes.frear();
        mercedes.frear();
        mercedes.frear();
        mercedes.frear();
        mercedes.frear();
        mercedes.frear();
        mercedes.frear();
        mercedes.frear();

        System.out.println(mercedes);


    }
}
