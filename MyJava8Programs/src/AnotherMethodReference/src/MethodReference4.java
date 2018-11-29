import java.util.function.BiFunction;

class MathOperation {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
}
public class MethodReference4 {
	
	public static void main(String[] args) {
		MathOperation ls = new MathOperation();
		BiFunction<Integer,Integer,Integer> ms = (a,b)-> a+b;
		int k =ms.apply(5,6);
		BiFunction<Integer,Integer,Integer> m = ls::add;
		m.apply(10,20);
		
		
	}

}
