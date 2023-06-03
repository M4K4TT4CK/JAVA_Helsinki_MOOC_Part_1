
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner sc = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList();
        while(true) {
            System.out.println("Title: ");
            String title = sc.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            System.out.println("Publication year: ");
            int pub = Integer.valueOf(sc.nextLine());
            books.add(new Books(title, pages, pub));
        }
        System.out.println("What information will be printed?");
        String q = sc.nextLine();
        if (q.equals("everything")) {
           for (Books b : books) {
               System.out.println(b);
           } 
        } else if (q.equals("name")) {
            for(Books b : books) {
                System.out.println(b.getName());
            }
        }
        
    }
}