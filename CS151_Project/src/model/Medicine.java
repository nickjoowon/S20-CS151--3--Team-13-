package model;

/*
 * Medicine class deals with the specificity of the medication information. 
 * This class is about medical history.
 */

public class Medicine {
	
	
	private String medicineName;
	private String medicantName; 
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
	public Medicine(String medicineName, String medicantName, String doseSize, String duration, String chemCategoryName, String action, String application, String usualDose, String sideEffect) {
		
		this.medicineName = medicineName;
		this.medicantName = medicantName; 
		this.doseSize = doseSize;
		this.duration = duration;
		this.chemCategoryName = chemCategoryName;
		this.action = action;
		this.application = application; 
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


	public void setMedicantName(String s) {
		 medicantName = s;
	}
	
	public void setMedicineName(String s) {
		 medicineName = s ;
	}

	public void setDoseSize(String s) {
		 doseSize = s;
	}

	public void setDuration(String s) {
		 duration = s;
	}

	public void setChemCategoryName(String s) {
		 chemCategoryName = s;
	}

	public void setAction(String s) {
		 action = s;
	}

	public void setApplication(String s) {
		 application = s;
	}

	public void setUsualDose(String s) {
		 usualDose = s;
	}

	public void setSideEffect(String s) {
		 sideEffect = s;
	}

	
	public String[] getInfo()
	{
		String[] info = 
			{
					medicineName,
					medicantName,
					doseSize,
					duration,
					chemCategoryName,
					action,
					application,
					usualDose,
					sideEffect
			};
		return info; 
	}
	public String toString()
	{
		return medicantName +
		doseSize + 
		duration + 
		chemCategoryName +
		action +
		 application +
		usualDose +
		 sideEffect;
		
	}
}
