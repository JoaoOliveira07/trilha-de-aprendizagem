package trilha.core.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Luca", "Ana", "Gui\n");

        System.out.println("Usando o for...");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("Usando o foreach...");
        for (String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("Usando o Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Usando o Stream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
