
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
// need two new int inputs, needs to be below the intial while staement from adding inputs to list
        int fromNum = Integer.valueOf(scanner.nextLine());
        int toNUm = Integer.valueOf(scanner.nextLine());
// "i" must be starting point and I must continue while its less or equal to than the toNum
        for(int i = fromNum; i <= toNUm; i++){
            System.out.println(numbers.get(i));
        }
    }
}
