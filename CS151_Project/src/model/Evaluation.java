package model;

public class Evaluation {
	
	private String rightLDL;
	private String leftLDL;
	private String tinPitch;
	private String tinMatch;
	private String hearingThreshold;
	private String rMinMasking;
	private String lMinMasking;
	private String audioComment;
	private String matchType; 
	private String startX;
	private String startY;
	private String endX;
	private String endY;
	
	/**
	 * all of the frequencies are measured in kHz
	 * @param leftLDL loudness discomfot levels for the left ear in frequencies 
	 * @param rightLDL loudness discomfot levels for the right ear in frequencies 
	 * @param tinPitch tinnitus pitch match
	 * @param tinMatch tinnitus match
	 * @param matchType tinnitus match type
	 * @param hearingThreshold thresholds for hearing
	 * @param lMinMasking minimal masking levels for the left ear
	 * @param rMinMasking minimal masking levels for the right ear
	 * @param audioComment additional discretionary comments regarding audiology left by physician
	 * @param startX the starting x-coordinate for audiogram
	 * @param startY the starting y-coordinate for audiogram
	 * @param endX the ending x-coordinate for audiogram
	 * @param endY the ending y-coordinate for audiogram
	 */
	public Evaluation(String leftLDL, String rightLDL,String tinPitch, String tinMatch, String matchType,
					  String hearingThreshold, String lMinMasking, String rMinMasking, String audioComment, 
					  String startX, String startY, String endX, String endY)
	{
		this.rightLDL = rightLDL;
		this.leftLDL = leftLDL;
		this.tinPitch = tinPitch;
		this.tinMatch = tinMatch;
		this.hearingThreshold = hearingThreshold;
		this.rMinMasking = rMinMasking;
		this.lMinMasking = lMinMasking;
		this.matchType = matchType;
		this.audioComment = audioComment;
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	/**
	 * returns loudness discomfort levels for the right ear
	 * @return 
	 */
	public String getRightLDL() {
		return rightLDL;
	}

	/**
	 * sets the string value for loudness discomfort levels for the right ear
	 * @param rightLDL
	 */
	public void setRightLDL(String rightLDL) {
		this.rightLDL = rightLDL;
	}
	
	/**
	 * returns loudness discomfort levels for the left ear
	 * @return 
	 */
	public String getLeftLDL() {
		return leftLDL;
	}

	/**
	 * sets the string value for loudness discomfort levels for the left ear
	 * @param leftLDL
	 */
	public void setLeftLDL(String leftLDL) {
		this.leftLDL = leftLDL;
	}

	
	/**
	 * returns tinnitus pitch
	 * @return 
	 */
	public String getTinPitch() {
		return tinPitch;
	}

	/**
	 * sets the tinnitus pitch
	 * @param tinPitch
	 */
	public void setTinPitch(String tinPitch) {
		this.tinPitch = tinPitch;
	}

	/**
	 * returns the tinnitus match
	 * @return
	 */
	public String getTinMatch() {
		return tinMatch;
	}
	
	/**
	 * sets the tinnitus match
	 * @param tinMatch
	 */
	public void setTinMatch(String tinMatch) {
		this.tinMatch = tinMatch;
	}

	/**
	 * returns hearing threshold
	 * @return
	 */
	public String getHearingThreshold() {
		return hearingThreshold;
	}

	/**
	 * sets hearing threshold
	 * @param hearingThreshold
	 */
	public void setHearingThreshold(String hearingThreshold) {
		this.hearingThreshold = hearingThreshold;
	}

	/**
	 * returns minimal masking level for the right ear
	 * @return
	 */
	public String getrMinMasking() {
		return rMinMasking;
	}

	/**
	 * sets the minimal masking level for the right aer
	 * @param rMinMasking
	 */
	public void setrMinMasking(String rMinMasking) {
		this.rMinMasking = rMinMasking;
	}

	/**
	 * returns the minimal masking level for the left ear
	 * @return
	 */
	public String getlMinMasking() {
		return lMinMasking;
	}

	/**
	 * sets the minimal masking level for the left ear
	 * @param lMinMasking
	 */
	public void setlMinMasking(String lMinMasking) {
		this.lMinMasking = lMinMasking;
	}


	/**
	 * return additional audiology comments
	 * @return
	 */
	public String getAudioComment() {
		return audioComment;
	}

	/**
	 * sets the additional audiology comments
	 * @param audioComment
	 */
	public void setAudioComment(String audioComment) {
		this.audioComment = audioComment;
	}

	/**
	 * reuturns tinnitus match type
	 * @return
	 */
	public String getMatchType() {
		return matchType;
	}

	/**
	 * sets tinnitus match type
	 * @param matchType
	 */
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	/**
	 * returns the starting x-coordinate of audiogram
	 * @return
	 */
	public String getStartX() {
		return startX;
	}
	
	/**
	 * sets the starting x-coordinate of audiogram
	 * @param startX
	 */
	public void setStartX(String startX) {
		this.startX = startX;
	}
	
	/**
	 * returns the starting y-coordinate of audiogram
	 * @return
	 */
	public String getStartY() {
		return startY;
	}
	
	/**
	 * sets the starting y-coordinate of audiogram
	 * @param startY
	 */
	public void setStartY(String startY) {
		this.startY = startY;
	}
	
	/**
	 * returns the ending x-coordinate of audiogram
	 * @return
	 */
	public String getEndX() {
		return endX;
	}
	
	/**
	 * sets the ending x-coordinate of audiogram
	 * @param endX
	 */
	public void setEndX(String endX) {
		this.endX = endX;
	}
	
	/**
	 * returns the ending y-coordinate of audiogram
	 * @return
	 */
	public String getEndY() {
		return endY;
	}
	
	/**
	 * sets the ending y-coordinate of audiogram
	 * @param endY
	 * 
	 */
	public void setEndY(String endY) {
		this.endY = endY;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
