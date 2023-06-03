public class Counter {
    // instance variable
    private int value;

    //constructor
    public Counter(int startValue){
        this.value = startValue;
    }
    // overloaded constructor
    public Counter(){
        this.value = 0;
    }
    // method to return current value
    public int value(){
        return this.value;
    }
    // decrease method value
    public void decrease(){
        this.value = this.value - 1;
    }
    // overload decrease value
    public void decrease(int decreaseBy){
        if (decreaseBy > 0){
            this.value = this.value - decreaseBy;
        }
    }
    // increase method value
    public void increase(){
        this.value = this.value + 1;
    }
    //overload method increase
    public void increase(int increaseBy){
        if(increaseBy > 0){
            this.value = this.value + increaseBy;
        }
    }
}

