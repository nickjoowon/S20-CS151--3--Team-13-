package model;

public class Evaluation {
	
	private String rightLDL;
	private String leftLDL;
	private String lAudioTone;
	private String rAudioTone;
	private String tinPitch;
	private String tinMatch;
	private String hearingThreshold;
	private String  rMinMasking;
	private String lMinMasking;
	private String categoryLvl;
	private String audioComment;
	private String matchType; 
	private String audioGraph; 
	
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
	public Evaluation(String leftLDL, String rightLDL,String tinPitch, String tinMatch, String matchType,
					  String hearingThreshold, String lMinMasking, String rMinMasking, String audioComment, String audioGraph)
	{
		this.rightLDL = rightLDL;
		this.leftLDL = leftLDL;
		this.setAudioGraph(audioGraph); 
		this.tinPitch = tinPitch;
		this.tinMatch = tinMatch;
		this.hearingThreshold = hearingThreshold;
		this.rMinMasking = rMinMasking;
		this.lMinMasking = lMinMasking;
		this.setMatchType(matchType); 
	
		this.audioComment = audioComment;
	}

	public String getRightLDL() {
		return rightLDL;
	}

	public void setRightLDL(String rightLDL) {
		this.rightLDL = rightLDL;
	}

	public String getLeftLDL() {
		return leftLDL;
	}

	public void setLeftLDL(String leftLDL) {
		this.leftLDL = leftLDL;
	}

	public String getlAudioTone() {
		return lAudioTone;
	}

	public void setlAudioTone(String lAudioTone) {
		this.lAudioTone = lAudioTone;
	}

	public String getrAudioTone() {
		return rAudioTone;
	}

	public void setrAudioTone(String rAudioTone) {
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

	public String getHearingThreshold() {
		return hearingThreshold;
	}

	public void setHearingThreshold(String hearingThreshold) {
		this.hearingThreshold = hearingThreshold;
	}

	public String getrMinMasking() {
		return rMinMasking;
	}

	public void setrMinMasking(String rMinMasking) {
		this.rMinMasking = rMinMasking;
	}

	public String getlMinMasking() {
		return lMinMasking;
	}

	public void setlMinMasking(String lMinMasking) {
		this.lMinMasking = lMinMasking;
	}

	public String getCategoryLvl() {
		return categoryLvl;
	}

	public void setCategoryLvl(String categoryLvl) {
		this.categoryLvl = categoryLvl;
	}

	public String getAudioComment() {
		return audioComment;
	}

	public void setAudioComment(String audioComment) {
		this.audioComment = audioComment;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getAudioGraph() {
		return audioGraph;
	}

	public void setAudioGraph(String audioGraph) {
		this.audioGraph = audioGraph;
	}
	
}
