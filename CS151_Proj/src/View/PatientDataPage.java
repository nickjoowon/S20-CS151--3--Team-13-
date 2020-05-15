package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * page 7
 * @author Marco
 *
 */
public class PatientDataPage {
    JFrame frame; 
	JButton next;
	JButton back;
	
	
	public PatientDataPage(JFrame frame)
	{
		this.frame = frame;
		frame.getContentPane().removeAll(); 
		frame.setTitle("Patient Database");
		
		//panel for the top blue part
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());
		
		JLabel titleOfTop = new JLabel("Patient Database"); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 
		
		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);
		
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
	}
}
