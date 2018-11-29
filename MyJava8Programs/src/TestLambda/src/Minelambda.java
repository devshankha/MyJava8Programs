interface Drawable {
	void draw();
}

interface Sayable {
	void say(String s);
}

public class Minelambda {
	static void mmm (Drawable d) {
		d.draw();
		
	}
	
	public static void main(String[] args) {
		Drawable d = ()-> {
			System.out.println("Drawing mine");
		};
		mmm(d);
		Sayable s1 = (String m) -> {
			System.out.println("Saying this "+m);
			
		};
		s1.say("cool");
		
	}

}
