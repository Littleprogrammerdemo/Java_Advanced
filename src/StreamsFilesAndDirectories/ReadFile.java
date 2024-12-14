package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\MY\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        InputStream in = new FileInputStream(path);
        int oneByte = in.read();
        try {
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        }catch (FileNotFoundException e){

        }
        in.close();
    }
}
