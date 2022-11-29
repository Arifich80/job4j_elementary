package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            for (int cell = 0; cell < board[index].length; cell++) {
                if (board[row][row] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            for (int cell = 0; cell < board[index].length; cell++) {
                if (board[column][column] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[]args) {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},

        };
        int column = 2;
        System.out.println(MatrixCheck.monoVertical(board, column));
    }

}

