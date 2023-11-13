package examples.data.strutures;

import java.util.Stack;

public class TheStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1); //Parecido com o add no list, push ele empurra para dentro da stack
        stack.push(3);
        stack.push(5);
        System.out.println(stack.peek());//Verifica quem esta no topo
        System.out.println(stack.size());//Verifica o tamanho
        System.out.println(stack.pop()); //Retorna o maximo valor e retirar
        System.out.println(stack.size()); //Verifica o valor e retorna ele com um a menos
        System.out.println(stack.empty());//Verifica se está vazio
    }
}
