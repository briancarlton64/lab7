import org.junit.*;



/**
 * Class to test the Animal Methods
 * @author Brian
 *
 */
public class AnimalTest {

	/**
	 * Test method for {@link Animal#Animal(java.lang.String, int)}.
	 */
	@Test
	public void testAnimal() {
		Animal ani = new Animal("Cat", 10);
		Assert.assertEquals("Cat", ani.getBreed());
		Assert.assertEquals(10, ani.getAge());
	}

	/**
	 * Test method for {@link Animal#getBreed()}.
	 */
	@Test
	public void testGetBreed() {
		Animal ani = new Animal("Cat", 10);
		Assert.assertEquals("Cat", ani.getBreed());
	}

	/**
	 * Test method for {@link Animal#getAge()}.
	 */
	@Test
	public void testGetAge() {
		Animal ani = new Animal("Cat", 10);
		Assert.assertEquals(10, ani.getAge());
	}

	/**
	 * Test method for {@link Animal#toString()}.
	 */
	@Test
	public void testToString() {
		Animal ani = new Animal("Cat", 10);
		Assert.assertEquals("A 10-year old Cat.", ani.toString());
	}

	/**
	 * Test method for {@link Animal#compareTo(Animal)}.
	 */
	@Test
	public void testCompareTo() {
		Animal ani = new Animal("Cat", 10);
		Animal ani2 = new Animal("Dog", 10);
		Assert.assertEquals(0, ani.compareTo(ani2));
		Assert.assertEquals(0, ani2.compareTo(ani));
		Animal ani3 = new Animal("Cat", 10);
		Animal ani4 = new Animal("Dog", 11);
		Assert.assertEquals(1, ani3.compareTo(ani4));
		Assert.assertEquals(-1, ani4.compareTo(ani3));
	}

}
