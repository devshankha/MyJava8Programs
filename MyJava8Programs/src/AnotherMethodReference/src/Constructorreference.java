interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class Constructorreference {
	public static void main(String[] args) {
		Messageable m = Message::new;
		m.getMessage("Hello");
		
	}

}
