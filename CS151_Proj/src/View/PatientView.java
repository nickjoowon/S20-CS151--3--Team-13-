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
		
	}
	/**
	 * below methods are the UI for a specific page
	 * they are called from within the PickPage method
	 */
	public void displayRegInputReq()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayRegInputOpt()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayRegInputStatus()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayRegInputMedHist()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	
	public void displayRegVisitInfo()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayRegAudioEval()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayRegCategory()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	
	public void displayMainMenu()
	{
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
		
	}
	public void displayPatientDatabase()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displaySpecificPatient()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayReverseReg()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayMedHistory()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displaySpecMedInfo()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayVisitHistory()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displaySpecificVisit()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayAudioEval()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
	}
	public void displayScheduleVisitPopup()
	{
		getContentPane().removeAll();
		tempButton = new JButton("Button Text");

		
		//temp button
		JPanel temp = new JPanel(); 
		temp.setSize(200, 200);
		add(tempButton, BorderLayout.CENTER);
		tempButton.setPreferredSize(new Dimension(455, 665));
		tempButton.setOpaque(true);
		tempButton.setBackground(new Color(41, 142, 208));
		tempButton.setForeground(Color.white);
		tempButton.setBorderPainted(false);
		tempButton.setFont(new Font("Arial", Font.BOLD, 40));
		temp.add(registerButton);
		
		repaint();
		revalidate();
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
