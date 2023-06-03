
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String words = scanner.nextLine();
            if (words.equals("")){
                break;
            }
            String[] wordsArray = words.split(" ");

            for (String word: wordsArray) {
                System.out.println(word);
            }
        }

        // while (true){ // loopp through string add logic
        //     String input = String.valueOf(scanner.next()); // takes user input called input
        //     if(input.equals(" ")){ // while looping do not count space
        //         break; // break when you find spaces
        //     }
        //     String[] pieces = input.split(" "); // create new veriable to split

        //     for (String inputs: pieces) { // make new variable 
        //         System.out.println(inputs);
        //     }
        // }
    }
}
