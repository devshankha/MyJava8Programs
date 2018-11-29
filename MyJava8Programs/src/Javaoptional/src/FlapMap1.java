import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
class Developer {
	public List<String> getLanguages() {
		return languages;
	}
	
	public Developer(String name) {
		super();
		this.name = name;
		this.languages = new ArrayList<>();
	}
	void add(String l) {
		languages.add(l);
		
	}
	String name;
	List<String> languages;
	
}

public class FlapMap1 {
	public static void main(String[] args) {
		Developer d1 = new Developer("david");
		d1.add("Java");
		d1.add("C++");
		Developer d2 = new Developer("raju");
		d2.add("python");
		d2.add("scala");
		List<Developer> l1 = new ArrayList<>();
		l1.add(d1);
		l1.add(d2);
		l1.stream().flatMap(l->l.getLanguages().stream())
		.forEach(System.out::println);
		System.out.println("------------");
		l1.stream().map(l->l.getLanguages()).flatMap(l->l.stream())
		.forEach(l->System.out.print(l+" "));
		
		
	}

}
