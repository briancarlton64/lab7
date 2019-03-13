

import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType> {
	Stack<PatientType> hospital;
	public StackHospital()
	{
		hospital = new Stack<>();
		
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
		return hospital.pop();
	}

	@Override
	public int numPatients() {
		return hospital.size();
	}

	@Override
	public String hospitalType() {
		return "StackHospital";
	}

	@Override
	public String allPatientInfo() {
		String str = "";
		for(PatientType p : hospital)
		{
			str =str + p;
		}
		return str;
	}
	

}
