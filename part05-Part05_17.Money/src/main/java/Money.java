
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

        /*
     * returns true if the money-object on which the method 
     * is called on has a lesser value than the money object given as a parameter.
     */
    public boolean lessThan(Money compared) {

        if ((100 * euros + cents) < (100 * compared.euros() + compared.cents())) {
            return true;
        }

        return false;
    }

    /*
     Returns a new money object that is worth the total amount of 
     the object whose method was called and the object that is received 
     as the parameter.
     */
    public Money plus(Money addition){
        int plusEuros = euros + addition.euros();
        int plusCents = cents + addition.cents();
        if (plusCents > 99) {
            plusCents = plusCents - 100;
            plusEuros = plusEuros + 1;
        }
        Money newMoney = new Money(plusEuros, plusCents);
        return newMoney;
    }
    /*
     * returns a new money object worth the difference of the 
     * object whose method was called and the object received as the parameter. 
     * If the difference would be negative, the worth of the created money object is set to 0.
     */
    public Money minus(Money decreaser) {

        int minusEuros = euros - decreaser.euros();
        int minusCents = cents - decreaser.cents();
        if (minusCents < 0) {
            minusCents = minusCents + 100;
            minusEuros = minusEuros - 1;
        }
        // if the value becomes negative, return zero
        if (minusEuros < 0) {
            minusEuros = 0;
            minusCents = 0;

        }

        Money newMoney = new Money(minusEuros, minusCents);

        return newMoney;

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
