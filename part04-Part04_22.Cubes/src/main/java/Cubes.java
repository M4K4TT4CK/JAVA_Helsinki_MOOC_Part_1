
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int; type end to end.");

        int count = 0;
        while (true){
            System.out.print("Enter your number to be cubed: ");
            String line = String.valueOf(scanner.nextLine());
            
            if (line.equals("end")){
                break;
            } else if(line.equals("")){
                continue;
            }
            count++;
            int newInt = Integer.parseInt(line);
            System.out.println("Number cubed: " + newInt * newInt * newInt);
        }
    }
}
