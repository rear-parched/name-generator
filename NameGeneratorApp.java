import java.io.IOException;
import java.util.List;

public class NameGeneratorApp {
    public static void main(String[] args) {
        try {
            List<String> firstNames = FileIOUtil.readLinesFromFile("first_names.txt");
            List<String> lastNames = FileIOUtil.readLinesFromFile("last_names.txt");

            FirstNameGenerator firstNameGenerator = new FirstNameGenerator(firstNames);
            LastNameGenerator lastNameGenerator = new LastNameGenerator(lastNames);
            NameGenerator nameGenerator = new NameGenerator(firstNameGenerator, lastNameGenerator);

            for (int i = 0; i < 10; i++) {
                String fullName = nameGenerator.generateFullName();
                System.out.println(fullName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
