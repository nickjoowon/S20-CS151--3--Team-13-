package view;
/**
 * PatientView is in charge of displaying things to the user.
 *
 */
public class PatientView {
	
	private Page currPage; //current page

	public PatientView() {}
	
	/**
	 * picks correct Page based on Page Enum currently on.
	 */
	public void pickPage()
	{
		
	}
	/**
	 * below methods are the UI for a specific page
	 * they are called from within the PickPage method
	 */
	public void displayRegInputReq()
	{
		
	}
	public void displayRegInputOpt()
	{
		
	}
	public void displayRegInputStatus()
	{
		
	}
	public void displayRegInputMedHist()
	{
		
	}
	
	public void displayRegVisitInfo()
	{
		
	}
	public void displayRegAudioEval()
	{
		
	}
	public void displayRegCategory()
	{
		
	}
	
	public void displayMainMenu()
	{
		
	}
	public void displayPatientDatabase()
	{
		
	}
	public void displaySpecificPatient()
	{
		
	}
	public void displayReverseReg()
	{
		
	}
	public void displayMedHistory()
	{
		
	}
	public void displaySpecMedInfo()
	{
		
	}
	public void displayVisitHistory()
	{
		
	}
	public void displaySpecificVisit()
	{
		
	}
	public void displayAudioEval()
	{
		
	}
	public void displayScheduleVisitPopup()
	{
		
	}
	
	/**
	 * getter and setters
	 */
	public void setEnum(Page newPage)
	{
		currPage = newPage;
	}
	public Page getPage()
	{
		return currPage;
	}
}
