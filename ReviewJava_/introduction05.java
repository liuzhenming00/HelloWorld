package LearnJava_;

import java.io.FileWriter;
import java.io.IOException;

public class introduction05 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("D://output.txt");
        String outputText = "We love learning to code with Codecademy.";
        writer.write(outputText);
        writer.close();
    }
}