import java.nio.file.Paths;
import java.util.Scanner;
 
public class IsItInTheFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Name of the file: ");
        String file = scanner.nextLine();
 
        System.out.print("Search for in file: ");
        String searchedFor = scanner.nextLine();
 
        int words = 0;
        try (Scanner checkFile = new Scanner(Paths.get(file))) {
            while (checkFile.hasNextLine()) {
                // check to make sure that the information was in the file requested
                if (searchedFor.equals(checkFile.nextLine())) {
                    System.out.println("Found!");
                    words = 1;
                    break;
                }
            }
            // if it is empty
            if (words == 0) {
                System.out.println("Not found.");
            }
            // the catch statement if the file doesnt exsist
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}