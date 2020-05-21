package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

/**
 * page 11
 * 
 *  The first page for entering information during a patient's visit
 *  Contains fields and checkboxes for the doctor/nurse to enter information into
 *  
 */
public class VisitInfoPage {
	JFrame frame; 
	JButton next;
	JButton back;
	private JTextField dateOfVisitText;
	private JTextField sequenceNumText;
	private JTextField treatmentProgText;
	private JTextArea tinHypInterviewText;
	private JCheckBox sndThrpyCheck;
	private JCheckBox earMeasureCheck;
	private JCheckBox counselCheck;

	/**
	 * Reuses frame from last Page and redraws on it
	 * Takes in String of a Patient's name to display it on the title
	 * sets dimensions and creates UI
	 * 
	 * @param frame
	 * @param s
	 */
	public VisitInfoPage(JFrame frame, String s) {
		this.frame = frame; 
		frame.getContentPane().removeAll(); 
		frame.setTitle("Visit Information Page"); 
		//temporary
		//		frame.setSize(910,700); 

		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());



		JLabel titleOfTop = new JLabel("New Visit Information for Patient " + s); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 

		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);

		//Date of visit to treatment methods
		JPanel centerLeft = new JPanel(); 
		centerLeft.setLayout(new GridLayout(4,2));

		JLabel dateOfVisit = new JLabel("Date of Visit"); 
		dateOfVisit.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(dateOfVisit); 
		dateOfVisitText = new JTextField(); 
		centerLeft.add(dateOfVisitText); 


		JLabel sequenceNum = new JLabel("Sequence Number"); 
		sequenceNum.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(sequenceNum);
		sequenceNumText = new JTextField(); 
		centerLeft.add(sequenceNumText); 

		JLabel treatmentProg = new JLabel("Treatment Progress");
		treatmentProg.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(treatmentProg);
		treatmentProgText = new JTextField();
		centerLeft.add(treatmentProgText);

		JLabel treatMethods = new JLabel("Treatment Methods");
		treatmentProg.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(treatMethods);
		JPanel checkPanel = new JPanel();

		checkPanel.setLayout(new GridLayout(3,1));
		sndThrpyCheck = new JCheckBox("Sound Therapy");
		earMeasureCheck = new JCheckBox("Real Ear Measurement");
		counselCheck = new JCheckBox("Counseling");
		checkPanel.add(sndThrpyCheck);
		checkPanel.add(earMeasureCheck);
		checkPanel.add(counselCheck);
		centerLeft.add(checkPanel);


		//right side of the screen, includes tin/hyp interview form
		JPanel centerRight = new JPanel(); 
		centerRight.setLayout(new BorderLayout());

		JLabel tinHypInterview = new JLabel("Tinnitus/Hyperacusis Interview Form");
		centerRight.add(tinHypInterview, BorderLayout.NORTH);
		tinHypInterviewText = new JTextArea();
		centerRight.add(tinHypInterviewText, BorderLayout.CENTER);


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



		//add the panels to frame
		frame.add(centerLeft, BorderLayout.WEST);
		frame.add(centerRight, BorderLayout.CENTER);
		frame.add(top, BorderLayout.NORTH);
		frame.add(backAndNext, BorderLayout.SOUTH);


		//temprorary
		// 		frame.setVisible(true);
		// 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.repaint();
		frame.revalidate();





	}

	/**
	 * gets necessary information needed for fields
	 * 
	 * @return array of info from fields
	 */
	public String[] getInfo()
	{
		String [] info = 
			{
					dateOfVisitText.getText(),
					sequenceNumText.getText(), 
					treatmentProgText.getText(), 
					tinHypInterviewText.getText()
			}; 
		return info; 
	}
	/**
	 * actionlisteners work for this back button
	 * @param a
	 */
	public void addBackListener(ActionListener a)
	{
		back.addActionListener(a);
	}
	/**
	 * actionlisteners work for this next button
	 * @param a
	 */
	public void addNextListener(ActionListener a)
	{
		next.addActionListener(a);
	}


	/**
	 * returns true if box is checked
	 * @return
	 */
	public boolean isSoundTherapyChecked()
	{
		return sndThrpyCheck.isSelected(); 
	}
	
	/**
	 * returns true if box is checked
	 * @return
	 */
	public boolean isEarMeasureChecked()
	{
		return earMeasureCheck.isSelected(); 
	}
	
	/**
	 * returns true if box is checked
	 * @return
	 */
	public boolean isCounselChecked()
	{
		return counselCheck.isSelected(); 
	}


	//for testing purposes
	// 	public static void main(String[] args) {
	// 		String s = "amazing nick";
	// 		VisitInfoPage n = new VisitInfoPage(new JFrame(), s);
	// 	}



}
