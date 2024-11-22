import java.io.*;

class FileHandlingDemo {
    public static void main(String[] args) {
        String fileName = "testfile.txt";
        String content = "Hello, this is a test file content.";

        // Writing content to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading content from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from file " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
