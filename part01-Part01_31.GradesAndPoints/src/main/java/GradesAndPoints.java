
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scan.nextLine());
        String grades = "Grade: ";
        if (grade <= -1){
            System.out.println(grades + "impossible!");
        } else if(grade <= 49){
            System.out.println(grades + "failed");
        } else if(grade <= 59){
            System.out.println(grades + "1");
        } else if (grade <= 69){
            System.out.println(grades + "2");
        } else if(grade <= 79){
            System.out.println(grades + "3");
        } else if (grade <= 89){
            System.out.println(grades + "4");
        } else if (grade <= 100){
            System.out.println(grades + "5");
        } else{
            System.out.println(grades + "incredible!");
        }

    }
}
