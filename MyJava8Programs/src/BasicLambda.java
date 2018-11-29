
public class BasicLambda {
	public static void main(String[] args) {
		Runnable r1 =()-> System.out.println("This is from r1");
		new Thread(r1).start();
		Runnable r2 =()-> {
			System.out.println("This is from r2");
			System.out.println("This is great");			
		};
		new Thread(r2).start();
	}

}
