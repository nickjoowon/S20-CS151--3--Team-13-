package View;


public enum Page {
	//Enums(pages)

	MAINMENU,

	REVERSEREG, REGINPUTREQ, REGINPUTOPT, REGINPUTSTATUS, REGINPUTMEDHIST,
	REGVISITINFO, REGAUDIOEVAL, REGCATEGORY,

	MEDHISTORY, SPECIFICMEDINFO,
	PATIENTDATABASE, SPECIFICPATIENT, 
	VISITHISTORY, SPECIFICVISIT, SCHEDULEVISITPOPUP,
	AUDIOEVAL;

	//options for page navigation
	private Page next;
	private Page previous;
	private Page branchA;
	private Page branchB;
	private Page branchC;
	private Page branchD;
	private Page branchE;

	static { //refer to state diagram
		MAINMENU.branchA = REGINPUTREQ; //add new patient
		MAINMENU.branchB = PATIENTDATABASE; //view patient
		REGINPUTREQ.previous = MAINMENU; //back
		PATIENTDATABASE.previous = MAINMENU; //back

		REGINPUTREQ.next = REGINPUTOPT; //next
		REGINPUTOPT.previous = REGINPUTREQ; //back

		REGINPUTOPT.next = REGINPUTSTATUS; //next
		REGINPUTSTATUS.previous = REGINPUTOPT; //back

		REGINPUTSTATUS.next = REGINPUTMEDHIST; //next
		REGINPUTMEDHIST.previous = REGINPUTSTATUS; //back

		REGINPUTMEDHIST.next = REVERSEREG; //finish

		REVERSEREG.branchA = REGINPUTREQ; //add new patient
		REVERSEREG.branchB = PATIENTDATABASE; //view patient

		PATIENTDATABASE.branchA = REGINPUTOPT; //add new
		PATIENTDATABASE.branchB = SCHEDULEVISITPOPUP; //schedule visit
		PATIENTDATABASE.branchC = VISITHISTORY; //View History
		PATIENTDATABASE.branchD = REGVISITINFO; //add visit
		PATIENTDATABASE.branchE = SPECIFICPATIENT; //view info
		REGVISITINFO.previous = PATIENTDATABASE; //back
		VISITHISTORY.previous = PATIENTDATABASE; //back
		SPECIFICPATIENT.previous =PATIENTDATABASE; //back

		SCHEDULEVISITPOPUP.next = PATIENTDATABASE; //Click X

		REGVISITINFO.next = REGAUDIOEVAL; //next
		REGAUDIOEVAL.previous = REGVISITINFO; //previous

		REGAUDIOEVAL.next = REGCATEGORY; //next
		REGCATEGORY.previous = REGAUDIOEVAL; //previous

		REGCATEGORY.branchA = MAINMENU; //Finish
		REGCATEGORY.branchB = SPECIFICPATIENT; //view Medical History
		REGCATEGORY.branchC = MEDHISTORY; //view Medications

		SPECIFICPATIENT.next = MEDHISTORY; //medications
		MEDHISTORY.previous = SPECIFICPATIENT; //previous

		MEDHISTORY.next = SPECIFICMEDINFO; //Specific medication
		SPECIFICMEDINFO.previous = 	MEDHISTORY; //back

		VISITHISTORY.branchA = AUDIOEVAL;//view audiological evalution
		VISITHISTORY.branchB =SPECIFICVISIT; //info
		AUDIOEVAL.previous = VISITHISTORY; //back
		SPECIFICVISIT.previous = VISITHISTORY; //back

	}

	public Page getPreviousPage()
	{
		return previous;
	}
	public Page getNextPage()
	{
		return next;
	}
	public Page getBranchA()
	{
		return branchB;
	}
	public Page getgetBranchB()
	{
		return branchA;
	}
	public Page getgetBranchC()
	{
		return branchC;
	}
	public Page getgetBranchD()
	{
		return branchD;
	}
	public Page getgetBranchE()
	{
		return branchE;
	}
}

