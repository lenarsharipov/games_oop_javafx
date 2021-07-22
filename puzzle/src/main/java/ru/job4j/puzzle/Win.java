package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    rsl = true;
                    break;
                }
            }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int i) {
        boolean columnWin = true;
        for ( int index = 0; index < board.length; index++) {
            if (board[i][index] != 1) {
                columnWin = false;
                break;
            }
        }
        return columnWin;
    }

    public static boolean monoVertical(int[][] board, int i) {
        boolean cellWin = true;
        for (int[] ints : board) {
            if (ints[i] != 1) {
                cellWin = false;
                break;
            }
        }
        return cellWin;
    }


}
