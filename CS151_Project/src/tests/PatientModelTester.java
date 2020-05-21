package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Patient;
import model.PatientModel;

class PatientModelTester {

	@Test
	void testPatientModel() {
		PatientModel test = new PatientModel();
		assert test.getSize() == 2; 
	}

	@Test
	void testAddPatient() {
		
		PatientModel test = new PatientModel(); 
		Patient patient = new Patient("01309123","06/05/2000","Johnson","Hsiung","03/02/1999","Male","6403834034","8913421146","1481 oliver","NA","Santa Clara","CA","95051","USA","12312123");
		test.addPatient(patient);
		assert test.getPatient(test.getSize()-1).equals(patient); 
	}

	@Test
	void testGetPatient() {
		PatientModel test = new PatientModel(); 
		Patient patient = new Patient("01309123","06/05/2000","Johnson","Hsiung","03/02/1999","Male","6403834034","8913421146","1481 oliver","NA","Santa Clara","CA","95051","USA","12312123");
		test.addPatient(patient);
		assert test.getPatient(test.getSize()-1).equals(patient); 
		
	}

	@Test
	void testGetSize() {
		PatientModel test = new PatientModel();
		assert test.getSize() == 2; 
	}

	@Test
	void testUndoPatient() {
		PatientModel test = new PatientModel();
		test.undoPatient(); 
		assert test.getSize() == 1; 
	}

	@Test
	void testRemovePatient() {
		PatientModel test = new PatientModel();
		
		test.removePatient(test.getPatient(1));
		assert test.getSize() == 1; 
		
	}



}
