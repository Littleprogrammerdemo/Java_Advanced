package MultidimensionalArrays;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[8][8];
        for (int row = 0; row < 8; row++) {
            String[] currentRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < 8; col++) {
                matrix[row][col] = currentRow[col].charAt(0);
            }
        }
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                char currentFigure = matrix[row][col];
                if (currentFigure == 'q' && isValidQueen(row, col, matrix)){
                    System.out.println(row + " " + col);
                    return;
                }
            }
        }

    }

    private static boolean isValidQueen(int queenRow, int queenCol, char[][] matrix) {
        for (int col = queenCol - 1; col >= 0; col--) {
            if (matrix[queenRow][col] == 'q'){
                return false;
            }
        }
        for (int col = queenCol + 1; col < 8; col++) {
            if (matrix[queenRow][col] == 'q'){
                return false;
            }
        }
        for (int row = queenRow - 1; row >= 0; row--) {
            if (matrix[row][queenCol] == 'q'){
                return false;
            }
        }
        for (int row = queenRow + 1; row < 8; row++) {
            if (matrix[row][queenCol] == 'q'){
                return false;
            }
        }
        {
            int currentRow = queenRow - 1;
            int currentCol = queenCol - 1;
            while (currentRow >= 0 && currentCol >= 0){
                if (matrix[currentRow][currentCol] == 'q'){
                    return false;
                }
                currentRow--;
                currentCol--;
            }
        }
        {
            int currentRow = queenRow - 1;
            int currentCol = queenCol + 1;
            while (currentRow >= 0 && currentCol < 8){
                if (matrix[currentRow][currentCol] == 'q'){
                    return false;
                }
                currentRow--;
                currentCol++;
            }
        }
        {
            int currentRow = queenRow + 1;
            int currentCol = queenCol - 1;
            while (currentRow < 8 && currentCol >= 0){
                if (matrix[currentRow][currentCol] == 'q'){
                    return false;
                }
                currentRow++;
                currentCol--;
            }
        }
        {
            int currentRow = queenRow + 1;
            int currentCol = queenCol + 1;
            while (currentRow < 8 && currentCol < 8){
                if (matrix[currentRow][currentCol] == 'q'){
                    return false;
                }
                currentRow++;
                currentCol++;
            }
        }
        //if after these 8 loop the queen wasn't attacked by another queen, then it's valid, and we return TRUE.
        return true;
    }
}
