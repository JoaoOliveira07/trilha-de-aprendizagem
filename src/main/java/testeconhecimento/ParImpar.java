package testeconhecimento;


import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número de 0 a 10: ");
            int numberPar = in.nextInt();
            if (numberPar % 2 == 0 && numberPar <= 10 && numberPar >= 0){
                System.out.println(numberPar+" É par");
            }else if(numberPar % 2 == 1 && numberPar <= 10 && numberPar >= 0){
                System.out.println(numberPar+" É impar");
            }else{
                System.out.println("Número maior que 10 ou menor que 0.");
            }
        }

    }
}
