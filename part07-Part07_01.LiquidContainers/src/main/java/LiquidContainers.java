import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        boolean isTrue = true;
        while (isTrue) {
            System.out.print(
                    "First: " + container1 + "/100\n"
                            + "Second: " + container2 + "/100 \n");

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

                    if (container1 + amount <= 100) {
                        container1 += amount;
                    } else {
                        container1 = 100;
                    }
                    break;

                case "move":

                    if (amount <= 0 || container1 == 0) {
                        return;
                    }
                    if (container1 - amount < 0) {
                        amount = container1;
                    }
                    if (amount >= 100) {
                        container1 = 0;
                        container2 = 100;
                    } else if (container2 + amount <= 100) {
                        container2 += amount;
                        container1 -= amount;
                    } else {
                        container2 = 100;
                        container1 = 0;
                    }
                    break;

                case "remove":

                    if (amount > container2) {
                        amount = 0;
                    } else {
                        container2 -= amount;
                    }
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
