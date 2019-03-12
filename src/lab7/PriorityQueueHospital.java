package lab7;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType> {

	Queue<PatientType> hospital;
	public PriorityQueueHospital()
	{
		hospital = new PriorityQueue<>();
		
	}
	@Override
	public void addPatient(PatientType patient) {
		hospital.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		return hospital.peek();
	}

	@Override
	public PatientType treatNextPatient() {
		return hospital.poll();
	}

	@Override
	public int numPatients() {
		return hospital.size();
	}

	@Override
	public String hospitalType() {
		return "PriorityQueueHospital";
	}

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
