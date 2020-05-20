package model;

/**
 * The visit class deals with the visits the patients schedule
 * They can contain evaluations, which happen during the patient's visit
 */

public class Visit {

	/**
	 * orderNum is the patients identification number
	 */
	
	private String date;
	private String sequenceNum;
	private String treatmentProgress; 
	private String interviewForm; 
	private boolean isSoundTherapy;
	private boolean isRealEarMeasurement; 
	private boolean isCounseling; 
	private Evaluation evaluation;
	
	/**
	 * @param fullName
	 * @param date
	 * @param orderNum
	 */
	public Visit(String date, String sequenceNum, String treatmentProgress, String interviewForm, 
			boolean isSoundTherapy,boolean isRealEarMeasurement, boolean isCounseling) {
		this.setTreatmentProgress(treatmentProgress); 
		this.date = date;
		this.setInterviewForm(interviewForm); 
		this.sequenceNum = sequenceNum;
		this.isCounseling = isCounseling; 
		this.isRealEarMeasurement = isRealEarMeasurement; 
		this.isSoundTherapy = isSoundTherapy; 
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
	public String getSeqNum() {
		return sequenceNum;
	}
	
	
	/**
	 * set number of the visit
	 * @param visitNum
	 */
	public void setSeqNum(String x) {
		this.sequenceNum = x;
	}



	public String getTreatmentProgress() {
		return treatmentProgress;
	}



	public void setTreatmentProgress(String treatmentProgress) {
		this.treatmentProgress = treatmentProgress;
	}



	public String getInterviewForm() {
		return interviewForm;
	}



	public void setInterviewForm(String interviewForm) {
		this.interviewForm = interviewForm;
	}



	public Evaluation getEvaluation() {
		return evaluation;
	}



	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}


}
