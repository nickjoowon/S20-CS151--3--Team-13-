package Model;

import java.util.ArrayList;

/**
 * Models a patient of the clinic. It contains information about itself, including the medications it is currently taking and the visits it has. 
 * @author johnsonhsiung
 *
 */
public class Patient {

	//required info
	private int socialSecureNum;
	private int insuranceNum;
	private String dateAdded;
	private String fullName;
	private String birthDay;
	private String gender;
	private int phoneNum;
	private String address;
	private int patientID;
	private int sequenceNum;
	//optional info
	private String occupation;
	private String workStatus;
	private String educationDeg;
	//Tinnitus and Hyperacusus status
	private String tinAndCusStatus;
	//medicine list
	ArrayList<Medicine> medList;
	//Schedules of appointments
	ArrayList<Visit> nextSchedule;
	ArrayList<Visit> doneSchedule;


	/**
	 * Creates a patient with the required information. 
	 * @param socialSecureNum the SSN of the patient.
	 * @param insuranceNum the insurance number of the patient. 
	 * @param dateAdded date this patient was added into the database.
	 * @param fullName The full name of this patient. 
	 * @param birthDay The birthday of this patient. 
	 * @param gender The gender of this patient.
	 * @param phoneNum The phone number of this patient. 
	 * @param address The address of this patient. 
	 * @param patientID The id number of this patient
	 * @param sequenceNum The sequence number for the number of visits of this patient
	 */
	public Patient(int socialSecureNum, int insuranceNum, String dateAdded, String fullName, String birthDay, String gender, int phoneNum, 
			String address, int patientID, int sequenceNum, String occupation, String workStatus, String educationDeg, String tinAndCusStatus,
			ArrayList<Medicine> medList, ArrayList<Visit> nextSchedule, ArrayList<Visit> doneSchedule) 
	{
		this.socialSecureNum = socialSecureNum;
		this.insuranceNum = insuranceNum;
		this.dateAdded = dateAdded;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.address = address;
		this.patientID = patientID;
		this.sequenceNum = sequenceNum;
		this.occupation = occupation;
		this.workStatus = workStatus;
		this.educationDeg = educationDeg;
		this.tinAndCusStatus = tinAndCusStatus;
	}





	/**
	 * @return the sequenceNum the visit number this patient is on 
	 */
	public int getSequenceNum() {
		return sequenceNum;
	}


	/**
	 * @param sequenceNum the sequenceNum to set
	 */
	public void setSequenceNum(int x) {
		sequenceNum = x;
	}

	/**
	 * increments the number of visits by 1
	 */
	public void updateSeqNum() {
		sequenceNum++;
	}


	/**
	 * @return the id the number of the patient 
	 */
	public int getPatientID() {
		return patientID;
	}


	/**
	 * @return the socialSecureNumb the patient's SSN 
	 */
	public int getSocialSecureNum() {
		return socialSecureNum;
	}


	/**
	 * @param socialSecureNumb the socialSecureNumb to set
	 */
	public void setSocialSecureNum(int x) {
		socialSecureNum = x;
	}


	/**
	 * @return the insuranceNum
	 */
	public int getInsuranceNum() {
		return insuranceNum;
	}


	/**
	 * @param insuranceNum the insuranceNum to set
	 */
	public void setInsuranceNum(int x) {
		insuranceNum = x;
	}


	/**
	 * @return the dateAdded 
	 */
	public String getDateAdded() {
		return dateAdded;
	}


	/**
	 * @param dateAdded the dateAdded to set
	 */
	public void setDateAdded(String s) {
		dateAdded = s;
	}


	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}


	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String s) {
		fullName = s;
	}


	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}


	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(String s) {
		birthDay = s;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String s) {
		gender = s;
	}


	/**
	 * @return the phoneNum
	 */
	public int getPhoneNum() {
		return phoneNum;
	}


	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(int x) {
		phoneNum = x;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String s) {
		address = s;
	}


	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}


	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
	}


	/**
	 * @return the workStatus
	 */
	public String getWorkStatus() {
		return workStatus;
	}


	/**
	 * @param workStatus the workStatus to set
	 */
	public void setWorkStatus(String s) {
		workStatus = s;
	}


	/**
	 * @return the educationDegree
	 */
	public String getEduDeg() {
		return educationDeg;
	}


	/**
	 * @param educationDegree the educationDegree to set
	 */
	public void setEduDeg(String s) {
		educationDeg = s;
	} 


	/**
	 * @param the visit to be added to the list schedules
	 */
	public void addNextVisit(Visit visit) {
		nextSchedule.add(visit);
	}


	/**
	 * deletes the most recently scheduled visit
	 */
	public void deleteNextVisit() {
		nextSchedule.remove(nextSchedule.size());
	}


	/**
	 * @param the visit to be added to the list of visits that have occurred
	 */
	public void addDoneVisit(Visit visit) {
		doneSchedule.add(visit);
	}


	/**
	 * @param med medicine to be added. 
	 */
	public void addMedicine(Medicine med) {
		medList.add(med);
	}


	/**
	 * deletes the most recent medicine added
	 */
	public void deleteMedicine() {
		medList.remove(medList.size());
	}



}