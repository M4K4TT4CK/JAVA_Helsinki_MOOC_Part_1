
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine()); // user input to int
        int start = num; //add this to num to create the starting point of the count
        for (int i = start; i <= 100; i++){
            System.out.println(i);
        }

    }
}
