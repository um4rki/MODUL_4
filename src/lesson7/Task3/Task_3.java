package lesson7.Task3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\MSI\\IdeaProjects\\4_Modul\\src\\file.txt");
        List<String[]> lines = readLinesFromFile(file);
        int lineNumber = 1;
        for (String[] numbers : lines) {
            System.out.println("Line " + lineNumber + ": " + String.join(",", numbers));
            lineNumber++;
        }
    }

    public static List<String[]> readLinesFromFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<String[]> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbers = line.split(",");
            lines.add(numbers);
        }
        return lines;
    }
}
