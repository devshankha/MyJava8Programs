interface Sayable {
	void say();
}
class MethodReference {
	void saySomething() {
		System.out.println("Printing the method refernce");
	}
}
public class MethodReferenceExample2 {
	public static void main(String[] args) {
		MethodReference instance = new MethodReference();
		Sayable s = instance::saySomething;
		s.say();
		
		
	}

}
