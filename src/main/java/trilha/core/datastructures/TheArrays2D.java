package examples.data.strutures;

import java.util.Arrays;

public class TheArrays2D {
    public static void main(String[] args) {
        //Criando o Array2D, ou seja temos 3 casa com 3 espaços digamos assim
        char[][] board = new char[3][3];

        //Aqui esta criando um loop para a variavel board, a criará as casas com valor dentro '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        //Aqui mesmo esquema de cima, mas ao inves de criar um loop, criamos usando new
        char[][] boardTwo = new char[][]{
                new char[] {'O','X','X'},
                new char[] {'O','O','X'},
                new char[] {'O','X','O'}
        };
        //Basicamente a primeira casa é a linha e a segunda casa seria a coluna
        board[0][0] = 'O';
        board[0][1] = 'O';
        board[0][2] = 'O';
        board[1][0] = 'X';
        board[1][1] = 'X';
        board[1][2] = 'X';
        board[2][0] = 'O';
        board[2][1] = 'O';
        board[2][2] = 'O';

        //deepToString representa uma matriz multidimensional
        System.out.println(Arrays.deepToString(board));

        System.out.println(Arrays.deepToString(boardTwo));

    }
}
