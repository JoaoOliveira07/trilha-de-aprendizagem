package trilha.core.oop.composition.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }
    double obterValorTotal(){
        double total = 0;
        for(Compra compra: compras){
            total += compra.obterValorTotal();
        }
        return total;
    }
}
