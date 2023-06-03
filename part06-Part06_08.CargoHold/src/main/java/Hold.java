import java.util.ArrayList;

public class Hold {
    // instance variables
    private int maxWeight;
    private ArrayList<Suitcase> itemsHold;
    // contructor
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.itemsHold = new ArrayList<>();
    }
    // add suitcase to itemsHold arrayist
    public void addSuitcase(Suitcase suitcase){
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            itemsHold.add(suitcase);
        } else if (suitcase.totalWeight() > maxWeight){
            return;
        }
        return;
    }
    // method to return total weight of new suitcase arraylist
    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase i : itemsHold){
            totalWeight += i.totalWeight();
        }
        return totalWeight;
    }
    // print all items in arraylist itemsHold
    public void printItems(){
        for(Suitcase i : itemsHold){
            i.printItems();
        }
        // System.out.println(itemsHold); <-- I am not sure why this doesnt work. it print out total of items
    }
    // toString default
    public String toString() {
        if(itemsHold.isEmpty()){
            return "no items (" + this.totalWeight() + " kg)";
        }
        return itemsHold.size() + " suitcases " + "(" + this.totalWeight() + " kg)";
    }
    
}
