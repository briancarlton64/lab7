/**
 * Test Class for SickPerson
 * @author Brian
 */
import org.junit.Assert;
import org.junit.Test;

public class SickPersonTest {
	/**
	 * A method to test compareToImpl()
	 */
	@Test
	public void testCompareToImpl() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		SickPerson ani2 = new SickPerson("Ross", 10, 13);
		Assert.assertEquals(1, ani.compareTo(ani2));
		Assert.assertEquals(-1, ani2.compareTo(ani));
	}
	/**
	 * A method to test toString()
	 */
	@Test
	public void testToString() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		Assert.assertEquals("Bob, a 10-year old. Severity level 12", ani.toString());
	}
	/**
	 * A method to test the constructor SickPerson()
	 */
	@Test
	public void testSickPerson() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		Assert.assertEquals("Bob, a 10-year old. Severity level 12", ani.toString());
		Assert.assertEquals("Bob", ani.getName());
		Assert.assertEquals(10, ani.getAge());
	}

}
