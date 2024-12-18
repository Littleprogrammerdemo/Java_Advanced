package GenericsExercise.GenericSwapMethodIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();
        for (int i = 0; i < n; i++) {
            box.add(Integer.parseInt(scanner.nextLine()));
        }
        int indexOne = scanner.nextInt();
        int indexTwo = scanner.nextInt();
        Box.swap(box.getElements(), indexOne, indexTwo);
        System.out.println(box);
    }
}
