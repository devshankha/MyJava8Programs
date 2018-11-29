import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Computer {
	public void setSoundcard(Optional<Soundcard> soundcard) {
		this.soundcard = soundcard;
	}

	private Optional<Soundcard> soundcard;

	public Optional<Soundcard> getSoundcard() {
		return soundcard;
	}

}

class Soundcard {
	public Soundcard(Optional<USB> usb) {
		super();
		this.usb = usb;
	}

	private Optional<USB> usb;

	public Optional<USB> getUSB() {
		return usb;
	}

}

class USB{
  public String getVersion(){ return "123"; }
}
public class TestOptional {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		USB us = new USB();
		Optional<USB> us1 = Optional.ofNullable(us);
		Soundcard s2 = new Soundcard(us1);
		Optional<Soundcard> card = Optional.ofNullable(s2);
		c1.setSoundcard(card);
		Optional<Computer> c = Optional.ofNullable(c1) ;
		String name = c.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
		c.flatMap(s->s.getSoundcard()).flatMap(s->s.getUSB()).map(s->s.getVersion())
		.orElse("UNKNOWN");
		System.out.println(name);
		
		
	}

}
