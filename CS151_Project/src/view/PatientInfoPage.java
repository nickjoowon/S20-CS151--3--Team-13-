package view;

/**
 * page 3
 * @author Nick
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.Patient;


public class PatientInfoPage {
    JFrame frame; 
	JButton next;
	JButton back;
	String[] info; 
	
	public PatientInfoPage(JFrame frame, String[] info) {
		this.info = info; 
		this.frame = frame; 
		frame.getContentPane().removeAll(); 
		frame.setTitle("Patient Information"); 
		
		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());
		
		
	
		JLabel titleOfTop = new JLabel("Information of " + info[2] + " "+ info[3]); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 
		
		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);
		
		JTable infoTable = new JTable(); 
		String[] columnNames = {"Patient ID",
				"Date Added",
				  "First Name",
				  "Last Name",
				  "Birthday",
				  "Gender",
				  "Phone Number",
				  "Social Security Number",
				  "Address1",
				  "Address2",
				  "City",
				  "State",
				  "Zip",
				  "Country",
				 "Insurance Number",
				"Occupation",
				"WorkStatus",
				"Education Degree",
				}; 
		
		String[][] data = {{info[0],info[1],info[2],info[3],
							info[4],info[5],info[6],info[7],
							info[8],info[9],info[10],info[11],
							info[12],info[13],info[14],info[15],info[16],info[17]}};
		JTable table = new JTable(data, columnNames); 
		JPanel center = new JPanel(new BorderLayout());
		center.add(table.getTableHeader(),BorderLayout.PAGE_START); 
		center.add(table,BorderLayout.CENTER); 
		//table.setFillsViewportHeight(true);
		frame.add(center,BorderLayout.CENTER); 
		
		
		
		
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
		
		
		next = new JButton("Medication");
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

	public static void main(String[] args)
	{
		JFrame frame = new JFrame(); 
		frame.setTitle("Main Menu"); 
		frame.setSize(910,700); 
		frame.setVisible(true);
		Patient test = new Patient("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15");
		test.setFirstName("Bob");
		test.setLastName("Builder");
		PatientInfoPage info = new PatientInfoPage(frame, test.getInfo()); 
		
	}
	
}
