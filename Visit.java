
package stuff;

public class Visit {

	private String fullName;
	private int date;
	private int visitNum;
	private int orderingNum;
	private Evaluations evaluations;
	
	public Visit(String fullName, int date, int orderingNum) {
		fullName = this.fullName;
		date = this.date;
		orderingNum = this.orderingNum;
		
	}

	public int getOrderingNum() {
		return orderingNum;
	}

	public void setOrderingNum(int orderingNum) {
		this.orderingNum = orderingNum;
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
