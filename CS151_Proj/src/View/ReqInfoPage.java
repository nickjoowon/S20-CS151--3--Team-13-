package View;
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


}
