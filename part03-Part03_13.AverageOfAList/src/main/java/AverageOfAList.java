
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int sum = 0;
        // dont need counter, may use list.size() instead
        // int counter = 0;
        for (int num: list) {
            sum += num;
            // counter++;
        }
        // issue of precision because sum / counter was (sum / counter) it wasn't wrapped double
        // must wrap as (double) because it was "int"
        double avg = (double) sum / list.size(); // or sum / counter
        System.out.println("Average: " + avg);
    }
}
