package StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        allLines.forEach(line -> {
            int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += (int) symbol;
            }
            System.out.println(sum);
        });
    }
}
