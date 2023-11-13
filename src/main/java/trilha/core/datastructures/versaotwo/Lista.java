package trilha.core.datastructures.versaotwo;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Usuario1> lista = new ArrayList<>();

        Usuario1 u1 = new Usuario1("Ana");
        lista.add(u1);

        lista.add(new Usuario1("Carlos"));
        lista.add(new Usuario1("Rodolfo"));
        lista.add(new Usuario1("Bruno"));
        lista.add(new Usuario1("Bia"));
        lista.add(new Usuario1("Manu"));
        lista.add(new Usuario1("Manu"));

        System.out.println(lista.get(3));

        System.out.println(">>>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario1("Manu")));

        System.out.println("Tem? " + lista.contains(new Usuario1("Bia")));
        System.out.println("Tem? " + lista.contains(u1));

        for (Usuario1 u: lista){
            System.out.println(u.nome);
        }

    }
}
