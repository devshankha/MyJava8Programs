import java.util.ArrayList;
import java.util.List;

class Goodperson {
	int age;

	public Goodperson(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Goodperson [age=" + age + "]";
	}
	
	
}
public class ReducePerson {
	public static void main(String[] args) {
		List<Goodperson> l1 = new ArrayList<Goodperson>();
		l1.add(new Goodperson(13));
		l1.add(new Goodperson(57));
		l1.add(new Goodperson(16));
		l1.add(new Goodperson(29));
		l1.stream().reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
	    .ifPresent(s->System.out.println(s)); 
		
	}

}
