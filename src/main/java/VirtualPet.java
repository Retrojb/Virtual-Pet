import java.time.Clock;
import java.time.Duration;
import java.util.concurrent.CountDownLatch;

public class virtualPet {
	public static final int BASE = 50;
	public int hunger = BASE;
	public int thirst = BASE;
	public int rest = BASE;
	public int play = BASE;

	public String baseHappy = "Happy";

	public void feed() {
		this.hunger += 10;
		this.rest -= 10;
	}

	public void drink() {
		this.thirst += 10;
		this.play -= 10;
	}

	public void sleep() {
		this.rest += 10;
		this.thirst -= 10;
	}

	public void play() {
		this.play += 10;
		this.hunger -= 10;
	}
}
	