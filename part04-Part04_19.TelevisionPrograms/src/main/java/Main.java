import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class
        // create array list called programs
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        // initilize scanner for read user input
        Scanner reader = new Scanner(System.in);
        // while true to interate through array list
        while(true) {
            System.out.print("Name: ");
            String showName = reader.nextLine();
            if(showName.isEmpty()) {
                break; // if the user input is empty then terminate program
            }
            // ask for duration
            System.out.print("Duration: ");
            int duration = Integer.valueOf(reader.nextLine()); 

            // add new program to TelevisionProgram
            TelevisionProgram newProgram = new TelevisionProgram(showName, duration);
            programs.add(newProgram); // add new method
            
        }
        // ask for max duration of programs in list
        System.out.print("Program's maximum duration? ");
        int max = Integer.valueOf(reader.nextLine());
        // cycle through list after applying maxduration
        for(TelevisionProgram newProgram : programs) {
            if(newProgram.getDuration() <= max) {
                System.out.println(newProgram);
            }
        }

    }
}
