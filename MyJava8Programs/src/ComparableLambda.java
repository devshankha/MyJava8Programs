import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
	int age;

	public Person(int age) {		
		this.age = age;
	}
	
	
}
public class ComparableLambda {
	public static void main(String[] args) {
	String []ml ={"avijit","david","raju","hussain","aftab"};
		Arrays.sort(ml,(s1,s2)->s2.compareTo(s1));
		System.out.println(Arrays.asList(ml));
	}

	
	

}
