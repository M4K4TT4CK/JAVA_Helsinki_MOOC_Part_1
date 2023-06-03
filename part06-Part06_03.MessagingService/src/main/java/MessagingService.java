import java.util.ArrayList;

public class MessagingService {
 
    private ArrayList<Message> newMessage;
 
    public MessagingService() {
        this.newMessage = new ArrayList<>();
    }
 
    public void add(Message message) {
        String m = message.getContent();
        if (m.length() <= 280) {
            this.newMessage.add(message);
        }
    }
 
    public ArrayList<Message> getMessages() {
        return this.newMessage;
    }
}
