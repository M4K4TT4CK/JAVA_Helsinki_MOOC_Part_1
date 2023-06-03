import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simple;

    public TextUI(Scanner scanner, SimpleDictionary simple){
        this.scanner = scanner;
        this. simple = simple;
    }

    public void start(){ // should have written a switch statement.....

        while (true){

            System.out.print("Command: ");
            String command = scanner.nextLine();

            if(command.contains("end")){
                break;
                
            } else if(command.contains("add")){

                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                simple.add(word, translation);

                continue;

            } else if (command.contains("search")){

                System.out.print("To be translated: ");
                String toBeTrans = scanner.nextLine();

                if(simple.translate(toBeTrans) == null){
                    System.out.println("Word " + toBeTrans + " was not found");
                } else{
                    System.out.println("Translation: " + simple.translate(toBeTrans));
                }
                continue;
            }

            System.out.println("Unknown command");
        }

        System.out.println("Bye bye!");

    }
    
}
