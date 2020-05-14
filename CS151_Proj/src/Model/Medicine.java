package Model;

/*
 * Medicine class deals with the specificity of the medication information. 
 * This class is about medical history.
 */

public class Medicine {
	
	
	private String medicineName;
	private String doseSize; 
	private String duration;
	private String chemCategoryName;
	private String action;
	private String application;
	private String usualDose;
	private String sideEffect;
	
	/**
	* medecineName is the name of the medicine
	* doseSize is the size of the dose for the medicine
	* duration is how long the medicine has been used
	* chemCategoryName is the name of the chemicals of the medicine
	* action is how the medication is applied 
	* application is the description of the purpose for taking the medication
	* usualDose is the description of how often the patient uses the medication
	* sideEffect is for description of the side effects of this medication
	*/
	public Medicine(String medicineName, String doseSize, String duration, String chemCategoryName, String action, String application, String usualDose, String sideEffect) {
		
		this.medicineName = medicineName;
		this.doseSize = doseSize;
		this.duration = duration;
		this.chemCategoryName = chemCategoryName;
		this.action = action;
		this.usualDose = usualDose;
		this.sideEffect = sideEffect;
	}

	
	/*
	 * Getters and setter methods
	 */
	public String getMedicineName() {
		return medicineName;
	}

	public String getDoseSize() {
		return doseSize;
	}

	public String getDuration() {
		return duration;
	}

	public String getChemCategoryName() {
		return chemCategoryName;
	}

	public String getAction() {
		return action;
	}

	public String getApplication() {
		return application;
	}

	public String getUsualDose() {
		return usualDose;
	}

	public String getSideEffect() {
		return sideEffect;
	}
}