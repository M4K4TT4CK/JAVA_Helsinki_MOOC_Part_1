
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> strings = new ArrayList<>();

        // create loop to fucntions through the class Archive
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            // if enter is an input it will break while loop
            if (name.isEmpty()) {
                break;
            }
            // add isSrings object from class Archive
            Archive isStrings = new Archive(identifier, name);
            // if isStrings is not is the list then add it to strings ArrayList
            if (!strings.contains(isStrings)) {
                strings.add(isStrings);
            }
        }
        // loop through list and print list with toString from class Archive
        // only print once
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i).toString());
        }
    }
}