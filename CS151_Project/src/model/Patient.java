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
	ArrayList<Visit> visitHistory;



	/**
	 * 
	 * @param patientID 
	 * @param dateAdded 
	 * @param firstName 
	 * @param lastName
	 * @param birthDay
	 * @param gender
	 * @param phoneNum
	 * @param socialSecureNum
	 * @param address1
	 * @param address2
	 * @param city
	 * @param state
	 * @param zip
	 * @param country
	 * @param insuranceNum
	 */
	public Patient(String patientID, String dateAdded, String firstName, String lastName, String birthDay, String gender, String phoneNum, 
			String socialSecureNum, String address1, String address2, String city, String state, String zip, String country, String insuranceNum)
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
		medList = new ArrayList<Medicine>(); 
		visitHistory = new ArrayList<Visit>(); 

	}






	/**
	 * Getters and setter methods
	 */
	public String getPatientID() {
		return patientID;
	}


	public void setPatientID(String s) {
		patientID = s;
	}


	public String getDateAdded() {
		return dateAdded;
	}

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


	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String s) {
		birthDay = s;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String s) {
		gender = s;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String s) {
		phoneNum = s;
	}


	public String getSocialSecureNum() {
		return socialSecureNum;
	}

	public void setSocialSecureNum(String s) {
		socialSecureNum = s;
	}

	public String getAddress1() {
		return address1;
	}


	public void setAddress(String s) {
		address1 = s;
	}


	public String getAddress2() {
		return address2;
	}


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


	public String getInsuranceNum() {
		return insuranceNum;
	}


	public void setInsuranceNum(String s) {
		insuranceNum = s;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getWorkStatus() {
		return workStatus;
	}


	public void setWorkStatus(String s) {
		workStatus = s;
	}


	public String getEduDeg() {
		return educationDeg;
	}


	public void setEduDeg(String s) {
		educationDeg = s;
	} 


	public void addNextVisit(Visit visit) {
		visitHistory.add(visit);
	}


	public String getTinAndCusDesc() {
		return tinAndCusDesc;
	}

	public void setTinAndCusDesc(String tinAndCusDesc) {
		this.tinAndCusDesc = tinAndCusDesc;
	}

	public ArrayList<Medicine> getMedicine()
	{
		return medList; 
	}



	/**
	 * deletes the most recently scheduled visit
	 */
	public void deleteNextVisit() {
		visitHistory.remove(visitHistory.size());
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





	/**
	 * returns all the variables as string
	 */
	public String toString()
	{
		return patientID +
				dateAdded +
				firstName +
				lastName +
				birthDay +
				gender +
				phoneNum +
				socialSecureNum +
				address1 +
				address2 + 
				city +
				state +
				zip +
				country +
				insuranceNum +
				occupation +
				workStatus +
				educationDeg +
				tinAndCusDesc; 

	}

	/**
	 * returns all of the information regarding this patient
	 * @return
	 */
	public String[] getInfo()
	{
		String[] info = {patientID,
				dateAdded,
				firstName,
				lastName,
				birthDay,
				gender,
				phoneNum,
				socialSecureNum,
				address1,
				address2,
				city,
				state,
				zip,
				country,
				insuranceNum,
				occupation,
				workStatus,
				educationDeg,
				tinAndCusDesc}; 
		return info; 
	}

	/**
	 * returns the information of each medication in the medication list
	 * @param medName
	 * @return
	 */
	public String[] getInfoOfMedication(String medName)
	{
		for (Medicine a: medList)
		{
			if (a.getMedicineName().equals(medName))
			{
				return a.getInfo(); 

			}

		}
		return null; 
	}

	/**
	 * searches for the medicine with the same name as the parameter
	 * @param medName
	 * @return
	 */
	public Medicine getMedicine(String medName) {
		for (Medicine a: medList)
		{
			if (a.getMedicineName().equals(medName))
			{
				return a;

			}

		}
		return null; 

	}

	/**
	 * adds a visit to visit history list
	 * @param visit
	 */
	public void addVisit(Visit visit)
	{
		visitHistory.add(visit); 
	}

	/**
	 * returns the vist history list
	 * @return
	 */
	public ArrayList<Visit> getDoneVisit() {
		return visitHistory;
	}

	/**
	 * returns the most recent visit added in visit history list
	 * @return
	 */
	public Visit getLastVisit()
	{
		return visitHistory.get(visitHistory.size()-1);
	}


}
