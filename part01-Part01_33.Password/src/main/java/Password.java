
import java.io.Reader;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 


        System.out.println("Password?");

        String password = "Caput Draconis";
        String words = scan.nextLine();

        if(words.equals(password)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }


    }
}
