package StreamsFilesAndDirectories;

import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.Collections;
        import java.util.List;

public class SortLines{
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectories\\Files-and-Streams\\inputii.txt";

        List<String> lines = Files.readAllLines(Path.of(path));

        Collections.sort(lines);

        Path out = Paths.get("C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectories\\Files-and-Streams\\inputis.txt");

        Files.write(out, lines);

    }
}