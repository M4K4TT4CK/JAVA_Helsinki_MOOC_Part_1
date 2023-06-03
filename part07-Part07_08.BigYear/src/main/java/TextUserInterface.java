import java.util.Scanner;

public class TextUserInterface {

    private Scanner scanner;
    private BirdDatabase birdlist;

    public TextUserInterface(Scanner scanner, BirdDatabase birdlist) {
        this.scanner = scanner;
        this.birdlist = birdlist;
    }

    public void start() {
        {
            boolean isTrue = true;

            try {

                while (isTrue) {

                    System.out.print("? ");
                    String command = scanner.nextLine();

                    switch (command.toLowerCase()) {
                        case "quit":

                            isTrue = false;
                            break;

                        case "add":

                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Name in Latin: ");
                            String latinName = scanner.nextLine();

                            birdlist.addBird(new Bird(name, latinName));
                            break;

                        case "observation":

                            name = scanner.nextLine();

                            birdlist.observeDB(name);

                            break;

                        case "all":
                            birdlist.printBirdDb();

                            break;

                        case "one":
                            name = scanner.nextLine();

                            birdlist.printBird(name);

                            break;

                        default:
                            System.out.println("Unknown command");
                    }
                }

            } catch (Exception error) {
                System.out.println("Error: " + error.getMessage());
            }
        }
    }
}