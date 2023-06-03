
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int totalNum = 0;
        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf((scanner.nextLine()));
            if (num == 0){
                System.out.println("Average of the numbers: " + ((double) sum / totalNum));
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
