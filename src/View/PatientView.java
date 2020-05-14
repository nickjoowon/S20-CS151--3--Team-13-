package view;
/**
 * PatientView is in charge of displaying things to the user.
 *
 */
public class PatientView {
	
	private Page currPage; //current page
	/**
	 * constructor starts the user on the first page, which is the main menu
	 */
	public PatientView() {
		currPage = Page.MAINMENU;
		pickPage();
	}
	/**
	 * picks correct Page based on Page Enum currently on.
	 */
	public void pickPage()
	{
		if(currPage.equals(Page.MAINMENU))
		{
			
		}
		else if(currPage.equals(Page.REVERSEREG)
		{
			
		}				
		else if(currPage.equals(Page.REGINPUTREQ)
		{
			
		}
		else if(currPage.equals(Page.REGINPUTOPT)
		{
			
		}
		else if(currPage.equals(Page.REGINPUTSTATUS)
		{
			
		}
		else if(currPage.equals(Page.REGINPUTMEDHIST)
		{
			
		}
		else if(currPage.equals(Page.REGVISITINFO)
		{
			
		}
		else if(currPage.equals(Page.REGAUDIOEVAL)
		{
			
		}
		else if(currPage.equals(Page.REGCATEGORY)
		{
			
		}
		else if(currPage.equals(Page.MEDHISTORY)
		{
			
		}
		else if(currPage.equals(Page.SPECIFICMEDINFO)
		{
			
		}
		else if(currPage.equals(Page.PATIENTDATABASE)
		{
			
		}
		else if(currPage.equals(Page.SPECIFICPATIENT)
		{
			
		}
		else if(currPage.equals(Page.VISITHISTORY)
		{
			
		}
		else if(currPage.equals(Page.SPECIFICVISIT)
		{
			
		}
		else if(currPage.equals(Page.SCHEDULEVISITPOPUP)
		{
			
		}
		else if(currPage.equals(Page.AUDIOEVAL)
		{
			
		}
		else
		{
			System.out.println("Enum error in PatientViewClass. Not on a Valid Enum??!!");
		}
		//below code is temporarily placed in this method
		SwingUtilities.updateComponentTreeUI(this);
		registerButton = new JButton("Register New Patient");
		viewButton = new JButton("View Patients");
		setTitle("Main Menu"); 
		setSize(910,700); 
		JPanel register = new JPanel(); 
		register.setSize(455, 700);
		add(register, BorderLayout.LINE_START); 
		
		
		registerButton.setPreferredSize(new Dimension(455, 665));
		registerButton.setOpaque(true);
		registerButton.setBackground(new Color(41, 142, 208));
		registerButton.setForeground(Color.white);
		registerButton.setBorderPainted(false);
		registerButton.setFont(new Font("Arial", Font.BOLD, 40));
		register.add(registerButton); 
		
		JPanel view = new JPanel(); 
		view.setOpaque(true);

		view.setSize(455, 700);
		add(view, BorderLayout.CENTER);
		
		
		viewButton.setPreferredSize(new Dimension(435, 665));
		viewButton.setOpaque(true);
		viewButton.setBackground(new Color(41, 142, 208));
		viewButton.setForeground(Color.white);
		viewButton.setBorderPainted(false);
		viewButton.setFont(new Font("Arial", Font.BOLD, 40));
		view.add(viewButton); 
		
		
		setVisible(true); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
