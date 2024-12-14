package StreamsFilesAndDirectoriesExercise;

import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.Path;

public class AllCapitals {

    public static void main(String[] args) throws IOException {

        String content = Files.readString(Path.of("C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\input.txt"));

        content = content.toUpperCase();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\output.txt"));
        bufferedWriter.write(content);
        bufferedWriter.close();
    }
}