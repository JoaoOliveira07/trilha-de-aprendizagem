package trilha.core.datastructures.versaotwo;

import java.util.Date;

public class SetHash {
    public static void main(String[] args) {

        Usuario2 u1 = new Usuario2();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva.@gmail.com";

        Usuario2 u2 = new Usuario2();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva.@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));

    }
}
