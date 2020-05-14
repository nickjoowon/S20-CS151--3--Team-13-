package Model;

import java.util.ArrayList;

public class PatientModel {
	
	private ArrayList<Patient> patientList;
	
	/**
	 * 
	 * @param patientList a list of patients
	 */
	public PatientModel(ArrayList<Patient> patientList) {
		this.patientList = patientList;
	}
	
	
	public void addPatient(Patient p) {
		patientList.add(p);
	}
}
