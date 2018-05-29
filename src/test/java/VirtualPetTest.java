import org.junit.Test;
import org.junit.Assert;
public class VirtualPetTest {
	virtualPet pet = new virtualPet();

	@Test
	public void tick2() {
		int underTest = pet.tick2();
		Assert.assertEquals(1, underTest);
	}
	@Test
	public void hunger() {
		int undertest = pet.hunger(70);
		Assert.assertEquals(70, undertest);
	}
	@Test
	public void thirst() {
		int undertest = pet.drink(60);
		Assert.assertEquals(60, undertest);
	}
	@Test
	public void rest() {
		int undertest = pet.rest(60);
		Assert.assertEquals(60, undertest);
	}
	@Test
	public void play() {
		int undertest = pet.drink(60);
		Assert.assertEquals(60, undertest);
	}
}
