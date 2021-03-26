
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class ReadFile {
    
    public static void main(String[] args) {
        String fileName = "/Users/suvankar/file.txt";
        try {
            System.err.println(readFile(fileName));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static String readFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes);
    }

}
