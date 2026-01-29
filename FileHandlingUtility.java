package Codtech_Task1;

import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fileName = "codtech_file.txt";

        try {
            // 1. WRITE TO FILE
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter text to write into the file:");
            String text = sc.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("File written successfully.\n");

            // 2. READ FROM FILE
            System.out.println("Reading content from file:");
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // 3. MODFY (APPEND) FILE
            FileWriter appendWriter = new FileWriter(fileName, true);
            System.out.println("\nEnter text to append to the file:");
            String appendText = sc.nextLine();
            appendWriter.write("\n" + appendText);
            appendWriter.close();
            System.out.println("File modified successfully.\n");

            // FINAL READ
            System.out.println("Final file content:");
            BufferedReader
            finalRead = new BufferedReader(new FileReader(fileName));
            while ((line = finalRead.readLine()) != null) {
                System.out.println(line);
            }
            finalRead.close();

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
