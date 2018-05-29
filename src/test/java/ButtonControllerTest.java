import org.junit.Test;
import org.junit.Assert;
public class ButtonControllerTest {
	ButtonController button = new ButtonController();
	@Test
	public int button(String button) {
		int underTest = button("1");
		Assert.assertEquals("1", underTest);
	}
	
	

}
