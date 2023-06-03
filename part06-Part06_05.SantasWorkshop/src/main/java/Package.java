import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> packages;

    public Package(){
        this.packages = new ArrayList<>();
    }
    // which adds the gift passed as a parameter to the package. 
    // The method returns no value.
    public void addGift(Gift gift){
        if(!(this.packages.contains(gift))){
            this.packages.add(gift);
        }
    }
    // returns the total weight of the package's gifts
    public int totalWeight(){
        int i = 0;
        for(Gift gift : packages){
            i = i + gift.getWeight();
        }
        return i;
    }
}
