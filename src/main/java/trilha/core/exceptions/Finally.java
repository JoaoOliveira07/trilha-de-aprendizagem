package trilha.core.exceptions;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println(7 / in.nextInt());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finalmente...");
            in.close();
        }

        System.out.println("Fim!");
    }
}
