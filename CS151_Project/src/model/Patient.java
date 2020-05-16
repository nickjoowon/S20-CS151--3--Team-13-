package model;

import java.util.ArrayList;

/**
 * Models a patient of the clinic. It contains information about itself, including the medications it is currently taking and the visits it has. 
 * @author johnsonhsiung
 *
 */
public class Patient {

	//required info
	//private int sequenceNum;
	private String patientID;
	private String dateAdded;
	private String firstName;
	private String lastName;
	private String birthDay;
	private String gender;
	private String phoneNum;
	private String socialSecureNum;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String insuranceNum;
	//optional info
	private String occupation;
	private String workStatus;
	private String educationDeg;
	//Tinnitus and Hyperacusus status
	private String tinAndCusDesc;
	//medicine list
	ArrayList<Medicine> medList;
	//Schedules of appointments
	ArrayList<Visit> nextSchedule;
	ArrayList<Visit> doneSchedule;


	
	 
	public Patient(String patientID, String dateAdded, String firstName, String lastName, String birthDay, String gender, String phoneNum, 
			String socialSecureNum, String address1, String address2, String city, String state, String zip, String country, String insuranceNum,
			String occupation, String workStatus, String educationDeg, String tinAndCusDesc) 
	{
		this.patientID  = patientID;
		this.dateAdded = dateAdded;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.socialSecureNum = socialSecureNum;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.insuranceNum = insuranceNum;
		this.occupation = occupation;
		this.workStatus = workStatus;
		this.educationDeg = educationDeg;
		this.tinAndCusDesc = tinAndCusDesc;
	}
	



	/**
	 * @return the sequenceNum the visit number this patient is on 
	 */
//	public int getSequenceNum() {
//		return sequenceNum;
//	}


	/**
	 * @param sequenceNum the sequenceNum to set
	 */
//	public void setSequenceNum(int x) {
//		sequenceNum = x;
//	}

	/**
	 * increments the number of visits by 1
	 */
//	public void updateSeqNum() {
//		sequenceNum++;
//	}


	/**
	 * @return the id the number of the patient 
	 */
	public String getPatientID() {
		return patientID;
	}
	
	
	public void setPatientID(String s) {
		patientID = s;
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

	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String s) {
		firstName = s;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String s) {
		lastName = s;
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
	public String getPhoneNum() {
		return phoneNum;
	}


	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String s) {
		phoneNum = s;
	}
	
	
	
	/**
	 * @return the socialSecureNumb the patient's SSN 
	 */
	public String getSocialSecureNum() {
		return socialSecureNum;
	}


	/**
	 * @param socialSecureNumb the socialSecureNumb to set
	 */
	public void setSocialSecureNum(String s) {
		socialSecureNum = s;
	}

	
	/**
	 * @return the address
	 */
	public String getAddress1() {
		return address1;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String s) {
		address1 = s;
	}

	
	
	/**
	 * @return the address
	 */
	public String getAddress2() {
		return address2;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress2(String s) {
		address2 = s;
	}
	
	
	
	public String getCity() {
		return city;
	}
	
	
	public void setCity(String s) {
		address2 = s;
	}
	
	
	public String getState() {
		return state;
	}
	
	
	public void setState(String s) {
		state = s;
	}
	
	
	public String getZip() {
		return zip;
	}
	
	
	public void setZip(String s) {
		zip = s;
	}
	
	
	public String getCountry() {
		return country;
	}
	
	
	public void setCountry(String s) {
		country = s;
	}
	

	/**
	 * @return the insuranceNum
	 */
	public String getInsuranceNum() {
		return insuranceNum;
	}


	/**
	 * @param insuranceNum the insuranceNum to set
	 */
	public void setInsuranceNum(String s) {
		insuranceNum = s;
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