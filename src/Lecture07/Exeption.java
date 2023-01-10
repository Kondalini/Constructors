package Lecture07;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static Lecture07.CodeFix.*;

public class Exeption {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the file path: ");
            String filePath = scanner.nextLine();
            System.out.println("Please enter how many times to add the text in the file: ");
            int howManyTimesToPrintTheTextToFile = Integer.parseInt(scanner.nextLine());
            System.out.println("Please provide the text: ");
            String textToAdd = scanner.nextLine();
            fileWriter = getFileWriter(filePath);
            printToFile(fileWriter, textToAdd, howManyTimesToPrintTheTextToFile);
        } catch (IOException e) {
            System.out.println("Unable to print the text to the file! Please provide valid file path and try again!");
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid number for how many times to add the text!");
        } finally {
            if (fileWriter != null) {
                closeFileWriter(fileWriter);
            }
        }
    }
}
