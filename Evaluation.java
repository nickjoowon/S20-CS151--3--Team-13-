

/*
 * These are the elements required for detailed audiology evaluation
 */
public class Evaluation {

	private double rightLDL;
	private double leftLDL;
	private double leftAudioTone;
	private double rightAudioTone;
	private double hearingThreshold;
	private int rightMinMasking;
	private int leftMinMasking;
	private int categoryLevel;
	private String tinPitchMatch;
	private String tinMatchType;
	private String audioComments;
	
	
	public Evaluation(double rightLDL, double leftLDL, double leftAudioTone, double rightAudioTone, double hearingThreshold, int rightMinMasking, int leftMinMasking, int categoryLevel, String tinPitchMatch, String tinMatchType, String audioComments) {
		this.rightLDL = rightLDL;
		this.leftLDL = leftLDL;
		this.leftAudioTone = leftAudioTone;
		this.rightAudioTone = rightAudioTone;
		this.hearingThreshold = hearingThreshold;
		this.rightMinMasking = rightMinMasking;
		this.leftMinMasking = leftMinMasking;
		this.categoryLevel = categoryLevel;
		this.tinPitchMatch = tinPitchMatch;
		this.tinMatchType = tinMatchType;
		this.audioComments = audioComments;
	}

	/*
	 * Getters and setter methods
	 */

	
	/*
	 * returns loudness discomfort level from the right ear
	 */
	public double getRightLDL() {
		return rightLDL;
	}

	
	public void setRightLDL(double rightLDL) {
		this.rightLDL = rightLDL;
	}

	/*
	 * returns loudness discomfort level from the left year
	 */
	public double getLeftLDL() {
		return leftLDL;
	}


	public void setLeftLDL(double leftLDL) {
		this.leftLDL = leftLDL;
	}

	/*
	 * returns pure-tone audiogram for the left ear
	 */
	public double getLeftAudioTone() {
		return leftAudioTone;
	}


	public void setLeftAudioTone(double leftAudioTone) {
		this.leftAudioTone = leftAudioTone;
	}

	/*
	 * returns pure-tone audiogram for the right ear
	 */
	public double getRightAudioTone() {
		return rightAudioTone;
	}


	public void setRightAudioTone(double rightAudioTone) {
		this.rightAudioTone = rightAudioTone;
	}

	/*
	 * returns the thresholds of hearing
	 */
	public double getHearingThreshold() {
		return hearingThreshold;
	}


	public void setHearingThreshold(double hearingThreshold) {
		this.hearingThreshold = hearingThreshold;
	}

	/*
	 * returns minimal masking levels for the right ear
	 */
	public int getRightMinMasking() {
		return rightMinMasking;
	}


	public void setRightMinMasking(int rightMinMasking) {
		this.rightMinMasking = rightMinMasking;
	}

	/*
	 * returns minimal masking levels for the left ear
	 */
	public int getLeftMinMasking() {
		return leftMinMasking;
	}


	public void setLeftMinMasking(int leftMinMasking) {
		this.leftMinMasking = leftMinMasking;
	}

	/*
	 * returns a category level for the severity of the patient's condition between 0-4
	 */
	public int getCategoryLevel() {
		return categoryLevel;
	}


	public void setCategoryLevel(int categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	/*
	 * returns tinnitus pitch match
	 */
	public String getTinPitchMatch() {
		return tinPitchMatch;
	}

	
	public void setTinPitchMatch(String tinPitchMatch) {
		this.tinPitchMatch = tinPitchMatch;
	}

	/*
	 * returns tinnitus match type
	 */
	public String getTinMatchType() {
		return tinMatchType;
	}


	public void setTinMatchType(String tinMatchType) {
		this.tinMatchType = tinMatchType;
	}

	/*
	 * returns physician's additional discretionary comments regarding audiology
	 */
	public String getAudioComments() {
		return audioComments;
	}


	public void setAudioComments(String audioComments) {
		this.audioComments = audioComments;
	}
	
	
	
	
}
