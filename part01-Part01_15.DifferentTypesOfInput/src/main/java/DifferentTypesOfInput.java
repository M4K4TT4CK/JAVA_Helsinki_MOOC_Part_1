
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String words = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int nums = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double numbers = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean facts = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + words);
        System.out.println("You gave the integer " + nums);
        System.out.println("You gave the double " + numbers);
        System.out.println("You gave the boolean " + facts);




        // total returns

    }
}
