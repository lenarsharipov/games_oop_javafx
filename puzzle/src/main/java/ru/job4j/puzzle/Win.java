package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoHorizontal(board, i) || monoVertical(board, i))) {
                    rsl = true;
                    break;
                }
            }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean columnWin = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {
                columnWin = false;
                break;
            }
        }
        return columnWin;
    }

    public static boolean monoVertical(int[][] board, int col) {
        boolean cellWin = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][col] != 1) {
                cellWin = false;
                break;
            }
        }
        return cellWin;
    }
}
