
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(3, 6);
        divisibleByThreeInRange(2, 10);

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        int num1 = beginning;
        int num2 = end;
        for(int i = num1; i <= num2; i++){
            if(i % 3 != 0){
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
