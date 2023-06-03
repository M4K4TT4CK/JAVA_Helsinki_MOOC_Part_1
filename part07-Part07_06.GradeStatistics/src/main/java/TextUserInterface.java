import java.util.ArrayList;
import java.util.Scanner;

public class TextUserInterface {
    
    private Scanner scanner;
    private Statistics statistics;

    public TextUserInterface(Scanner scanner, Statistics statistics){
        this.scanner = scanner;
        this.statistics = statistics;
    }

    public void Start(){
        System.out.println("Enter point totals, -1 stops:");
        Scanner scanner = new Scanner(System.in);

        while(true){
            int nums = Integer.parseInt(scanner.nextLine());

            if(nums == -1){
                statistics.printAvg();
                break;

            } else{
                statistics.addGrade(nums);
            }

        }
    }
}
