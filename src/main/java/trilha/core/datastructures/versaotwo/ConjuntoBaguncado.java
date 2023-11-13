package trilha.core.datastructures.versaotwo;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class ConjuntoBaguncado {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste");

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("teste"));

        System.out.println(conjunto.contains("tes"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums);
        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }
}
