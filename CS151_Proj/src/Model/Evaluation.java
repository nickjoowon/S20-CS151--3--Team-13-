package Model;

public class Evaluation {
	
	private double rightLDL;
	private double leftLDL;
	private double lAudioTone;
	private double rAudioTone;
	private String tinPitch;
	private String tinMatch;
	private double hearingThreshold;
	private int rMinMasking;
	private int lMinMasking;
	private int categoryLvl;
	private String audioComment;
	
	/**
	 * all of the frequencies are measured in kHz
	 * @param rightLDL loudness discomfot levels for the right ear in frequencies 
	 * @param leftLDL loudness discomfot levels for the left ear in frequencies 
	 * @param lAudioTone pure-tone audiogram for the left ear 
	 * @param rAudioTone pure-tone audiogram for the right ear
	 * @param tinPitch tinnitus pitch match
	 * @param tinMatch tinnitus match type
	 * @param hearingThreshold thresholds for hearing
	 * @param rMinMasking minimal masking levels for the right ear
	 * @param lMinMasking minimal masking levels for the left ear
	 * @param categoryLvl assigning a category number to the patient between 0-4
	 * @param audioComment additional discretionary comments regarding audiology left by physician
	 */
	public Evaluation(double rightLDL, double leftLDL, double lAudioTone, double rAudioTone, String tinPitch, String tinMatch, 
					  double hearingThreshold, int rMinMasking, int lMinMasking, int categoryLvl, String audioComment)
	{
		this.rightLDL = rightLDL;
		this.leftLDL = leftLDL;
		this.lAudioTone = lAudioTone;
		this.rAudioTone = rAudioTone;
		this.tinPitch = tinPitch;
		this.tinMatch = tinMatch;
		this.hearingThreshold = hearingThreshold;
		this.rMinMasking = rMinMasking;
		this.lMinMasking = lMinMasking;
		this.categoryLvl = categoryLvl;
		this.audioComment = audioComment;
	}

	public double getRightLDL() {
		return rightLDL;
	}

	public void setRightLDL(double rightLDL) {
		this.rightLDL = rightLDL;
	}

	public double getLeftLDL() {
		return leftLDL;
	}

	public void setLeftLDL(double leftLDL) {
		this.leftLDL = leftLDL;
	}

	public double getlAudioTone() {
		return lAudioTone;
	}

	public void setlAudioTone(double lAudioTone) {
		this.lAudioTone = lAudioTone;
	}

	public double getrAudioTone() {
		return rAudioTone;
	}

	public void setrAudioTone(double rAudioTone) {
		this.rAudioTone = rAudioTone;
	}

	public String getTinPitch() {
		return tinPitch;
	}

	public void setTinPitch(String tinPitch) {
		this.tinPitch = tinPitch;
	}

	public String getTinMatch() {
		return tinMatch;
	}

	public void setTinMatch(String tinMatch) {
		this.tinMatch = tinMatch;
	}

	public double getHearingThreshold() {
		return hearingThreshold;
	}

	public void setHearingThreshold(double hearingThreshold) {
		this.hearingThreshold = hearingThreshold;
	}

	public int getrMinMasking() {
		return rMinMasking;
	}

	public void setrMinMasking(int rMinMasking) {
		this.rMinMasking = rMinMasking;
	}

	public int getlMinMasking() {
		return lMinMasking;
	}

	public void setlMinMasking(int lMinMasking) {
		this.lMinMasking = lMinMasking;
	}

	public int getCategoryLvl() {
		return categoryLvl;
	}

	public void setCategoryLvl(int categoryLvl) {
		this.categoryLvl = categoryLvl;
	}

	public String getAudioComment() {
		return audioComment;
	}

	public void setAudioComment(String audioComment) {
		this.audioComment = audioComment;
	}
	
}