package lab7;

import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>{

	Queue<PatientType> hospital;
	public QueueHospital()
	{
		hospital = new LinkedList<>();
		
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
		return "QueueHospital";
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
