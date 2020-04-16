
package stuff;

public class Visit {

	private String fullName;
	private int date;
	private int visitNum;
	private int orderNum;
	private Evaluations evaluations;
	
	public Visit(String fullName, int date, int orderNum) {
		fullName = this.fullName;
		date = this.date;
		orderNum = this.orderNum;
		
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getVisitNum() {
		return visitNum;
	}

	public void setVisitNum(int visitNum) {
		this.visitNum = visitNum;
	}
	
	
}
