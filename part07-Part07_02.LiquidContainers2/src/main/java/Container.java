
public class Container {

    private int amount;

    public Container(){
        this.amount = 0;
    }
    //  which returns the amount of liquid in a container as an integer.
    public int contains(){
        return amount;
    }

    // which adds the amount of liquid given as a parameter to the container. 
    public void add(int added){
        if(added < 0){
            return;
        } else if (this.contains() + added <= 100){
            this.amount += added;
        } else {
            amount = 100;
        } 
    }

    // which removes the amount of liquid given as a parameter from the container. 
    public void remove(int removed) {
        if(this.amount < 0){
            return;
        }
        if (this.contains() - removed < 0){
            amount = 0;
        } else{
            this.amount -= removed;
        }
    }

    // which returns the container as a string formatted "amount of liquid/100,
    public String toString() {
        return contains() + "/" + "100";
    }
}
