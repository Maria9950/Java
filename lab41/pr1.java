package lab41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {

        try {
            Scanner fileScanner = new Scanner(new File("data.txt"));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println("Строка: " + line);
            }

            fileScanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
