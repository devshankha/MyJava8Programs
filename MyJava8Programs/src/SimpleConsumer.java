import java.util.function.Consumer;

class Cons {
	String m;

	public Cons(String m) {
		super();
		this.m = m;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}
	
	
	
}
public class SimpleConsumer {
	public static void main(String[] args) {
		Consumer<Cons> consumer =(s)-> System.out.println(s.getM());
		consumer.accept(new Cons("kaju"));
		
	}

}
