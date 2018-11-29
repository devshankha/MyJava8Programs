interface Predicate {
	boolean test (int n);
}
class EvenOddCheck {
	static boolean isEven (int n) {
		return n%2 == 0;
	}
}
public class MethodReferenceExample3 {
	public static void main(String[] args) {
		Predicate p1 = EvenOddCheck::isEven;
		System.out.println(p1.test(4));
		Predicate p2 = n -> EvenOddCheck.isEven(n);
		System.out.println(p1.test(4));
	}

}
