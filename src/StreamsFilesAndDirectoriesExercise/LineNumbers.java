package StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers{
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\inputLineNumbers.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));

        PrintWriter writer = new PrintWriter("output_line_numbers.txt");
        int lineNumber = 1;
        for (String line : allLines) {
            writer.println(lineNumber + ". " + line);
            lineNumber++;
        }

        writer.close();
    }
}
