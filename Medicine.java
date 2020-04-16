
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
	private boolean sideEffect;
	
	
	public Medicine(String medicineName, String doseSize, String duration, String chemCategoryName, String action, String application, String usualDose, boolean sideEffect) {
		
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

	public boolean isSideEffect() {
		return sideEffect;
	}
	
	
