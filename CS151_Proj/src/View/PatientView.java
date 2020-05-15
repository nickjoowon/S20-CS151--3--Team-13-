package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

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
			displayMainMenu();
		}
		else if(currPage.equals(Page.REVERSEREG))
		{
			displayReverseReg();
		}				
		else if(currPage.equals(Page.REGINPUTREQ))
		{
			displayRegInputReq();
		}
		else if(currPage.equals(Page.REGINPUTOPT))
		{
			displayRegInputOpt();
		}
		else if(currPage.equals(Page.REGINPUTSTATUS))
		{
			displayRegInputStatus();
		}
		else if(currPage.equals(Page.REGINPUTMEDHIST))
		{
			displayRegInputMedHist();
		}
		else if(currPage.equals(Page.REGVISITINFO))
		{
			displayRegVisitInfo();
		}
		else if(currPage.equals(Page.REGAUDIOEVAL))
		{
			displayRegAudioEval();
		}
		else if(currPage.equals(Page.REGCATEGORY))
		{
			displayRegCategory();
		}
		else if(currPage.equals(Page.MEDHISTORY))
		{
			displayMedHistory();
		}
		else if(currPage.equals(Page.SPECIFICMEDINFO))
		{
			displaySpecMedInfo();
		}
		else if(currPage.equals(Page.PATIENTDATABASE))
		{
			displayPatientDatabase();
		}
		else if(currPage.equals(Page.SPECIFICPATIENT))
		{
			displaySpecificPatient();
		}
		else if(currPage.equals(Page.VISITHISTORY))
		{
			displayVisitHistory();
		}
		else if(currPage.equals(Page.SPECIFICVISIT))
		{
			displaySpecificVisit();
		}
		else if(currPage.equals(Page.SCHEDULEVISITPOPUP))
		{
			displayScheduleVisitPopup();
		}
		else if(currPage.equals(Page.AUDIOEVAL))
		{
			displayAudioEval();
		}
		else
		{
			System.out.println("Enum error in PatientViewClass. Not on a Valid Enum??!!");
		}
		//below code is temporarily placed in this method
		/*
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
		*/
	}
	/**
	 * below methods are the UI for a specific page
	 * they are called from within the PickPage method
	 */
	public void displayRegInputReq()
	{
		/*
		getContentPane().removeAll(); 
		setTitle("Patient Registration"); 
		
		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		
		
		JLabel titleOfTop = new JLabel("Required Registration Information"); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop); 
		
		//IDNumber till SSN. Labels and text fields 
		JPanel centerLeft = new JPanel(); 
		centerLeft.setLayout(new GridLayout(8,2));
		
		JLabel IDNumber = new JLabel("ID Number"); 
		IDNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(IDNumber); 
		JTextField IDNumberText = new JTextField(); 
		centerLeft.add(IDNumberText); 
		
		
		JLabel dateAdded = new JLabel("Date Added"); 
		dateAdded.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(dateAdded);
		JTextField dateAddedText = new JTextField(); 
		centerLeft.add(dateAddedText); 
		
		JLabel firstName = new JLabel("First Name"); 
		firstName.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(firstName);
		JTextField firstNameText = new JTextField(); 
		centerLeft.add(firstNameText); 
		
		JLabel lastName = new JLabel("Last Name"); 
		lastName.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(lastName);
		JTextField lastNameText = new JTextField(); 
		centerLeft.add(lastNameText); 
		
		JLabel birthday = new JLabel("Birthday"); 
		birthday.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(birthday);
		JTextField birthdayText = new JTextField(); 
		centerLeft.add(birthdayText); 
		
		JLabel gender = new JLabel("Gender"); 
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(gender);
		JTextField genderText = new JTextField(); 
		centerLeft.add(genderText); 
		
		JLabel phoneNumber = new JLabel("Phone Number"); 
		phoneNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(phoneNumber);
		JTextField phoneNumberText = new JTextField(); 
		centerLeft.add(phoneNumberText); 
		
		JLabel ssn = new JLabel("Social Security Number"); 
		ssn.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(ssn);
		JTextField ssnText = new JTextField(); 
		centerLeft.add(ssnText); 
		
		//Centerright. Street address1 till insurance number 
		JPanel centerRight = new JPanel(); 
		centerRight.setLayout(new GridLayout(7,2));
		
		
		JLabel address1 = new JLabel("Street Address 1"); 
		address1.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(address1);
		JTextField address1Text = new JTextField(); 
		centerRight.add(address1Text); 
		
		JLabel address2 = new JLabel("Street Address 2"); 
		address2.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(address2);
		JTextField address2Text = new JTextField(); 
		centerRight.add(address2Text); 
		
		JLabel city = new JLabel("City"); 
		city.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(city);
		JTextField cityText = new JTextField(); 
		centerRight.add(cityText); 
		
		JLabel state = new JLabel("State"); 
		state.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(state);
		JTextField stateText = new JTextField(); 
		centerRight.add(stateText); 
		
		JLabel zip = new JLabel("Zip Code"); 
		zip.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(zip);
		JTextField zipText = new JTextField(); 
		centerRight.add(zipText); 
		
		JLabel country = new JLabel("Country"); 
		country.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(country);
		JTextField countryText = new JTextField(); 
		centerRight.add(countryText); 
		
		JLabel insuranceNumber = new JLabel("Insurance Number"); 
		insuranceNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(insuranceNumber);
		JTextField insuranceNumberText = new JTextField(); 
		centerRight.add(insuranceNumberText); 
		
		//Panel to organize back and next buttons 
		JPanel backAndNext = new JPanel(); 
		backAndNext.setLayout(new BorderLayout());
		
		JButton back = new JButton("Back"); 
		back.setPreferredSize(new Dimension(125,50));
		back.setOpaque(true);
		back.setForeground(Color.white);
		back.setBackground(new Color(41,142,208));
		back.setBorderPainted(false);
		backAndNext.add(back, BorderLayout.WEST);
		
		
		JButton next = new JButton("Next");
		next.setPreferredSize(new Dimension(125,50));
		next.setOpaque(true);
		next.setForeground(Color.white);
		next.setBackground(new Color(41,142,208));
		next.setBorderPainted(false);
		backAndNext.add(next, BorderLayout.EAST); 
		
		
		
		// For space between buttons and bottom 
		JPanel bottomDecorationWhite = new JPanel();
		
		backAndNext.add(bottomDecorationWhite, BorderLayout.SOUTH); 
		
		
		//add the panels into the frame 
		add(centerLeft, BorderLayout.WEST);
		add(centerRight, BorderLayout.CENTER);
		add(top, BorderLayout.NORTH); 
		add(backAndNext, BorderLayout.SOUTH); 
		
		
		
		
		
		
		
		
	
		repaint();
		revalidate();
		*/
		
		
		
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
		/*
		getContentPane().removeAll();
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
		repaint();
		revalidate();
		*/
		
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