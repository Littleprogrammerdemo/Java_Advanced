package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSet = Integer.parseInt(input.split("\\s+")[1]);
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 1; i <= sizeFirstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 1; i <= sizeSecondSet; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }
        Set<Integer> duplicateElements = new LinkedHashSet<>();
        for (int number : firstSet) {
            if (secondSet.contains(number)) {
                duplicateElements.add(number);
            }
        }
        duplicateElements.forEach(el -> System.out.print(el + " "));
    }
}
