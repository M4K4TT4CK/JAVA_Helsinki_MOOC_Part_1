public class Room {
    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats){ // constructor for instance variables
                                                    // java will create once if not defined by user
        this.code = classCode;
        this.seats = numberOfSeats;

    }

}
