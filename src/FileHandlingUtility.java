package core;

import java.io.*;

public class FileHandlingUtility {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // 1. Write to a file
        writeFile(filePath, "This is the initial content of the file.");

        // 2. Read from the file
        System.out.println("File Content Before Modification:");
        readFile(filePath);

        // 3. Modify the file
        appendToFile(filePath, " Adding more content to the file.");
        System.out.println("\nFile Content After Modification:");
        readFile(filePath);
    }

    // Write to a file
    public static void writeFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read from a file
    public static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Append to a file
    public static void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
