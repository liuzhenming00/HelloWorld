package LearnJava_;
import java.io.FileReader;
import java.io.IOException;

public class introduction04 {
    public static void main(String[] args) throws IOException {
        String path = "D//input.txt";
        FileReader reader = new FileReader(path);
        int counter = 0;
        while ((counter = reader.read()) != -1) {
            System.out.print((char)counter);
        }
        reader.close();
    }
}