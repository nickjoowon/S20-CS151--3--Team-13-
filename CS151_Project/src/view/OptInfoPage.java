package view;

/**
 * page 3
 * 
 * Part 2 of registering a patient. there are optional fields that can be entered before going to part 3.
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
public class OptInfoPage {
    JFrame frame; 
	JButton next;
	JButton back;
	private JTextField occupationText;
	private JTextField educationText;
	private JTextField workText;
	
	/**
	 * Reuses frame from last Page and redraws on it
	 * Creates UI
	 * @param frame
	 */
	public OptInfoPage(JFrame frame)
	{
		this.frame = frame; 
		frame.getContentPane().removeAll(); 
		frame.setTitle("Optional Information"); 
		
		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());
		
		
		
		JLabel titleOfTop = new JLabel("Optional Registration Information"); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 
		
		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);
		
		
		//IDNumber till SSN. Labels and text fields 
		JPanel center = new JPanel(); 
		center.setLayout(new GridLayout(3,2));
		
		JLabel occupation = new JLabel("Occupation"); 
		occupation.setFont(new Font("Arial", Font.PLAIN, 20));
		center.add(occupation);
		occupationText = new JTextField(); 
		center.add(occupationText); 
		
		JLabel work = new JLabel("Work Status"); 
		work.setFont(new Font("Arial", Font.PLAIN, 20));
		center.add(work);
		workText = new JTextField(); 
		center.add(workText); 
		
		JLabel education = new JLabel("Education Degree"); 
		education.setFont(new Font("Arial", Font.PLAIN, 20));
		center.add(education);
		educationText = new JTextField(); 
		center.add(educationText); 
		
		
		
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
		
		frame.add(center, BorderLayout.CENTER);
		frame.add(top, BorderLayout.NORTH); 
		frame.add(backAndNext, BorderLayout.SOUTH); 
		
	
		frame.repaint();
		frame.revalidate();
	}
	
	/**
	 * actionlistener will work for this next button
	 * @param a
	 */
	public void addNextListener(ActionListener a)
	{
		next.addActionListener(a);
	}
	
	/**
	 * actionlistener will work for this back button
	 * @param b
	 */
	public void addBackListener(ActionListener b)
	{
		back.addActionListener(b);
	}
	
	/**
	 * gives string containing occupation
	 * @return
	 */
	public String getOccupation() {
		return occupationText.getText(); 
		
	}
	
	/**
	 * gives string containing work status
	 * @return
	 */
	public String getWorkStatus() {
		return workText.getText(); 
		
	}
	
	/**
	 * gives string containing education text
	 * @return
	 */
	public String getEducationDegree() {
		return educationText.getText(); 
		
	}
	
}
