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
	JButton updateInfo; 
	JTable table1;
	JTable table2; 
	String[] info; 
	JTextArea etiologyText; 
	
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
		
		
	
		JLabel titleOfTop = new JLabel("Information of " + info[3]); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 
		
		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);
		
		JTable infoTable = new JTable(); 
		String[] columnNames1 = {"ID",
				"Date Added",
				  "FirstName",
				  "LastName",
				  "Birthday",
				  "Gender",
				  "PhoneNumber",
				  "SSN",
				  "Address1"
				  
				}; 
		String [] columnNames2 = {"Address2",
					"City",
				  "State",
				  "Zip",
				  "Country",
				 "Insurance #",
				"Occupation",
				"WorkStatus",
				"Education"
				
		}; 
		
		String[][] data1 = {{info[0],info[1],info[2],info[3],
							info[4],info[5],info[6],info[7],
							info[8]}};
		String[][] data2 = {{info[9],info[10],info[11],
			info[12],info[13],info[14],info[15],info[16],info[17]}};
		
		JPanel center = new JPanel(new BorderLayout());
		
		 table1 = new JTable(data1, columnNames1); 
		
		JPanel tableNorth = new JPanel(new BorderLayout()); 
		center.add(tableNorth, BorderLayout.NORTH); 
		tableNorth.add(table1.getTableHeader(),BorderLayout.NORTH); 
		tableNorth.add(table1,BorderLayout.CENTER); 
		table1.setFillsViewportHeight(true);
		
		JPanel tableSouth = new JPanel(new BorderLayout()); 
		 table2 = new JTable(data2, columnNames2); 
		tableSouth.add(table2.getTableHeader(),BorderLayout.NORTH);
		tableSouth.add(table2,BorderLayout.CENTER); 
		center.add(tableSouth,BorderLayout.CENTER); 
		table2.setFont(new Font("Arial", Font.PLAIN, 15));
		table1.setFont(new Font("Arial", Font.PLAIN, 15));
		updateInfo = new JButton("Update Inputted Info of Table and Description"); 
		
		
		updateInfo.setOpaque(true);
		updateInfo.setForeground(Color.black);
	
	
		updateInfo.setFont(new Font("Arial", Font.BOLD, 30));
		
		JPanel centerSouth = new JPanel(new BorderLayout()); 
		centerSouth.add(updateInfo, BorderLayout.NORTH); 
		centerSouth.setPreferredSize(new Dimension(200,200));
		center.add(centerSouth, BorderLayout.SOUTH); 
		JLabel etiology = new JLabel("Etiology"); 
		etiology.setFont(new Font("Arial", Font.BOLD, 30));
		centerSouth.add(etiology, BorderLayout.WEST); 
		
		etiologyText = new JTextArea(info[18]);
		etiologyText.setBorder(BorderFactory.createLineBorder(Color.black));
		
		centerSouth.add(etiologyText,BorderLayout.CENTER); 
		
		
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
		frame.add(center,BorderLayout.CENTER); 
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
	public void addUpdateListener(ActionListener c)
	{
		updateInfo.addActionListener(c);
	}
	public String[] getEditedInfo()
	{
		String[] info = { 
				(String)table1.getModel().getValueAt(0, 0),
				(String)table1.getModel().getValueAt(0, 1),
				(String)table1.getModel().getValueAt(0, 2),
				(String)table1.getModel().getValueAt(0, 3),
				(String)table1.getModel().getValueAt(0, 4),
				(String)table1.getModel().getValueAt(0, 5),
				(String)table1.getModel().getValueAt(0, 6),
				(String)table1.getModel().getValueAt(0, 7),
				(String)table1.getModel().getValueAt(0, 8),
				(String)table2.getModel().getValueAt(0, 0),
				(String)table2.getModel().getValueAt(0, 1),
				(String)table2.getModel().getValueAt(0, 2),
				(String)table2.getModel().getValueAt(0, 3),
				(String)table2.getModel().getValueAt(0, 4),
				(String)table2.getModel().getValueAt(0, 5),
				(String)table2.getModel().getValueAt(0, 6),
				(String)table2.getModel().getValueAt(0, 7),
				(String)table2.getModel().getValueAt(0, 8),
				etiologyText.getText()
		};
		return info; 
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
		test.setTinAndCusDesc("WOW NICE");
		PatientInfoPage info = new PatientInfoPage(frame, test.getInfo()); 
		
		info.addUpdateListener((e)->{
		for (String a : info.getEditedInfo())
			{
				System.out.println(a); 
			};});
		
 
		
	}
	
}
