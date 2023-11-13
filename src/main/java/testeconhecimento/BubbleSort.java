package testeconhecimento;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numerosArray = {9, 4, 7, 5, 6, 8, 17, 10};
        int i = 0;
        int auxiliar = 0;

        System.out.println("Array desorganizado: ");
        for (i = 0; i < numerosArray.length; i++) {
            System.out.print("[" + numerosArray[i] + "]");
        }
        System.out.println(" ");

        for (i = 0; i < numerosArray.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (numerosArray[j] > numerosArray[j + 1]) {
                    auxiliar = numerosArray[j];
                    numerosArray[j] = numerosArray[j + 1];
                    numerosArray[j + 1] = auxiliar;
                }
            }
        }
        System.out.println(" ");

        System.out.println("Array organizado: ");
        for (i = 0; i < numerosArray.length; i++) {
            System.out.print("[" + numerosArray[i] + "]");
        }
    }
}
