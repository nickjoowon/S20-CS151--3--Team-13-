package model;

import java.util.ArrayList;

/**
 * Keeps track of Patients in database 
 * @author johnsonhsiung
 *
 */
public class PatientModel {

	public ArrayList<Patient> patientList;
	
	/**
	 * creates a patient list and adds two test case patients
	 */
	public PatientModel()
	{
		patientList = new ArrayList<Patient>(); 
		Patient test = new Patient("01309123","06/05/2000","Johnson","Hsiung","03/02/1999","Male","6403834034","8913421146","1481 oliver","NA","Santa Clara","CA","95051","USA","12312123");
		test.setTinAndCusDesc("he boutta die uh oh");
		test.setOccupation("noob");
		test.setEduDeg("elementary school");
		test.setWorkStatus("President");
		test.addMedicine(new Medicine("phosphorus", "johnson", "5 mg", "10 sec", "white", "inhale", "needle", "10 mg", "none"));
		test.addMedicine(new Medicine("sodium", "johnson", "15 mg", "20 sec", "brown", "spit", "injection", "210 mg", "death"));
		patientList.add(test); 

		Patient test1 = new Patient("000001","06/2/2000","Marco","Romagna ;)","5/13/1999","Male","01236","1293921","91023","12321","San Jose","CA","99999","USA","3951");
		test1.setTinAndCusDesc("he die maybe in 2 days");
		test1.setOccupation("student");
		test1.setEduDeg("westmont high school");
		test1.setWorkStatus("good");
		patientList.add(test1); 
	}
	/**
	 * adds a patient to the patient list
	 * @param patient
	 */
	public void addPatient(Patient patient)
	{
		patientList.add(patient); 
	}
	/**
	 * returns the patient at the index of patient list
	 * @param index
	 * @return
	 */
	public Patient getPatient(int index)
	{
		return patientList.get(index);
	}
	
	/**
	 * returns the size of the patient list
	 * @return
	 */
	public int getSize()
	{
		return patientList.size(); 
	}
	
	/**
	 * removes the most recently added patient from the patient list
	 */
	public void undoPatient()
	{
		patientList.remove(patientList.size()-1); 
	}
	
	/**
	 * removes patient from patient list
	 * @param p
	 */
	public void removePatient(Patient p)
	{
		for(int i = 0; i < getSize(); i++)
		{
			if(p.equals(getPatient(i)))
			{
				patientList.remove(i);
			}
		}
	}
	
	/**
	 * returns the string of all patient last names in the patient list 
	 */
	public String toString()
	{
		String patientNames =" ";
		for (Patient a: patientList)
		{
			patientNames += a.getLastName() + " "; 
		}
		return patientNames; 
	}

}
