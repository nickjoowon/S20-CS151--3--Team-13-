package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * page 15
 */
public class SpecificVisitInfoPage {
	
	JFrame frame; 
	JButton next;
	JButton back;
	private JTextField dateOfVisitText;
	private JTextField sequenceNumText;
	private JTextField treatmentProgText;
	private JTextField tinHypInterviewText;
	private JCheckBox sndThrpyCheck;
	private JCheckBox earMeasureCheck;
	private JCheckBox counselCheck;

	public SpecificVisitInfoPage(JFrame frame, String lastName, String visitNum, String inputDateV, String inputSeqN, String inputTreatP, 
								String inputForm, boolean inputSnd, boolean inputEarMeas, boolean inputCounsel) {
		this.frame = frame; 
		frame.getContentPane().removeAll(); 
		frame.setTitle("Visit Information Page"); 
		//temporary
		frame.setSize(910,700); 

		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());



		JLabel titleOfTop = new JLabel("Visit "+ visitNum + " of Patient " + lastName); 
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
		//setting the text to the input string value
		dateOfVisitText.setText(inputDateV);
		centerLeft.add(dateOfVisitText); 


		JLabel sequenceNum = new JLabel("Sequence Number"); 
		sequenceNum.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(sequenceNum);
		sequenceNumText = new JTextField(); 
		//setting the text to the input string value
		sequenceNumText.setText(inputSeqN);
		centerLeft.add(sequenceNumText); 

		
		JLabel treatmentProg = new JLabel("Treatment Progress");
		treatmentProg.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(treatmentProg);
		treatmentProgText = new JTextField();
		//setting the text to the input string value
		treatmentProgText.setText(inputTreatP);
		centerLeft.add(treatmentProgText);

		JLabel treatMethods = new JLabel("Treatment Methods");
		treatmentProg.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(treatMethods);
		JPanel checkPanel = new JPanel();

		checkPanel.setLayout(new GridLayout(3,1));
		//setting the check box based on input boolean value
		sndThrpyCheck = new JCheckBox("Sound Therapy", inputSnd);
		earMeasureCheck = new JCheckBox("Real Ear Measurement", inputEarMeas);
		counselCheck = new JCheckBox("Counseling", inputCounsel);
		checkPanel.add(sndThrpyCheck);
		checkPanel.add(earMeasureCheck);
		checkPanel.add(counselCheck);
		centerLeft.add(checkPanel);


		//right side of the screen, includes tin/hyp interview form
		JPanel centerRight = new JPanel(); 
		centerRight.setLayout(new BorderLayout());

		JLabel tinHypInterview = new JLabel("Tinnitus/Hyperacusis Interview Form");
		centerRight.add(tinHypInterview, BorderLayout.NORTH);
		tinHypInterviewText = new JTextField();
		//setting the text to the input string value
		tinHypInterviewText.setText(inputForm);
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

		next = new JButton("Edit Information");
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
 		frame.setVisible(true);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.repaint();
		frame.revalidate();


	}
	
	
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
	
	public boolean isSoundTherapyChecked()
	{
		return sndThrpyCheck.isSelected(); 
	}
	public boolean isEarMeasureChecked()
	{
		return earMeasureCheck.isSelected(); 
	}
	public boolean isCounselChecked()
	{
		return counselCheck.isSelected(); 
	}
	
	public void addBackListener(ActionListener a) {
		back.addActionListener(a);
	}
	public void addNextListener(ActionListener a) {
		next.addActionListener(a);
	}
	
	
	
	//for testing purposes
 	public static void main(String[] args) {
 		String s = "amazing nick";
 		//SpecificVisitInfoPage n = new SpecificVisitInfoPage(new JFrame(), s, 0, "a", "b", "c", "d", true, true, true);
 	}
	
	
}
