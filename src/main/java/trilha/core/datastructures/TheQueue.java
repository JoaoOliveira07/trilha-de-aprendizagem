package examples.data.strutures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ListIterator;


public class TheQueue {
    public static void main(String[] args) {

        //Lista vinculada
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.add(new Person("Ali", 18));
        linkedList.add(new Person("Ale", 18));
        linkedList.add(new Person("Bla", 21));
        linkedList.add(new Person("Ala", 21));


        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();


        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    private static void queues(){
        //Primeiro a entrar e primeiro a sair
        //Criando uma lista vinculada
        Queue<Person> supermaket = new LinkedList<>();
        supermaket.add(new Person("Alex",21));
        supermaket.add(new Person("Mariam",18));
        supermaket.add(new Person("Ale",40));

        System.out.println(supermaket.size());//Ve o tamanho da fila
        System.out.println(supermaket.peek());//Ve quem esta na topo da fila
        System.out.println(supermaket.poll());//Remove quem esta na topo da fila
        System.out.println(supermaket.size());
        System.out.println(supermaket.peek());


    }
    static record Person(String name, int age){

    }
}
