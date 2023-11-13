package examples.data.strutures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(2, new Person("MARIAM"));
        map.put(1, new Person("ALEX")); //Key e value
        map.put(3, new Person("ALEXA"));

        System.out.println(map);
        System.out.println(map.size()); // Retorna o tamanho
        System.out.println(map.get(1)); //Posição um
        System.out.println(map.containsKey(4)); //Retorna falso pois não existem 4keys
        System.out.println(map.keySet()); //Retorna somente as Keys
        System.out.println(map.entrySet()); // Retorna tudo key e valor
        System.out.println(map.values()); //Retorna somente o valor
        map.remove(3); //Remove a key 3
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue())); //Retorna a key e o valor
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
        System.out.println(map.getOrDefault(3, new Person("Default")));
        System.out.println(map.values());//Retorna somente o valor
    }
     record Person(String name){}
}
