
import java.util.ArrayList;

public class SimpleCollection {
    // instance variables
    private String name;
    private ArrayList<String> elements;
    // constructor 
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    // add item to ArrayList
    public void add(String element) {
        this.elements.add(element);
    }
    // return all items in ArrayList
    public ArrayList<String> getElements() {
        return this.elements;
    }

    // returns the longest string of the collection. 
    // If the collection is empty, the method should return a null reference.
    public String longest(){

        if(elements.isEmpty()){
            return null;
        }
        String i = "";
        for(String words : elements){
            if(i.length() < words.length()){
                i = words;
            }
        }
        return i;
    }

}
