






                
                import java.util.*;

                public class SolveSudoku1 {
                
                    public static boolean isSafe(char[][] board, int row, int col, char digit) {
                        // Horizontal Check
                        for (int i = 0; i < 9; i++) {
                            if (board[row][i] == digit) {
                                return false;
                            }
                        }
                
                        // Vertical Check
                        for (int j = 0; j < 9; j++) {
                            if (board[j][col] == digit) {
                                return false;
                            }
                        }
                
                        // Grid Check
                        int sr = (row / 3) * 3;
                        int sc = (col / 3) * 3;
                
                        for (int i = sr; i < sr + 3; i++) {
                            for (int j = sc; j < sc + 3; j++) {
                                if (board[i][j] == digit) {
                                    return false;
                                }
                            }
                        }
                
                        return true;
                    }
                
                    public static boolean helper(char[][] board, int row, int col) {
                        // Base Case
                        if (row == 9) {
                            return true;
                        }
                
                        int nextRow = row, nextCol = col + 1;
                        if (col == 8) {
                            nextCol = 0;
                            nextRow = row + 1;
                        }
                
                        if (board[row][col] != '.') {
                            return helper(board, nextRow, nextCol);
                        }
                
                        for (char digit = '1'; digit <= '9'; digit++) {
                            if (isSafe(board, row, col, digit)) {
                                board[row][col] = digit;
                                if (helper(board, nextRow, nextCol)) {
                                    return true;
                                }
                                board[row][col] = '.'; // Backtracking
                            }
                        }
                        return false;
                    }
                
                    public static void solveSudoku(char[][] board) {
                        helper(board, 0, 0);
                    }
                
                    public static void printBoard(char[][] board) {
                        for (int i = 0; i < 9; i++) {
                            for (int j = 0; j < 9; j++) {
                                System.out.print(board[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                
                    public static void main(String args[]) {
                        char[][] board = {
                            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                        };
                
                        solveSudoku(board);
                        printBoard(board);
                    }
                }