
package stuff;

import java.util.ArrayList;

public class PatientDataBase {

	private ArrayList<Patient> patientList;
	
	public PatientDataBase() {}
	/**
	 *  takes neccesary fields from a patient's info and adds a patient to the database
	 */
	public void addPatient(int socialSecureNum,int insuranceNum, int dateAdded, String fullName, int birthDay, String gender, int phoneNum,
			String address, ArrayList<Medicine> medicineList, boolean hyperacusis, boolean tinnitus, String hypercusisCause, String tinnitusCause)
	{
		
	}
	/**
	 *  deletes a specific patient
	 */
	public void deletePatient(int patientNum)
	{
		
	}
	/**
	 *  deletes last added patient (if they hit undo upon registering a patient)
	 */
	public void deleteMostRecentPatient()
	{
		
	}
	
}
