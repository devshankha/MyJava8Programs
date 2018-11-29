import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamConvert {
	public static void main(String[] args) {
		Stream.of("a1","a2","a3")
		.map(s->s.substring(1))
		.mapToInt(s->Integer.parseInt(s))
		.max().ifPresent(s->System.out.println(s));
		IntStream.range(1, 4)
	    .mapToObj(i -> "a" + i)
	    .forEach(System.out::println);

		
	}

}
