
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -5
        // 4
        // -3
        // 1
        // 0

        int sum = 0;
        int totalNum = 0;
        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf((scanner.nextLine()));
            if (num == 0){
                System.out.println("Number of numbers: " + totalNum);
                System.out.println("Sum of the numbers: " + sum);
                break;
            } else if (num > 0){
                totalNum++;
            } else if (num < 0){
                totalNum++;
            }
            sum += num;
        }
    }
}
