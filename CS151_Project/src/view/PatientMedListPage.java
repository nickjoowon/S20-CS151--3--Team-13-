package view;

/**
 * page 9
 *@author Nick
 */
import java.awt.*;
import javax.swing.*;

import model.Patient;


public class PatientMedListPage {
	JFrame frame;
	JButton back;
	JButton medication;

	public PatientMedListPage(JFrame frame, String lastName, String[] medList) {
		this.frame = frame;
		frame.getContentPane().removeAll();
		frame.setTitle("Medication List");
		//temporary
		frame.setSize(910,700); 

		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());


		JLabel titleOfTop = new JLabel("Medication of Patient " + lastName); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 

		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);


		//center box that contains the medication names
		JPanel medBox = new JPanel();
		medBox.setPreferredSize(new Dimension(330, 200));
		medBox.setOpaque(true);
		medBox.setForeground(Color.white);
		medBox.setBackground(new Color(41,142,208));
		medBox.setLayout(new BorderLayout());


		//white spaces around the medbox
		JPanel westWhite = new JPanel();
		JPanel southWhite = new JPanel();
		JPanel eastWhite = new JPanel();
		JPanel northWhite = new JPanel();

		westWhite.setPreferredSize(new Dimension(100, 335));
		westWhite.setOpaque(true);
		eastWhite.setPreferredSize(new Dimension(100, 335));
		eastWhite.setOpaque(true);
		northWhite.setPreferredSize(new Dimension(440, 100));
		northWhite.setOpaque(true);
		southWhite.setPreferredSize(new Dimension(440, 100));
		southWhite.setOpaque(true);


		medBox.add(westWhite, BorderLayout.WEST);
		medBox.add(eastWhite, BorderLayout.EAST);
		medBox.add(northWhite, BorderLayout.NORTH);
		medBox.add(southWhite, BorderLayout.SOUTH);

		//this panel is where the medicine buttons will go into
		JPanel medicines = new JPanel();
		medicines.setPreferredSize(new Dimension(240,135));
		medicines.setLayout(new GridLayout(3,4));
		medicines.setOpaque(true);
		medicines.setBackground(new Color(41,142,208));

		medBox.add(medicines, BorderLayout.CENTER);

		//adding buttons to medicines
		int numMed = 0;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 4; c++) {
				if(numMed > medList.length-1)
					break;
				medication = new JButton("Medication " + (r*4 + c + 1));
				medication.setPreferredSize(new Dimension(60,27));
				medication.setOpaque(true);
				medication.setBackground(Color.white);
				medication.setBorderPainted(true);
				medication.setFont(new Font("Arial", Font.PLAIN, 12));
				medicines.add(medication).setLocation(r+1, c+1);
				numMed++;
			}
		}






		//Panel to organize back button
		JPanel backPanel = new JPanel(); 
		backPanel.setLayout(new BorderLayout());

		back = new JButton("Back"); 
		back.setPreferredSize(new Dimension(125,50));
		back.setOpaque(true);
		back.setForeground(Color.white);
		back.setBackground(new Color(41,142,208));
		back.setBorderPainted(false);
		backPanel.add(back, BorderLayout.WEST);
		// For space between buttons and bottom 
		JPanel bottomDecorationWhite = new JPanel();		
		backPanel.add(bottomDecorationWhite, BorderLayout.SOUTH); 










		frame.add(top, BorderLayout.NORTH);
		frame.add(medBox, BorderLayout.CENTER);
		frame.add(backPanel, BorderLayout.SOUTH);

		//temprorary
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.repaint();
		frame.revalidate();

	}

	public static void main(String[] args) {
		String[] s = {"1","2","3","","",""};
		PatientMedListPage n = new PatientMedListPage(new JFrame(), null, s);
	}







}
