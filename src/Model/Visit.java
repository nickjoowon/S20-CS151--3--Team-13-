package Model;

/**
 * The visit class deals with the visits the patients schedule
 * They can contain evaluations, which happen during the patient's visit
 */

public class Visit {

	/**
	 * orderNum is the patients identification number
	 */
	private String fullName;
	private String date;
	private int sequenceNum;
	private int IDNum;
	private Evaluation evaluations;
	
	/**
	 * @param fullName
	 * @param date
	 * @param orderNum
	 */
	public Visit(String fullName, String date, int IDNum, int sequenceNum) {
		this.fullName = fullName;
		this.date = date;
		this.IDNum = IDNum;
		this.sequenceNum = sequenceNum;
	}
	
	
	/**
	 * gets patient ID number
	 * @return patient's ID
	 */
	public int IDNum() {
		return IDNum;
	}
	
	
	/**
	 * sets patient ID number
	 * @param number to set patient's ID number to
	 */
	public void setIDNum(int x) {
		this.IDNum = x;
	}
	
	
	/**
	 * @return full name
	 */
	public String getFullName() {
		return fullName;
	}
	
	
	/**
	 * sets full name
	 * @param fullName
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	/**
	 * gets date of visit
	 * @return
	 */
	public String getDate() {
		return date;
	}
	
	
	/**
	 * sets date of visit
	 * @param date
	 */
	public void setDate(String s) {
		this.date = s;
	}
	
	
	/**
	 * get number of the visit
	 * @return visit number
	 */
	public int getSeqNum() {
		return sequenceNum;
	}
	
	
	/**
	 * set number of the visit
	 * @param visitNum
	 */
	public void setSeqNum(int x) {
		this.sequenceNum = x;
	}


}