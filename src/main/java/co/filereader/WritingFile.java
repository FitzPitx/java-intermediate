package co.filereader;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args)  {
        String outputText = "Hello from the program";
        try {
            FileWriter output = new FileWriter("output.txt");
            output.write(outputText);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
