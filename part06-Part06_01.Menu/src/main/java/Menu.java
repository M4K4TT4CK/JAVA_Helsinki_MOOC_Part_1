
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // add meals to arraylist as long as it is list
    public void addMeal(String meal){
        if(!meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    // print all meals in list
    public void printMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }
    // clear menu
    public void clearMenu(){
        meals.clear();
    }

    // implement the required methods here
}
