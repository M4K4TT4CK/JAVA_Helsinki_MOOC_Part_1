public class Fitbyte {
    private int age;
    private int restingRate; // instance variables 

    public Fitbyte(int age, int restingRate){ // constructor
        this.age = age;
        this.restingRate = restingRate;
    }

    // Only needed to add percentageOfMaximum to paramters, because maxHeartRate
    // doesnt need to be accessed outside of the method
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = (206.3 - (0.711 * this.age));
        return (maxHeartRate - this.restingRate) * percentageOfMaximum + this.restingRate;
    }
}
