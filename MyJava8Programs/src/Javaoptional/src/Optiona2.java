import java.util.Optional;

public class Optiona2 {
	public static void main(String[] args) {
		
		Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

      /*  if (gender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }*/

        //gender.ifPresent(g -> System.out.println("In gender Option, value available."));
        Optional<String> gender1 = Optional.of("MALE");
        Optional<String> emptyGender1 = Optional.empty();

        System.out.println(gender1.orElse("<N/A>")); //MALE
        System.out.println(emptyGender1.orElse("<N/A>")); //<N/A>
		
		
	 Integer s1 = null;
	  Optional<Integer> op 
          = Optional.empty();
		 
		  Integer s = op.orElseGet(()->77 );
		  System.out.println(s);

		
	}

}
