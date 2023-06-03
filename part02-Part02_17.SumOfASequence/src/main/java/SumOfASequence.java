
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int num1 = Integer.valueOf(scanner.next());
        int sum = 0;
        for (int i = 1; i <= num1; i++){
            sum += i;
        }
        System.out.println(sum);// if wanting to return the sum...its needs to be outside tom break the loop
    }
}
