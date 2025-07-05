 // Writes multiple lines to a text file
import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) {
        String[] lines = {"Line 1", "Line 2", "Line 3"};
        String fileName = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
