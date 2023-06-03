
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        boolean isTrue = true;
        while (isTrue) {
            System.out.print(
                    "First: " + container1.contains()+ "/100 \n"
                            + "Second: " + container2.contains() + "/100 \n");

            System.out.print(
                "Enter a Command: ");

            String userInput = scanner.nextLine();
            if (userInput.equals("quit")) {
                isTrue = false;
                break;
            }

            String[] userInputSplit = userInput.split(" ");

            String command = userInputSplit[0];

            int amount = Integer.valueOf(userInputSplit[1]);

            if(amount <= 0){
                return;
            }

            switch (command) {
                case "add":

                    container1.add(amount);
                    
                    break;

                case "move":

                    if (amount <= 0 || container1.contains() == 0) {
                        return;
                    }
                    if (container1.contains() - amount < 0) {
                        amount = container1.contains();
                    }
                    if(container2.contains() + amount > 100){
                        amount = 100;
                    }
                    container1.remove(amount);
                    container2.add(amount);
                    break;

                case "remove":
                    container2.remove(amount);
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }
    }

}
