package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ReqInfoPage {
    JFrame frame; 
	JButton next;
	JButton back;
	private JTextField iDNumberText;
	private JTextField dateAddedText;
	private JTextField firstNameText;
	private JTextField lastNameText;
	private JTextField birthdayText;
	private JTextField genderText;
	private JTextField phoneNumberText;
	private JTextField ssnText;
	private JTextField address1Text;
	private JTextField address2Text;
	private JTextField cityText;
	private JTextField stateText;
	private JTextField zipText;
	private JTextField countryText;
	private JTextField insuranceNumberText;
	public ReqInfoPage(JFrame frame)
	{
		this.frame = frame; 
		frame.getContentPane().removeAll(); 
		frame.setTitle("Patient Registration"); 
		
		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());
		
		
		
		JLabel titleOfTop = new JLabel("Required Registration Information"); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 
		
		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);
		
		
		//IDNumber till SSN. Labels and text fields 
		JPanel centerLeft = new JPanel(); 
		centerLeft.setLayout(new GridLayout(8,2));
		
		JLabel IDNumber = new JLabel("ID Number"); 
		IDNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(IDNumber); 
		iDNumberText = new JTextField(); 
		centerLeft.add(iDNumberText); 
		
		
		JLabel dateAdded = new JLabel("Date Added"); 
		dateAdded.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(dateAdded);
		dateAddedText = new JTextField(); 
		centerLeft.add(dateAddedText); 
		
		JLabel firstName = new JLabel("First Name"); 
		firstName.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(firstName);
		firstNameText = new JTextField(); 
		centerLeft.add(firstNameText); 
		
		JLabel lastName = new JLabel("Last Name"); 
		lastName.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(lastName);
		lastNameText = new JTextField(); 
		centerLeft.add(lastNameText); 
		
		JLabel birthday = new JLabel("Birthday"); 
		birthday.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(birthday);
		birthdayText = new JTextField(); 
		centerLeft.add(birthdayText); 
		
		JLabel gender = new JLabel("Gender"); 
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(gender);
		genderText = new JTextField(); 
		centerLeft.add(genderText); 
		
		JLabel phoneNumber = new JLabel("Phone Number"); 
		phoneNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(phoneNumber);
		phoneNumberText = new JTextField(); 
		centerLeft.add(phoneNumberText); 
		
		JLabel ssn = new JLabel("Social Security Number"); 
		ssn.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(ssn);
		ssnText = new JTextField(); 
		centerLeft.add(ssnText); 
		
		//Centerright. Street address1 till insurance number 
		JPanel centerRight = new JPanel(); 
		centerRight.setLayout(new GridLayout(7,2));
		
		
		JLabel address1 = new JLabel("Street Address 1"); 
		address1.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(address1);
		address1Text = new JTextField(); 
		centerRight.add(address1Text); 
		
		JLabel address2 = new JLabel("Street Address 2"); 
		address2.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(address2);
		address2Text = new JTextField(); 
		centerRight.add(address2Text); 
		
		JLabel city = new JLabel("City"); 
		city.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(city);
		cityText = new JTextField(); 
		centerRight.add(cityText); 
		
		JLabel state = new JLabel("State"); 
		state.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(state);
		stateText = new JTextField(); 
		centerRight.add(stateText); 
		
		JLabel zip = new JLabel("Zip Code"); 
		zip.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(zip);
		zipText = new JTextField(); 
		centerRight.add(zipText); 
		
		JLabel country = new JLabel("Country"); 
		country.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(country);
		countryText = new JTextField(); 
		centerRight.add(countryText); 
		
		JLabel insuranceNumber = new JLabel("Insurance Number"); 
		insuranceNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(insuranceNumber);
		insuranceNumberText = new JTextField(); 
		centerRight.add(insuranceNumberText); 
		
		
		//Panel to organize back and next buttons 
		JPanel backAndNext = new JPanel(); 
		backAndNext.setLayout(new BorderLayout());
		
		back = new JButton("Back"); 
		back.setPreferredSize(new Dimension(125,50));
		back.setOpaque(true);
		back.setForeground(Color.white);
		back.setBackground(new Color(41,142,208));
		back.setBorderPainted(false);
		backAndNext.add(back, BorderLayout.WEST);
		
		
		next = new JButton("Next");
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
		frame.add(centerLeft, BorderLayout.WEST);
		frame.add(centerRight, BorderLayout.CENTER);
		frame.add(top, BorderLayout.NORTH); 
		frame.add(backAndNext, BorderLayout.SOUTH); 
		
		
		
		
		
		
		
		
	
		frame.repaint();
		frame.revalidate();
	}
	
	public void addNextListener(ActionListener a)
	{
		next.addActionListener(a);
	}
	public void addBackListener(ActionListener b)
	{
		back.addActionListener(b);
	}
	public String[] getRequiredInfo()
	{
		String[] info = new String[] {iDNumberText.getText(), 
				dateAddedText.getText(),
				firstNameText.getText(),
				lastNameText.getText(),
				birthdayText.getText(),
				genderText.getText(),
				phoneNumberText.getText(),
				ssnText.getText(),
				address1Text.getText(),
				address2Text.getText(),
				cityText.getText(),
				stateText.getText(),
				zipText.getText(),
				countryText.getText(),
				insuranceNumberText.getText()} ;
		return info; 
		
	}
	
	
	


}
