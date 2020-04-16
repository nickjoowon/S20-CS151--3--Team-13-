package stuff;

public class Visit {

	/**
	 * orderNum is the patients identification number
	 */
	private String fullName;
	private int date;
	private int visitNum;
	private int orderNum;
	//private Evaluations evaluations;
	/**
	 *  takes in full name of the patient, the date of the visit, and the orderNum of the patient
	 *  
	 * @param fullName
	 * @param date
	 * @param orderNum
	 */
	public Visit(String fullName, int date, int orderNum) {
		fullName = this.fullName;
		date = this.date;
		orderNum = this.orderNum;
		
	}
/**
 * 
 * @return
 */
	public int getOrderNum() {
		return orderNum;
	}
/**
 * 
 * @param orderNum
 */
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
/**
 * 
 * @return
 */
	public String getFullName() {
		return fullName;
	}
/**
 * 
 * @param fullName
 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
/**
 * 
 * @return
 */
	public int getDate() {
		return date;
	}
/**
 * 
 * @param date
 */
	public void setDate(int date) {
		this.date = date;
	}
/**
 * 
 * @return
 */
	public int getVisitNum() {
		return visitNum;
	}
/**
 * 
 * @param visitNum
 */
	public void setVisitNum(int visitNum) {
		this.visitNum = visitNum;
	}
	
	
}
