package JavaIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestandoReader2 {
    public static void main(String[] args) {
        String path = "/home/joao.oliveira/Documentos/teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
