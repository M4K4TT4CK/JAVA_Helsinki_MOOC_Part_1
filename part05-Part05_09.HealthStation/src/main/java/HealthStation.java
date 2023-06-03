
public class HealthStation {

    private int num = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.num++;
        return person.getWeight();
    }
    // feed person by against person passed as parameter using setweight method and getweight
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    // 
    public int weighings() {
        return this.num;
    }
}
