package projetos.caixaeletronico;

public class CaixaEletronicoService {
    public StringBuilder getSaque(Integer value) {

        if (!ehNumeroValido(value)) { //Verifica se é valida ou não (Vai dar erro me casos de 0, 1, 3 ou numero com virgula)
            System.out.println("O valor informado não é válido!");
            return null; //Retorna nada
        }
/*O código verifica se o número informado é válido, chamando o método ehNumeroValido. Se o número não for válido (menor que zero, igual a 1 ou igual a 3),
uma mensagem de erro é exibida e o programa é encerrado com o comando return.*/
        StringBuilder msg = new StringBuilder();
        int[][] res = calculaQtdNotas(value);  //chamando o metodo
        for (int i = 0; i < res.length; i++) { //Aqui ele faz um loop de qnts vzs necessárias de notas
            if (res[i][1] > 0) {
                msg.append(res[i][1]).append(" notas de ").append(res[i][0]).append("\n");//Aqui ele está retornando no n°1 a qntd notas e n°0 o valor da nota
            }
        }
    /*O programa calcula a quantidade de notas necessárias para o saque utilizando o método calculaQtdNotas. Ele cria uma matriz res para armazenar o resultado.
    Em seguida, ele percorre essa matriz, verificando a quantidade de notas de cada valor e construindo uma mensagem com essas informações.*/

        return msg; // mostrando ao usuario
    }
    /*O método calculaQtdNotas é responsável por calcular a quantidade de notas para o valor informado. Ele começa criando um array multidimensional arrNotas que armazena
     os valores das notas e a quantidade de cada nota. Ele também inicializa uma variável controle para acompanhar certos casos especiais.

Dentro do loop, o código calcula a quantidade de cada nota e atualiza o valor restante. Se o valor for 1 ou 3 e a nota for 2, o programa utiliza a variável controle para
lidar com esses casos especiais. No final, o método retorna o array res com as quantidades de notas calculadas.*/
    public static int[][] calculaQtdNotas(int valorOriginal) { //Criando um metodo
        int[][] arrNotas = {{200, 0}, {100, 0}, {50, 0}, {20, 0}, {10, 0}, {5, 0}, {2, 0}}; //Criando as variaveis das notas
        String controle = ""; //Controle para lidar com situações em que impares (1/3)
        int value = valorOriginal; //armazenando o value

        for (int i = 0; i < arrNotas.length; i++) { //Condição do loop (arrNotas[i][0]) é igual a 2. Se for, verifica se o valor total (value) é igual a 1 ou 3.
            // Dependendo disso, define o valor da variável controle como "E1" ou "E3".
            if (arrNotas[i][0] == 2) {
                if (value == 1) {
                    controle = "E1";
                }
                if (value == 3) {
                    controle = "E3";
                }
            }

            arrNotas[i][1] = value / arrNotas[i][0]; // calcula a quantidade de notas da nota atual e atribui esse valor a arrNotas[i][1].
            value = value - (arrNotas[i][1] * arrNotas[i][0]);// atualiza o valor total subtraindo o valor total das notas calculadas nessa iteração
        }

        int[][] res = arrNotas;
        if (controle.equals("E1")) {
            res = calculaQtdNotas(valorOriginal - 2);
            res[6][1] = res[6][1] + 1;
        }

        if (controle.equals("E3")) {
            res = calculaQtdNotas(valorOriginal - 4);
            res[6][1] = res[6][1] + 2;
        }

        return res; //Retorna o valor final
    }
    /*O método ehNumeroValido verifica se o número é válido de acordo com as regras definidas no seu código JavaScript original. Ele retorna true se o número for válido e
     false caso contrário.*/
    public static boolean ehNumeroValido(int number) { //Explicado la emcima
        if (number == 1 || number == 3 || number < 0) {
            return false;
        }
        return true;
    }
}
