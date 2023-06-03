
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        } 
        return false;
    }

    public int priceDifference(Apartment compared){
        int apt1 = this.squares * this.princePerSquare;
        int apt2 = compared.squares * compared.princePerSquare;
        if (apt1 > apt2){
            return (apt1 - apt2);
        } else{
            return (apt2 - apt1);
        }
    }
    public boolean moreExpensiveThan(Apartment compared){
        int price1  = this.squares * this.princePerSquare;
        int price2 = compared.squares * compared.princePerSquare;
        if(price1 > price2){
            return true;
        } else{
            return false;
        }
        
    }
}
