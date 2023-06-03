
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        TextUserInterface textUserInterface = new TextUserInterface(scanner, statistics);

        textUserInterface.Start();
    }
}
