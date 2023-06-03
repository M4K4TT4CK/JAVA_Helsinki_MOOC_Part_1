
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // PaymentCard card = new PaymentCard(10);
        PaymentCard pauls = new PaymentCard(20);
        PaymentCard matts = new PaymentCard(30);

        pauls.eatHeartily();
        matts.eatAffordably();

        System.out.println("Paul: " + pauls);
        System.out.println("Matt: " + matts);

        pauls.addMoney(20);
        matts.eatHeartily();

        System.out.println("Paul: " + pauls);
        System.out.println("Matt: " + matts);

        pauls.eatAffordably();
        pauls.eatAffordably();
        
        matts.addMoney(50);

        System.out.println("Pauls card: " + pauls);
        System.out.println("Matt's Card: " + matts);



  

    }
}
