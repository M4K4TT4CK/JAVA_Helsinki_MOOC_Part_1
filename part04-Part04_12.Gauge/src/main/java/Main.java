
public class Main {

    public static void main(String[] args) {
        // Test your Gauge class here

        Gauge g = new Gauge();

        while(!g.full()) { // looops through and increase value while it is less than five
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value()); // if it reaches five, prints comments
        g.decrease(); // if amount is decreased by method 
        System.out.println("Not full! Value: " + g.value()); //print statement
    }
}
