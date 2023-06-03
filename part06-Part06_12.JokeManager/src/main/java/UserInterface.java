import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;

    }

    public void start(){

        boolean isTrue = true;
        while(isTrue){
            System.out.println("Commands" + "\n" 
                + "1 - add a joke" + "\n" 
                + "2 - draw a joke" + "\n" 
                + "3 - list jokes" + "\n" 
                + "X - stop");
            String input = scanner.nextLine();
            switch (input){

                case "X":
                    isTrue = false;
                    break;
                
                case "1":
                    System.out.println("Write the joke to be added:");
                    String case1 = scanner.nextLine();
                    jokeManager.addJoke(case1);
                    break;
                
                case "2":
                    System.out.println(jokeManager.drawJoke());
                    break;

                case "3":
                    jokeManager.printJokes();
                    break;
                
                default:
                    System.out.println("Unknown Command");

            }


        }
    }
}
