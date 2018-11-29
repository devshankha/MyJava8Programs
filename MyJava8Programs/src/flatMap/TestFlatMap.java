import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Programmer {
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	String name;
	public Programmer(String name) {
		super();
		this.name = name;
		languages = new ArrayList<String>();
	}
	List<String> languages;
	void add(String l) {
		languages.add(l);
		
	}
}
public class TestFlatMap {
	public static void main(String[] args) {
		Programmer p1 = new Programmer("Ravi");
		p1.add("Java");
		p1.add("python");
		Programmer p2 = new Programmer("Haju");
		p2.add("Java");
		p2.add("ruby");
		List<Programmer> l1 = Arrays.asList(p1,p2);
		l1.stream().map(l->l.getLanguages()).flatMap(l->l.stream())
		.forEach(s->System.out.print(s+" "));
		
	}

}
