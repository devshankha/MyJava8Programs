import java.util.Optional;

class Emp {
	Emp getPerson() {
		return this;
	}
	
}
public class Optional3 {
	public static void main(String[] args) {
		Optional<Emp> opt = Optional.ofNullable(null);
		Emp p = opt.orElse(new Emp());
		
	}

}
