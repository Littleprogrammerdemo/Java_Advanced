package StreamsFilesAndDirectoriesExercise;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String pathFileOne = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\inputOne.txt";
        String pathFileTwo = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\inputTwo.txt";
        PrintWriter writer = new PrintWriter("outputMerge.txt");

        List<String> allLinesFileOne = Files.readAllLines(Path.of(pathFileOne));
        allLinesFileOne.forEach(line -> writer.println(line));
        List<String> allLinesFileTwo = Files.readAllLines(Path.of(pathFileTwo));
        allLinesFileTwo.forEach(line -> writer.println(line));

        writer.close();


    }
}
