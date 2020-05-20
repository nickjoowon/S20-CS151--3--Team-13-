package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatientTester {

	@Test
	void testGetInfoOfMedication() {
		Patient patient = new Patient("01309123","06/05/2000","Johnson","Hsiung","03/02/1999","Male","6403834034","8913421146","1481 oliver","NA","Santa Clara","CA","95051","USA","12312123");
		Medicine med = new Medicine("phosphorus", "johnson", "5 mg", "10 sec", "white", "inhale", "needle", "10 mg", "none");
		patient.addMedicine(med);
		
		assert med.getInfo()[2].equals(patient.getInfoOfMedication("phosphorus")[2]);
	}

	@Test
	void testGetMedicineString() {
		Patient patient = new Patient("01309123","06/05/2000","Johnson","Hsiung","03/02/1999","Male","6403834034","8913421146","1481 oliver","NA","Santa Clara","CA","95051","USA","12312123");
		Medicine med = new Medicine("phosphorus", "johnson", "5 mg", "10 sec", "white", "inhale", "needle", "10 mg", "none");
		patient.addMedicine(med);
		assert med.equals(patient.getMedicine("phosphorus"));
		
		
	}

	@Test
	void testGetLastVisit() {
		Patient patient = new Patient("01309123","06/05/2000","Johnson","Hsiung","03/02/1999","Male","6403834034","8913421146","1481 oliver","NA","Santa Clara","CA","95051","USA","12312123");
		Visit visit = new Visit("1","2","3","4",false,true,true); 
		patient.addVisit(visit);
		assert visit.equals(patient.getLastVisit());
		
	}

}
