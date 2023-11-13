package trilha.core.datastructures.versaotwo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Pedro\n");
        listaAprovados.add("Lucas");
        listaAprovados.add("Carlos");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
        Set<String> listaAprovado = new HashSet<>();
        listaAprovado.add("Ana");
        listaAprovado.add("Pedro");
        listaAprovado.add("Lucas");
        listaAprovado.add("Carlos");

        for (String candidatos : listaAprovado) {
            System.out.println(candidatos);
        }
    }
}
