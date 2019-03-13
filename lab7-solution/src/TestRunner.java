/**
 * 
 * TestRunner class for the purposes of code coverage checking.
 * @author Brian
 *
 */
public class TestRunner {
	public static void main(String[] args) {
		HealthyPersonTest a = new HealthyPersonTest();
		SickPersonTest b= new SickPersonTest();
		StackHospitalTest c = new StackHospitalTest();
		PriorityQueueHospitalTest d = new PriorityQueueHospitalTest();
		QueueHospitalTest e = new QueueHospitalTest();
		AnimalTest f = new AnimalTest();
		a.testCompareToImpl();
		a.testHealthyPerson();
		a.testToString();
		b.testCompareToImpl();
		b.testSickPerson();
		b.testToString();
		c.testAddPatient();
		c.testAllPatientInfo();
		c.testHospitalType();
		c.testNextPatient();
		c.testNumPatients();
		c.testNumPatients();
		c.testStackHospital();
		c.testTreatNextPatient();
		d.testAddPatient();
		d.testAllPatientInfo();
		d.testHospitalType();
		d.testNextPatient();
		d.testNumPatients();
		d.testPriorityQueueHospital();
		d.testTreatNextPatient();
		e.testAddPatient();
		e.testAllPatientInfo();
		e.testHospitalType();
		e.testNextPatient();
		e.testNumPatients();
		e.testQueueHospital();
		e.testTreatNextPatient();
		f.testAnimal();
		f.testCompareTo();
		f.testGetAge();
		f.testGetBreed();
		f.testToString();
	}
}
