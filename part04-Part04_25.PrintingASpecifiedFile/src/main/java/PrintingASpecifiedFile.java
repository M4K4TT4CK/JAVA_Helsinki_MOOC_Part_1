
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which file should have its contents printed? ");

        String fileName = String.valueOf(scanner.nextLine());

        try (Scanner scan = new Scanner(Paths.get(fileName))) {

            // we read the file until all lines have been read
            while (scan.hasNextLine()) {
                // we read one line
                String row = scan.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
