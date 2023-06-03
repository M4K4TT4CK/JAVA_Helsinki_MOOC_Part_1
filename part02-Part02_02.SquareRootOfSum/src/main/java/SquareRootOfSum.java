
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.valueOf(scanner.nextLine());

        double squareRootOfSum = Math.sqrt(number1);

        int number2 = Integer.valueOf(scanner.nextLine());

        double squareRootOfSum2 = Math.sqrt(number2);

        System.out.println((int) (squareRootOfSum + squareRootOfSum2));

    }
}
