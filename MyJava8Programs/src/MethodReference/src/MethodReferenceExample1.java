
interface Sayable {
	void say();
	
}


class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
}
public class MethodReferenceExample1 {
	public static void main(String[] args) {
		  Sayable sayable = MethodReference::saySomething;  
	        // Calling interface method  
	        sayable.say();  
		
	}

}
