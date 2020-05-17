package model;

import java.util.ArrayList;

/**
 * Keeps track of Patients in database 
 * @author johnsonhsiung
 *
 */
public class PatientModel {

	public ArrayList<Patient> patientList;
	
	public PatientModel()
	{
		patientList = new ArrayList<Patient>(); 
	}
	public void addPatient(Patient patient)
	{
		patientList.add(patient); 
	}
	public Patient getPatient(int index)
	{
		return patientList.get(index);
	}
	public int getSize()
	{
		return patientList.size(); 
	}

}
