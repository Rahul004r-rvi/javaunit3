import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("sample.txt");
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("File handling error");
        }
    }
}
