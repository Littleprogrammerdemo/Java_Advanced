package StreamsFilesAndDirectories;

import java.io.*;
        import java.util.Collections;
        import java.util.HashSet;
        import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectories\\Files-and-Streams\\input.txt";
        String resultFile = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectories\\Files-and-Streams\\outputt.txt";
        try {
            InputStream readingFromFile = new FileInputStream(path);
            OutputStream writingOnFile = new FileOutputStream(resultFile);
            int oneByte = readingFromFile.read();
            Set<Character> forbiddenSymbols = new HashSet<>();
            Collections.addAll(forbiddenSymbols, '.', ',', '!', '?');
            while (oneByte >= 0) {
                if (!forbiddenSymbols.contains((char) oneByte)){
                    writingOnFile.write(oneByte);
                }
                oneByte = readingFromFile.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}