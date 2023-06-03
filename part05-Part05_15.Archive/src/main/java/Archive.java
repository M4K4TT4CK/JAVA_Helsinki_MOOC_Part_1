
public class Archive {
 
    private String name;
    private String identifier;
 
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
 
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
 
        if (!(compared instanceof Archive)) {
            return false;
        }
 
        Archive comparedItem = (Archive) compared;
 
        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }
 
        return false;
    }
    // statement to create string in out the two instance variables are dispalyed in the toString
    // default print statement
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}