package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\MY\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String resultFilePath = "C:\\Users\\MY\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        Scanner scanner = new Scanner(new FileInputStream(path));
        PrintWriter printer = new PrintWriter(new FileOutputStream(resultFilePath));
        int row = 1;
        while (scanner.hasNext()) {
            if (row % 3 == 0) {
                printer.println(scanner.nextLine());
            } else {
                scanner.nextLine();
            }
            row++;
        }
        printer.close();
    }
}
