public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // initialize instance vaiables in constructor method
        this.balance = openingBalance;
    }

    public String toString() {
        // toString returns balance in euros
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        // substract - 2.60 from total balance
        if(this.balance >= 2.60){
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        // subtract 4.60 from total balance
        if(this.balance >= 4.60){
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        /*
        The purpose of the method is to increase the card's balance 
        by the amount of money given as a parameter. However, the card's balance may not exceed 150 euros. 
        As such, if the amount to be topped up exceeds this limit, the balance should, in any case, become 
        exactly 150 euros.
         */
        if (amount >= 0) {
            this.balance = this.balance + amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}
