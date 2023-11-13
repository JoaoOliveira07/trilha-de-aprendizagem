package JavaIo;

import java.io.File;
import java.util.Scanner;

public class Testando {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = in.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        in.close();
    }
}
