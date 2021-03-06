
import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>{
	/**
	 * Internal Queue to store the patients
	 */
	Queue<PatientType> hospital;
	/**
	 * Basic constructor to initialize the Queue hospital
	 */
	public QueueHospital()
	{
		hospital = new LinkedList<>();
		
	}
	/**
	 * Adds the patient patient to the hospital queue
	 */
	@Override
	public void addPatient(PatientType patient) {
		hospital.add(patient);
	}
	/**
	 * A method to return, but not treat the patient at the front of the queue
	 * @return the patient in the front of the queue
	 */
	@Override
	public PatientType nextPatient() {
		return hospital.peek();
	}
	/**
	 * A method to return and treat the patient at the front of the queue.
	 * @return the patient at the front of the queue
	 */
	@Override
	public PatientType treatNextPatient() {
		return hospital.poll();
	}
	/**
	 * returns the amount of patients in this hospital
	 * @return the size of hospital
	 */
	@Override
	public int numPatients() {
		return hospital.size();
	}
	/**
	 * A method to see what type of hospital this is.
	 * @return the string "QueueHospital"
	 */
	@Override
	public String hospitalType() {
		return "QueueHospital";
	}
	/**
	 * A method to return a string representing all the patients in the hospital
	 * @return a concantenated string of all the patients in the hospital
	 */
	@Override
	public String allPatientInfo() {
		String str = "";
		for(PatientType p: hospital)
		{
			str = str + p;
		}
		return str;
	}
	

}
