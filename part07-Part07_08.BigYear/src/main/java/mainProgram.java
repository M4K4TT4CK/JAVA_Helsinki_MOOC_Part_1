
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdDataList = new BirdDatabase();
        
        TextUserInterface  txtUserInterface = new TextUserInterface(scanner, birdDataList);
        txtUserInterface.start();
    }
}