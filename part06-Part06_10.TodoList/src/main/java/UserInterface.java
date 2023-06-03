
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    // command method start() 
    public void start() {
            // elegant///makes sense because I created toDoList class and could have just called
        // the methods from that class
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
 
            if (command.equals("add")) {
                String toAdd = scanner.nextLine();
                this.list.add(toAdd);
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.list.remove(toRemove);
            }
        }
        // while (true) {

        //     System.out.print("Command: ");
        //     String command = scanner.nextLine();
    // This didnt work because i couldnt figure out how to get out of the switch statement without
    // messing everything up
    //         switch (command) {

    //             case "stop":

    //                 break;

    //             case "add":

    //                 System.out.print("To add: "); 
    //                 String toAdd = scanner.nextLine();
    //                 list.add(toAdd);
        
    //                 break;

    //             case "list":

    //                 this.list.print();
    //                 break;

    //             case "remove":

    //                 System.out.print("Which one is removed? ");
    //                 int removedNum = Integer.parseInt(this.scanner.nextLine());
    //                 this.list.remove(removedNum);
    //                 break;

    //             default:
    //                 System.out.println("Unknown Command");
    //         }
    //     }
    // }

        // THIS IS NOT ELEGANT
        //     // if list is empty break while loop
        //     if(command.contains("stop")){ 
        //         break;

        //     // if command: add, then add to list
        //     } else if(command.contains("add")){

        //         System.out.print("To add: "); 
        //         String toAdd = scanner.nextLine();
        //         list.add(toAdd);
        //         continue;

        //     // if command: list, print list
        //     } else if(command.contains("list")){

        //         list.print();
        //         continue;

        //     // if command: remove, move item from list
        //     } else if(command.contains("remove")){

        //         System.out.print("Which one is removed? ");
        //         int removedNum = Integer.parseInt(scanner.nextLine());
                
        //         list.remove(removedNum);
        //         continue;
        //     }
        //     // default statement
        //     System.out.println("Unknown Command");
        // }
        // // on exit -> print statement
        // System.out.println("Bye Bye!");

    }
}
