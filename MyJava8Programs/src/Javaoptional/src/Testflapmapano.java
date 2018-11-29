import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testflapmapano {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("a","b");
		List<String> l2 = Arrays.asList("c","d");
		List<String> lm =Stream.of(l1,l2).flatMap(s->s.stream()).collect(Collectors.toList());
		System.out.println(lm);
	}

}
