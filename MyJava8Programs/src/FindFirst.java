import java.util.ArrayList;
import java.util.List;

public class FindFirst {
	public static void main(String[] args) {
		List<String> s1 = new ArrayList<String>();
		s1.add("david");
		s1.add("raju");
		s1.add("kaju");
		s1.stream().findFirst().ifPresent(s->System.out.println(s));
		
	}

}
