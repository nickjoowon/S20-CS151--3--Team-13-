package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * page 13
 *
 */
public class CategoryPage {

	JFrame frame;
	JButton finish;
	JButton back;
	JButton medH;
	JButton meds;
	String lastname;
	private JCheckBox c1;
	private JCheckBox c2;
	private JCheckBox c3;
	private JCheckBox c4;
	private JCheckBox c5;
	
		public CategoryPage(JFrame frame, String patientLastName)
		{
			this.frame = frame;
			frame.getContentPane().removeAll(); 
			frame.setTitle("Assign Category");
			lastname = patientLastName;
			
			//panel for the top blue part 
			JPanel top = new JPanel(); 
			top.setPreferredSize(new Dimension(440, 100));
			top.setOpaque(true);
			top.setForeground(Color.white);
			top.setBackground(new Color(41,142,208));
			top.setLayout(new BorderLayout());
			
			JLabel titleOfTop = new JLabel(" Assign Category for Patient "+lastname); 
			titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
			titleOfTop.setForeground(Color.white);
			top.add(titleOfTop, BorderLayout.WEST);
			//JLabel secondarytitleOfTop = new JLabel(" Check Medical History and Medications "); 
			//secondarytitleOfTop.setFont(new Font("Arial", Font.BOLD, 30));
			//secondarytitleOfTop.setForeground(Color.white);
			//top.add(secondarytitleOfTop, BorderLayout.WEST);
			
			JPanel topDecoration = new JPanel();
			topDecoration.setPreferredSize(new Dimension(440, 15));
			top.add(topDecoration, BorderLayout.NORTH);
			
			//Panel to organize back and finish buttons 
			JPanel backAndFinish = new JPanel(); 
			backAndFinish.setLayout(new BorderLayout());
			
			back = new JButton("Back"); 
			back.setPreferredSize(new Dimension(125,50));
			back.setOpaque(true);
			back.setForeground(Color.white);
			back.setBackground(new Color(41,142,208));
			back.setBorderPainted(false);
			backAndFinish.add(back, BorderLayout.WEST);
			
			
			finish = new JButton("Finish");
			finish.setPreferredSize(new Dimension(125,50));
			finish.setOpaque(true);
			finish.setForeground(Color.white);
			finish.setBackground(new Color(41,142,208));
			finish.setBorderPainted(false);
			backAndFinish.add(finish, BorderLayout.EAST);
			
			// For space between buttons at bottom 
			JPanel bottomDecorationWhite = new JPanel();
			
			backAndFinish.add(bottomDecorationWhite, BorderLayout.SOUTH);
			
			
			//Panel to organize other buttons
			JPanel buttons = new JPanel(); 
			buttons.setLayout(new GridLayout(5,1));
			
			//added whitespace above buttons
			JPanel aboveButtonDecorationWhite = new JPanel();
			buttons.add(aboveButtonDecorationWhite, BorderLayout.NORTH);
			//medications
			meds = new JButton("Medications"); 
			meds.setFont(new Font("Arial", Font.BOLD, 30));
			meds.setPreferredSize(new Dimension(125,50));
			meds.setOpaque(true);
			meds.setForeground(Color.white);
			meds.setBackground(new Color(41,142,208));
			meds.setBorderPainted(false);
			buttons.add(meds, BorderLayout.EAST);
			//added whitespace between buttons
			JPanel underButtonDecorationWhite = new JPanel();
			buttons.add(underButtonDecorationWhite, BorderLayout.SOUTH);
			
			//medications
			medH = new JButton("Medical History"); 
			medH.setFont(new Font("Arial", Font.BOLD, 30));
			medH.setPreferredSize(new Dimension(125,50));
			medH.setOpaque(true);
			medH.setForeground(Color.white);
			medH.setBackground(new Color(41,142,208));
			medH.setBorderPainted(false);
			buttons.add(medH, BorderLayout.EAST);
			
		
			//panel for checkboxes
			JPanel boxes = new JPanel();
			boxes.setLayout(new GridLayout(5,1));
			
			c1 = new JCheckBox("0 - tinnitus present but no impact");
			c1.setFont(new Font("Arial", Font.BOLD, 20));
			c1.setBackground(Color.WHITE);
			
			c2 = new JCheckBox("1 - tinnitus  w/ high impact"); 
			c2.setFont(new Font("Arial", Font.BOLD, 20));
			c2.setBackground(Color.WHITE);
			
			c3 = new JCheckBox("2 - hearing problem present & relevant");
			c3.setFont(new Font("Arial", Font.BOLD, 20));
			c3.setBackground(Color.WHITE);
			
			c4 = new JCheckBox("3 - hypercausis is a major problem"); 
			c4.setFont(new Font("Arial", Font.BOLD, 20));
			c4.setBackground(Color.WHITE);
			
			c5 = new JCheckBox("4 - prolonged tinnitus exacerbation"); 
			c5.setFont(new Font("Arial", Font.BOLD, 20));
			c5.setBackground(Color.WHITE);
			
			
			boxes.add(c1);
			boxes.add(c2);
			boxes.add(c3);
			boxes.add(c4);
			boxes.add(c5);
			
			
			//add panels to frame
			frame.add(boxes, BorderLayout.WEST);
			frame.add(buttons, BorderLayout.CENTER);
			frame.add(top, BorderLayout.NORTH); 
			frame.add(backAndFinish, BorderLayout.SOUTH);
			
			frame.repaint();
			frame.revalidate();
		}
		public void addFinishListener(ActionListener f)
		{
			finish.addActionListener(f);
		}
		public void addBackListener(ActionListener b)
		{
			back.addActionListener(b);
		}
		
}
