import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Person1 {
	int age;

	public Person1(int age) {
		super();
		this.age = age;
	}
	
	
	
}
public class TestingSupplier {
	public static void main(String[] args) {
		List<Person1> persons = new ArrayList<Person1>();
		persons.add(new Person1(45));
		persons.add(new Person1(13));
		persons.add(new Person1(51));
		persons.add(new Person1(87));
		Supplier<Stream<Person1>> s = ()-> persons.stream();
		boolean s1 = s.get().allMatch(p->p.age > 1);
		System.out.println(s1);
		boolean s2 = s.get().allMatch(p->p.age > 11);
		System.out.println(s2);
		boolean s3 = s.get().allMatch(p->p.age > 17);
		System.out.println(s3);
		
	}

}
