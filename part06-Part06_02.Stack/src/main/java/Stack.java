
import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stacks;

    // initilize array list in constructor
    public Stack(){
        this.stacks = new ArrayList<>();
    }
    // return boolean if list is empty
    public boolean isEmpty(){
        if(this.stacks.isEmpty()){
            return true;
        }
        return false;
    }
    // add item to list as long as it is not in list
    public void add(String value){
        if(!(this.stacks.contains(value))){
            this.stacks.add(value);
        }
    }
    // return list
    public ArrayList<String> values(){
        return stacks;
    }
    //returns the topmost value (i.e., the last value 
    // added to the deque) and removes it from the stack.
    public String take() {
        String last = this.stacks.get(this.stacks.size() - 1);
        this.stacks.remove(last);
        return last;
    }
}
