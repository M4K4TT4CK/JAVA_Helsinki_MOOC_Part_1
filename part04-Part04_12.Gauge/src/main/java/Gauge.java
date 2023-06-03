public class Gauge {
    private int value;

    public Gauge(){ // set initial value of value to zero
        this.value = 0;
    }
    
    public void increase(){ // grows the value instance variable's value by one. 
                            // It does not grow the value beyond five.
        if(this.value < 5){
            this.value++;
        }

    }

    public void decrease(){// decreases the value instance variable's value by one. 
                            // It does not decrease the value to negative numbers.
     
        if(this.value > 0 && this.value <= 5){
            this.value--;
        }

    }

    public int value(){ // returns the value variable's value.
        return this.value;

    }

    public boolean full(){ //returns true if the instance variable value has the value five. 
                            // Otherwise, it returns false 
        if(this.value == 5){
            return true;
        } else {
            return false;
        }

    }
}
