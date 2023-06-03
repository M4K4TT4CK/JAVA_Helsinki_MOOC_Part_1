
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int num1 = Integer.valueOf(scanner.next());
        int factor = 1; // used because it was the factor..add different number to factor by
        for (int i = 1; i <= num1; i++){
            factor *= i;
        }
        System.out.println("Factorial: " + factor);
    }
}
