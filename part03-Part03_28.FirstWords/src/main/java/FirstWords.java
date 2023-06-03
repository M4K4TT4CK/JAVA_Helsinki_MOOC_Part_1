
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String words = scanner.nextLine();
            if (words.equals("")){
                break;
            }
            // create arraylist of the words split
            String[] wordsList = words.split(" ");
            System.out.println(wordsList[0]);
            // can directly get the index at 0 from just calling it
        }
    }
}
