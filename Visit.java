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
		this.fullName = fullName;
		this.date = date;
		this.orderNum = orderNum;
		
	}
/**
 * gets order number
 * @return
 */
	public int getOrderNum() {
		return orderNum;
	}
/**
 * sets order number
 * @param orderNum
 */
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
/**
 *  gets full name
 * @return
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
	public int getDate() {
		return date;
	}
/**
 * sets date of visit
 * @param date
 */
	public void setDate(int date) {
		this.date = date;
	}
/**
 * get number of the visit
 * @return
 */
	public int getVisitNum() {
		return visitNum;
	}
/**
 * set number of the visit
 * @param visitNum
 */
	public void setVisitNum(int visitNum) {
		this.visitNum = visitNum;
	}
	
	
}
