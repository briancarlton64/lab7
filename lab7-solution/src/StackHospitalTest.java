/**
 * A test class for StackHospital
 */
import org.junit.Assert;
import org.junit.Test;

public class StackHospitalTest {
	/**
	 * A method to test addPatient()
	 */
	@Test
	public void testAddPatient() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		SickPerson ani3 = new SickPerson("Bob", 10, 120);
		HealthyPerson ani2 = new HealthyPerson("Ross", 12, "visit");
		StackHospital<Person> hospital = new StackHospital<Person>();
		hospital.addPatient(ani);
		hospital.addPatient(ani2);
		hospital.addPatient(ani3);
		Assert.assertEquals(ani3, hospital.nextPatient());
		hospital.treatNextPatient();
		Assert.assertEquals(ani2, hospital.nextPatient());
		hospital.treatNextPatient();
		Assert.assertEquals(ani, hospital.nextPatient());
	}
	/**
	 * A method to test nextPatient()
	 */
	@Test
	public void testNextPatient() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		SickPerson ani3 = new SickPerson("Bob", 10, 120);
		StackHospital<Person> hospital = new StackHospital<Person>();
		hospital.addPatient(ani);
		hospital.addPatient(ani3);
		Assert.assertEquals(ani3, hospital.nextPatient());
		Assert.assertEquals(ani3, hospital.nextPatient());
	}
	/**
	 * A method to test treatNextPatient()
	 */
	@Test
	public void testTreatNextPatient() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		SickPerson ani3 = new SickPerson("Bob", 10, 120);
		StackHospital<Person> hospital = new StackHospital<Person>();
		hospital.addPatient(ani);
		hospital.addPatient(ani3);
		Assert.assertEquals(ani3, hospital.treatNextPatient());
		Assert.assertEquals(ani, hospital.nextPatient());
	}
	/**
	 * A method to test numPatients()
	 */
	@Test
	public void testNumPatients() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		SickPerson ani3 = new SickPerson("Bob", 10, 120);
		StackHospital<Person> hospital = new StackHospital<Person>();
		hospital.addPatient(ani);
		hospital.addPatient(ani3);
		Assert.assertEquals(2, hospital.numPatients());
		
	}
	/**
	 * A method to test hospitalType()
	 */
	@Test
	public void testHospitalType() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		SickPerson ani3 = new SickPerson("Bob", 10, 120);
		StackHospital<Person> hospital = new StackHospital<Person>();
		hospital.addPatient(ani);
		hospital.addPatient(ani3);
		Assert.assertEquals("StackHospital", hospital.hospitalType());
	}
	/**
	 * A method to test allPatientInfo
	 */
	@Test
	public void testAllPatientInfo() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		SickPerson ani3 = new SickPerson("Bob", 10, 120);
		HealthyPerson ani2 = new HealthyPerson("Ross", 12, "visit");
		StackHospital<Person> hospital = new StackHospital<Person>();
		hospital.addPatient(ani);
		hospital.addPatient(ani2);
		hospital.addPatient(ani3);
		Assert.assertEquals("Bob, a 10-year old. Severity level 12Ross, a 12-year old. In for visitBob, a 10-year old. Severity level 120", hospital.allPatientInfo());

	}
	/**
	 * 	A method to test the constructor method StackHospital()
	 */
	@Test
	public void testStackHospital() {
		SickPerson ani = new SickPerson("Bob", 10, 12);
		SickPerson ani3 = new SickPerson("Bob", 10, 120);
		HealthyPerson ani2 = new HealthyPerson("Ross", 12, "visit");
		StackHospital<Person> hospital = new StackHospital<Person>();
		hospital.addPatient(ani);
		hospital.addPatient(ani2);
		hospital.addPatient(ani3);
		Assert.assertEquals(ani3, hospital.nextPatient());
		hospital.treatNextPatient();
		Assert.assertEquals(ani2, hospital.nextPatient());
		hospital.treatNextPatient();
		Assert.assertEquals(ani, hospital.nextPatient());
		Assert.assertEquals("StackHospital", hospital.hospitalType());
	}

}
