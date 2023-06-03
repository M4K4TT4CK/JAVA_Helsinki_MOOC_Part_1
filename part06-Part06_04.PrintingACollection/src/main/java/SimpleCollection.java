
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String words = "";
        int i = 0;
        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        if(elements.size() ==1){
            words = words + elements.get(i);
            i = 1;
        } else{
            for(String ele: elements){
                words = words + ele + "\n";
                i = i+1;
            }
        }
        if(i==1){
            return "The collection " + this.name + " has " + i + " element:\n" + words;
        }
        return "The collection " + this.name + " has " + i + " elements:\n" + words;
    }
}
