import java.util.ArrayList;

public class Room {
    // instance variable of ArrayList of Person class
    private ArrayList<Person> inRoom;

    // constructor for class Room
    public Room(){
        this.inRoom = new ArrayList<>();
    }
    // add person object to list
    public void add(Person person){
        this.inRoom.add(person);
    }
    // ensure list is not empty
    public boolean isEmpty(){
        if(this.inRoom.isEmpty()){
            return true;
        }
        return false;
    }
    // return list of person
    public ArrayList<Person> getPersons(){
        return this.inRoom;
    }
    // return shortest person in list

    public Person shortest() {

        if (inRoom.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.inRoom.get(0);

        for (Person e : inRoom) {
            if (e.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = e;
            }
        }
        return shortestPerson;
    }
    // public Person shortest(){
    //     if(isEmpty()){
    //         return null;
    //     }

    //     Person shortPerson = this.inRoom.get(0);

    //     for(Person i : inRoom){
    //         if(i.getHeight() < shortPerson.getHeight()){
    //             shortPerson = i;
    //         }
    //     }
    //     return shortPerson;
    // }
    // takes the shortest person in the room. When a room is empty, it returns a null reference.
    public Person take(){

        if(inRoom.isEmpty()){
            return null;
        }

        Person mostShort = shortest();
        this.inRoom.remove(shortest());
        return mostShort;
    }
}
