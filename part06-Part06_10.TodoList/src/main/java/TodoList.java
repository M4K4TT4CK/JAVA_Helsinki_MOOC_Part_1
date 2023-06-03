import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDoList;

    public TodoList(){
        this.toDoList = new ArrayList<>();
    }

    public void add(String task){
        toDoList.add(task);
    }

    public void print(){
        int index = 1;
        for(String i : toDoList){
            System.out.println(index + ": " + i);
            index++;
        }
        // for (int i = 0; i < this.tasks.size(); i++) {
        //     System.out.println((i + 1) + ": " + this.toDoList.get(i));
        // }
    }

    public void remove(int number){
        toDoList.remove(number - 1);
    }


    
}
