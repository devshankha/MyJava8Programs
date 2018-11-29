import java.util.ArrayList;
import java.util.List;

public class MethodReference5 {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("first");
		l1.add("second");
		l1.add("third");
		l1.stream().map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));
		System.out.println("-----------");
		l1.stream().map(String::toUpperCase).forEach(System.out::print);
	}

}
