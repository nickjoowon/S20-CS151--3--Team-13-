package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Page 5
 * 
 * Part 4 of Registering a new Patient. Options to add medications by entering info in text fields until user hits finish.
 *
 */
public class InputMedPage {
    JFrame frame; 
	JButton addMed;
	JButton back;
	JButton finish;
	private JTextField currentMedText;
	private JTextField nameText;
	private JTextField doseText;
	private JTextField durationText;
	private JTextField chemicalCategoryText;
	private JTextField actionText;
	private JTextField applicationText;
	private JTextField usualDoseText;
	private JTextField sideEffectText; 
	
	/**
	 * Reuses frame from last Page and redraws on it
	 * Creates UI
	 * 
	 * @param frame
	 */
	public InputMedPage(JFrame frame)
	{
		this.frame = frame; 
		frame.getContentPane().removeAll(); 
		frame.setTitle("Medical History"); 
		
		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());
		
		
		
		JLabel titleOfTop = new JLabel("Medical History"); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 
		
		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);
		
		
		//IDNumber till SSN. Labels and text fields 
		JPanel centerLeft = new JPanel(); 
		centerLeft.setLayout(new GridLayout(5,2));
		
		JLabel currentMed = new JLabel("Current Medication"); 
		currentMed.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(currentMed); 
		currentMedText = new JTextField(); 
		centerLeft.add(currentMedText); 
		
		
		JLabel name = new JLabel("Medicant's Name"); 
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(name);
		nameText = new JTextField(); 
		centerLeft.add(nameText); 
		
		JLabel dose = new JLabel("Generic Dose"); 
		dose.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(dose);
		doseText = new JTextField(); 
		centerLeft.add(doseText); 
		
		JLabel duration = new JLabel("Duration"); 
		duration.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(duration);
		durationText = new JTextField(); 
		centerLeft.add(durationText); 
		
		JLabel chemicalCategory = new JLabel("Chemical Category"); 
		chemicalCategory.setFont(new Font("Arial", Font.PLAIN, 20));
		centerLeft.add(chemicalCategory);
		chemicalCategoryText = new JTextField(); 
		centerLeft.add(chemicalCategoryText); 
		
		//Centerright. Street address1 till insurance number 
		JPanel centerRight = new JPanel(); 
		centerRight.setLayout(new GridLayout(4,2));
		
		
		JLabel action = new JLabel("Action"); 
		action.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(action);
		actionText = new JTextField(); 
		centerRight.add(actionText); 
		
		JLabel application = new JLabel("Application"); 
		application.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(application);
		applicationText = new JTextField(); 
		centerRight.add(applicationText); 
		
		JLabel usualDose = new JLabel("Usual Dose"); 
		usualDose.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(usualDose);
		usualDoseText = new JTextField(); 
		centerRight.add(usualDoseText); 
		
		JLabel sideEffect = new JLabel("Side Effects"); 
		sideEffect.setFont(new Font("Arial", Font.PLAIN, 20));
		centerRight.add(sideEffect);
		sideEffectText = new JTextField(); 
		centerRight.add(sideEffectText); 
		
		
		
		
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
		
		
		addMed = new JButton("Add Med");
		addMed.setPreferredSize(new Dimension(125,50));
		addMed.setOpaque(true);
		addMed.setForeground(Color.white);
		addMed.setBackground(new Color(41,142,208));
		addMed.setBorderPainted(false);
		
		
		
		// For space between buttons and bottom 
		JPanel bottomDecorationWhite = new JPanel();
		
		backAndNext.add(bottomDecorationWhite, BorderLayout.SOUTH); 
		
		// organize the center with the finish button
		JPanel center = new JPanel(); 
		center.setPreferredSize(new Dimension(400,600));
		center.add(centerLeft, BorderLayout.CENTER);
		center.add(centerRight,BorderLayout.EAST);
		
		JPanel finishPanel = new JPanel(new BorderLayout()); 
		finish = new JButton("Finish");
		finish.setPreferredSize(new Dimension(125,50));
		finish.setOpaque(true);
		finish.setForeground(Color.white);
		finish.setBackground(new Color(41,142,208));
		finish.setBorderPainted(false);
		finishPanel.add(finish, BorderLayout.EAST); 
		center.add(addMed,BorderLayout.NORTH); 
		
		backAndNext.add(finishPanel, BorderLayout.EAST); 
				
		
		//add the panels into the frame 
		frame.add(center, BorderLayout.CENTER);
		
		frame.add(top, BorderLayout.NORTH); 
		frame.add(backAndNext, BorderLayout.SOUTH); 
		
		
		
		
		
		
		
		
	
		frame.repaint();
		frame.revalidate();
	}
	
	public void addNextListener(ActionListener a)
	{
		addMed.addActionListener(a);
	}
	public void addBackListener(ActionListener b)
	{
		back.addActionListener(b);
	}
	public void addFinishListener(ActionListener f)
	{
		finish.addActionListener(f);
	}
	public String[] getRequiredInfo()
	{
		String[] info = new String[] {
				currentMedText.getText(),
				nameText.getText(), 
				doseText.getText(),
				durationText.getText(),
				chemicalCategoryText.getText(),
				actionText.getText(),
				applicationText.getText(),
				usualDoseText.getText(),
				sideEffectText.getText()};
		return info; 
		
	}
	
	
	


}
