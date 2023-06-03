
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int num1 = Integer.valueOf(scanner.nextLine()); // user input to int
        System.out.print("Where from? ");
        int num2 = Integer.valueOf(scanner.nextLine());
        for (int i = num2; i <= num1; i++){
            System.out.println(i);
            // if (num > num2){
            //     System.out.println(i);
            // } else {
            //     continue;
            // }
        }
    }
}
