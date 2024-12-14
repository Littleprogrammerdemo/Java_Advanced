package StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsCount {
    public static void main(String[] args) throws IOException {
        String pathWords = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\words.txt";
        List<String> allLinesWithWords = Files.readAllLines(Path.of(pathWords));

        Map<String, Integer> countWords = new HashMap<>();

        for (String line : allLinesWithWords){
            String [] wordsOnCurrentRow = line.split("\\s+");
            Arrays.stream(wordsOnCurrentRow).forEach(word -> {
                countWords.put(word, 0);
            });
        }
        String pathText = "C:\\Users\\MY\\IdeaProjects\\java advanced\\src\\StreamsFilesAndDirectoriesExercise\\text.txt";
        List<String> allLinesWithText = Files.readAllLines(Path.of(pathText));
        for (String line : allLinesWithText) {
            line = line.replaceAll("[\\.\\,\\?\\!\\:]", "");
            String [] words = line.split("\\s+");
            for (String word : words) {
                if (countWords.containsKey(word)) {
                    countWords.put(word, countWords.get(word) + 1);
                }
            }
        }
        PrintWriter writer = new PrintWriter("result.txt");
        countWords.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();
    }
}
