
import java.util.Scanner;

import javax.sound.sampled.Line;
import javax.xml.transform.Source;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String line = scanner.nextLine();
        
            if (line.equals("end")) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
