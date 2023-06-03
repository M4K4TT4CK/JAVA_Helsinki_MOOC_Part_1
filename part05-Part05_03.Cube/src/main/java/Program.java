
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here

        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);

        System.out.println();

        Cube newCube = new Cube(56);
        System.out.println(newCube);
        System.out.println(newCube.volume());
        System.out.println();

        Cube max =  new Cube(100);
        System.out.println(max);
        System.out.println(max.volume());
    }
}
