
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;

        while (true){
            // iterate through the arraylist if "" is entered its ended
            String enteredText = scanner.nextLine();
            if (enteredText.equals("")){
                break;
            }
            String [] wordsArray = enteredText.split(",");
            
            if (greatest < Integer.valueOf(wordsArray[1])){
                greatest = Integer.valueOf(wordsArray[1]);
            }
        }

        System.out.println("Age of the oldest: " + greatest);
            
    }
}
