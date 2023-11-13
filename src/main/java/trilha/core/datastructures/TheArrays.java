package examples.data.strutures;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
         //Criando o array
         String[] colors = new String[5];
         //Definindo os dados da primeira e segunda posição
         colors[0] = "purple";
         colors[1] = "blue";

        //Aqui executando tudo que está dentro do array
        System.out.println(Arrays.toString(colors));

        //Aqui executando todos os que estão dentro array, porém de forma individual
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        //Aqui criando os dados da terceira posição do array
        colors[2] = "yellow";

        //Aqui executando o array inteiro
        System.out.println(Arrays.toString(colors));

        //Forma de criar o array, ao invés declarar color[0] = "blue"
        String[] exampleColor = {"blue", "yellow"};

        //For para pegar da posição 1 até que seja menor que color.length
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        //For Faz a mesma coisa do que o de cima so que de trás para frente
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);// Se no lugar do colors[i] tivesse colors.length teriamos o comprimento do nosso array, e não o valor dentro
        }
       //loop forEach, color é uma váriavel temporária que receberá cada elemento do array 'colors'
       for (String color : colors){
           System.out.println(color);
       }
       //Cria um fluxo stream, e o forEach executa colors
       Arrays.stream(colors).forEach(System.out::println);
    }
}
