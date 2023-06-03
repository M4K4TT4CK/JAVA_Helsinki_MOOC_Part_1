
public class Statistics {
    private int count;
    private int sum;
 
    public Statistics() {
        // initialize the variable numberCount here
    }
 
    public void addNumber(int number) {
        // write code here
        this.count = this.count + 1; // add number to count
        this.sum = this.sum + number;// add sum to sum count
    }
 
    public int getCount() {
        // write code here
        return this.count; // return total ount
    }
 
    public int sum() {
        // write code here
 
        return this.sum; // return sum
    }
 
    public double average() {
        // write code here
        double avg = 0.0;
        if (this.count != 0.0) {
            avg = 1.0 * this.sum / this.count;
        }
        return avg;
    }
}
