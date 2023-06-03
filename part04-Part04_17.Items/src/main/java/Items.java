
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Name: ");
            String item = scanner.nextLine();
            if(item.isEmpty()){ // if empty terminate 
                break;
            }
            items.add(new Item(item)); // add new name to item array
        }
        for(Item item: items){ // iterate through array and print names with toString
            System.out.println(item.toString()); 
        }
        
    }
}
