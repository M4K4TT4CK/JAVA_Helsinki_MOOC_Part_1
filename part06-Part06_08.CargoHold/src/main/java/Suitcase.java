import java.util.ArrayList;

public class Suitcase {
    // instance variables
    private int maxWeight;
    private ArrayList<Item> items; // must be "Item" because we are using a class to create an ArrayList
    // constructor
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    // whne item is added it adds to additional weight 
    public int totalWeight() {
        int newWeight = 0;
        for (Item i : items) {
            newWeight += i.getWeight();
        }
        return newWeight;
    }
    // add items to list as ong as it does not exceed maxWeight
    public void addItem(Item item){
        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            items.add(item);
        }
        return;
    }
    // prints all items in a list
    public void printItems(){
        for(Item i : items){
            System.out.println(i);
        }
    }
    // returns largest item based on weight
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for(Item i : items){
            if(i.getWeight() > heaviestItem.getWeight()){
                heaviestItem = i;
            }
        }
        return heaviestItem;

    }
    // string format 
    public String toString(){
        String weight = " (" + totalWeight() + "kg)";
        String item = "";
        if(items.isEmpty()){return "no items (0 kg)";
        } else if (items.size() == 1){return "1 item " + "("+totalWeight()+" kg)";
        } else{item = items.size() + " items";
        } return item + weight;

        // if(items.isEmpty()){
        //     return "no items (" + this.maxWeight + ")";
        // }
        // return items.size() + " items " + " (" + this.maxWeight + ")"; 
        // // must use items.size to return th toal amount of items in list 
    }
}
