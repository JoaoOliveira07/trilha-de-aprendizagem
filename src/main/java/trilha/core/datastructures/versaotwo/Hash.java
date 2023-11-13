package trilha.core.datastructures.versaotwo;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario1> usuario1s = new HashSet<>();

        usuario1s.add(new Usuario1("Pedro"));
        usuario1s.add(new Usuario1("Ana"));
        usuario1s.add(new Usuario1("Guilherme"));

        boolean resultado = usuario1s.contains(new Usuario1("Guilherme"));
        System.out.println(resultado);
    }
}
