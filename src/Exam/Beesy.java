package Exam;
import java.util.Scanner;

public class Beesy {

    private static int n;
    private static char[][] field;
    private static int beeRow, beeCol;
    private static int energy = 15;
    private static int nectarCollected = 0;
    private static boolean energyRestored = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        field = new char[n][n];

        for (int i = 0; i < n; i++) {
            field[i] = scanner.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                if (field[i][j] == 'B') {
                    beeRow = i;
                    beeCol = j;
                }
            }
        }

        boolean hiveReached = false;
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            if (command.isEmpty()) break;
            hiveReached = moveBee(command);
            if (hiveReached || energy <= 0) break;
        }
        if (hiveReached && nectarCollected >= 30) {
            System.out.println("Great job, Beesy! The hive is full. Energy left: " + energy);
        } else if (hiveReached) {
            System.out.println("Beesy did not manage to collect enough nectar.");
        } else if (energy <= 0) {
            System.out.println("This is the end! Beesy ran out of energy.");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == beeRow && j == beeCol) {
                    System.out.print('B');
                } else {
                    System.out.print(field[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static boolean moveBee(String command) {
        int newRow = beeRow;
        int newCol = beeCol;

        switch (command) {
            case "up":
                newRow = (beeRow - 1 + n) % n;
                break;
            case "down":
                newRow = (beeRow + 1) % n;
                break;
            case "left":
                newCol = (beeCol - 1 + n) % n;
                break;
            case "right":
                newCol = (beeCol + 1) % n;
                break;
        }

        field[beeRow][beeCol] = '-';

        char newPosition = field[newRow][newCol];
        energy--;

        beeRow = newRow;
        beeCol = newCol;

        if (Character.isDigit(newPosition)) {
            int nectar = Character.getNumericValue(newPosition);
            nectarCollected += nectar;
        }

        if (energy <= 0 && nectarCollected >= 30 && !energyRestored) {
            int excessNectar = nectarCollected - 30;
            energy += excessNectar;
            nectarCollected = 30;
            energyRestored = true;
        }
        field[beeRow][beeCol] = 'B';

        return newPosition == 'H';
    }
}