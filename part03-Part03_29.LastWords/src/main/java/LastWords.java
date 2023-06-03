
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String words = scanner.nextLine();
            if (words.equals("")){
                break;
            }
            // create arraylist of the words split
            String[] wordsList = words.split(" ");
      
            System.out.println("Name of the oldest: " + wordsList[0]);
            // must use indirect method to get last element(string) and index -1

        }
    }
}
