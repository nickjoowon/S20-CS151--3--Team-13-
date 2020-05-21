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
	 * 
	 * @param date
	 * @param sequenceNum
	 * @param treatmentProgress
	 * @param interviewForm
	 * @param isSoundTherapy
	 * @param isRealEarMeasurement
	 * @param isCounseling
	 */
	public Visit(String date, String sequenceNum, String treatmentProgress, String interviewForm, 
			boolean isSoundTherapy,boolean isRealEarMeasurement, boolean isCounseling) {
		this.setTreatmentProgress(treatmentProgress); 
		this.date = date;
		this.setInterviewForm(interviewForm); 
		this.sequenceNum = sequenceNum;
		this.setCounseling(isCounseling); 
		this.setRealEarMeasurement(isRealEarMeasurement); 
		this.setSoundTherapy(isSoundTherapy); 
	}



	/**
	 * Getters and setter methods
	 */
	public String getDate() {
		return date;
	}



	public void setDate(String s) {
		this.date = s;
	}



	public String getSeqNum() {
		return sequenceNum;
	}



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



	public boolean isSoundTherapy() {
		return isSoundTherapy;
	}



	public void setSoundTherapy(boolean isSoundTherapy) {
		this.isSoundTherapy = isSoundTherapy;
	}



	public boolean isRealEarMeasurement() {
		return isRealEarMeasurement;
	}



	public void setRealEarMeasurement(boolean isRealEarMeasurement) {
		this.isRealEarMeasurement = isRealEarMeasurement;
	}



	public boolean isCounseling() {
		return isCounseling;
	}



	public void setCounseling(boolean isCounseling) {
		this.isCounseling = isCounseling;
	}



}
