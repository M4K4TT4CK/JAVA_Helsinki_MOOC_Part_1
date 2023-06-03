
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you? ");

        int num1 = Integer.valueOf(scan.nextLine());

        if (num1 > -1 && num1 <= 120){
            System.out.println("OK");
        } else{
            System.out.println("Impossible!");
        }
    }
}
