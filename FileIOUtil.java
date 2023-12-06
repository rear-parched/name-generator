import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileIOUtil {
    public static List<String> readLinesFromFile(String filePath) throws IOException {
        // Implement logic to read lines from a file
        return Files.readAllLines(Paths.get(filePath));
    }
}
