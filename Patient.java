package stuff;
/**
 * Models a patient of the clinic. It contains information about itself, including the medications it is currently taking and the visits it has. 
 * @author johnsonhsiung
 *
 */
public class Patient {
	/**
	 * Creates a patient with the required information. 
	 * @param SocialSecureNumb the SSN of the patient.
	 * @param insuranceNum the insurance number of the patient. 
	 * @param dateAdded date this patient was added into the database.
	 * @param fullName The full name of this patient. 
	 * @param birthDay The birthday of this patient. 
	 * @param gender The gender of this patient.
	 * @param phoneNum The phone number of this patient. 
	 * @param address The address of this patient. 
	 */
	public Patient(int SocialSecureNumb, int insuranceNum, int dateAdded, String fullName, int birthDay, String gender, int phoneNum, String address) {
		
	}
	
	/**
	 * @return the sequenceNum the visit number this patient is on 
	 */
	public int getSequenceNum() {
		
	}
	/**
	 * @param sequenceNum the sequenceNum to set
	 */
	public void setSequenceNum(int sequenceNum) {
		
	}
	/**
	 * @return the orderNum the ID number of this patient 
	 */
	public int getOrderNum() {
		
	}
	/**
	 * @param orderNum the orderNum to set
	 */
	public void setOrderNum(int orderNum) {
	}
	/**
	 * @return the socialSecureNumb the patient's SSN 
	 */
	public int getSocialSecureNumb() {
	}
	/**
	 * @param socialSecureNumb the socialSecureNumb to set
	 */
	public void setSocialSecureNumb(int socialSecureNumb) {
	}
	/**
	 * @return the insuranceNum
	 */
	public int getInsuranceNum() {
	}
	/**
	 * @param insuranceNum the insuranceNum to set
	 */
	public void setInsuranceNum(int insuranceNum) {
	}
	/**
	 * @return the dateAdded 
	 */
	public int getDateAdded() {
	}
	/**
	 * @param dateAdded the dateAdded to set
	 */
	public void setDateAdded(int dateAdded) {
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
	}
	/**
	 * @return the birthDay
	 */
	public int getBirthDay() {
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(int birthDay) {
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
	}
	/**
	 * @return the phoneNum
	 */
	public int getPhoneNum() {
	}
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(int phoneNum) {
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
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
	}
	/**
	 * @param workStatus the workStatus to set
	 */
	public void setWorkStatus(String workStatus) {
	}
	/**
	 * @return the educationDegree
	 */
	public String getEducationDegree() {
	}
	/**
	 * @param educationDegree the educationDegree to set
	 */
	public void setEducationDegree(String educationDegree) {
	} 
	/**
	 * Adds a visit to this patient's ArrayList of visits. 
	 * @param the visit to be added
	 */
	public void addVisit(Visit visit) {
		
	}
	/**
	 * Deletes a visit from the patient's ArrayList of visits.
	 * @param visit the visit to be deleted. 
	 */
	public void deleteVisit(Visit visit) {
		
	}
	/**
	 * Sets the sequence number to parameter
	 * @param seqNum the sequence number to be set 
	 */
	public void updateSeqNum(int seqNum) {
		
	}
	/**
	 * Adds a medicine to the patient's ArrayList of Medicine. 
	 * @param med medicine to be added. 
	 */
	public void addMedicine(Medicine med) {
		
	}
	/**
	 * Deletes a medicine from the patient's ArrayList of Medicine.
	 * @param med the medicine to be deleted 
	 */
	public void deleteMedicine(Medicine med) {
		
	}
	/**
	 * Searches for a particular medicine from this patient's ArrayList of Medicine.
	 * @param medName the name of the medicine to search for. 
	 * @return the Medicine with the name. 
	 */
	public Medicine getMedicine(String medName) {
		
	}

}
