package StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\input.txt";
        long sum = 0;
List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        for (String line : allLines) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }
}
