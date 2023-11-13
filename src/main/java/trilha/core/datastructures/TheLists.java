package examples.data.strutures;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        //usando <aqui dentro definimos o tipo da nossa lista>
        //Criando uma lista imutavel
        List<String> colorUnmodifiable = List.of(
                "blue",
                "yellow"
        );
        //Se executar isso vai dar erro colorUnmodifiable.add("pink");

        //usando <aqui dentro definimos o tipo da nossa lista> adicionando no nosso ArrayList<> também
        List<String> colors = new ArrayList<>();
        //Lista básicamente não tem valor fixo definindo, posso ir adicionando e ele vai incluindo
        //Como os exemplos abaixo
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size()); //Aqui vemos o tamanho da nossa lista
        System.out.println(colors.contains("yellow")); //Aqui contém o valor yellor dentro da nossa lista vai retorna true
        System.out.println(colors.contains("pink")); //Aqui vai fazer a mesma coisa, porém vai retorna false pois não existe o pink na nossa lista
        System.out.println(colors); //Aqui retorna nossa lista colors

        for (String color : colors){
            System.out.println(color);
        }
        colors.forEach(System.out::println);
        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }
}
