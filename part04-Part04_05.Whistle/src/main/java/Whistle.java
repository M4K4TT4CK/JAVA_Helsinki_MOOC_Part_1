public class Whistle {
    private String sound; // instance variable; private to not be modfied

    public Whistle(String whistleSound){ // constructor

        this.sound = whistleSound;

    }

    public void sound(){

        System.out.println(this.sound);

    }
    
}
