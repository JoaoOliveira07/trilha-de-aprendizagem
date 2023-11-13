package JavaIo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestandoFile {
    public static void main(String[] args) {

        File file = new File("/home/joao.oliveira/Documentos/teste.txt");
        Scanner sc = null;
        try {
            if(file.exists()){
                System.out.println("tesre");
            }

            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
