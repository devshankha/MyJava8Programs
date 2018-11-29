import java.util.Arrays;

public class ArrayStream {
	public static void main(String[] args) {
		int arr[]= {1,5,8};
		System.out.println(Arrays.stream(arr).sum());
		System.out.println(Arrays.stream(arr).max());
		System.out.println(Arrays.stream(arr).min());
		long f = Arrays.stream(arr).count();
		System.out.println(f);
		
	}

}



