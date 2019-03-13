/**
 * Test Class for HealthyPerson
 * @author Brian
 */
import org.junit.Assert;
import org.junit.Test;

public class HealthyPersonTest {
	/**
	 * A method to test compareToImpl()
	 */
	@Test
	public void testCompareToImpl() {
		HealthyPerson ani = new HealthyPerson("Bob", 10, "Visit");
		HealthyPerson ani2 = new HealthyPerson("Ross", 10, "Visiting");
		Assert.assertEquals("Bob".compareTo("Ross"), ani.compareToImpl(ani2));
		Assert.assertEquals("Ross".compareTo("Bob"), ani2.compareToImpl(ani));
	}
	/**
	 * A method to test toString()
	 */
	@Test
	public void testToString() {
		HealthyPerson ani = new HealthyPerson("Bob", 10, "Visit");
		Assert.assertEquals("Bob, a 10-year old. In for Visit", ani.toString());
	}
	/**
	 * A method to test the constructor HealthyPerson()
	 */
	@Test
	public void testHealthyPerson() {
		HealthyPerson ani = new HealthyPerson("Bob", 10, "Visit");
		Assert.assertEquals("Bob, a 10-year old. In for Visit", ani.toString());
		Assert.assertEquals("Bob", ani.getName());
		Assert.assertEquals(10, ani.getAge());
	}

}
