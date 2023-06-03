
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int totalNum = 0;
        while (true){

            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0){ // if the input int is equal to zero, return average of postive int
                // if a negative number is entered; cannot calculate the average
                if (totalNum == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println((double) sum / totalNum);
                break;
                // caculate total of numbers and sum of numbers
            } else if (number>0){
                sum += number;
                totalNum++;
            }


        }

    }
}
