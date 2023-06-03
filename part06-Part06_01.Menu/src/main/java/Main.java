
public class Main {
    public static void main(String[] args) { 
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");
          
        menu.printMeals();
        menu.clearMenu();
          
        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
        
        // When you have completed the method clearMenu()
        // you can remove the comments below
        menu.clearMenu();
        menu.printMeals();
    }
}
