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
	JButton info;
	JButton addVisit;
	JButton delete;
	JButton schedule;
	JButton history;
	
	
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
				JPanel backAndNew = new JPanel(); 
				backAndNew.setLayout(new BorderLayout());
				
				back = new JButton("Back"); 
				back.setPreferredSize(new Dimension(125,50));
				back.setOpaque(true);
				back.setForeground(Color.white);
				back.setBackground(new Color(41,142,208));
				back.setBorderPainted(false);
				backAndNew.add(back, BorderLayout.WEST);
				
				
				next = new JButton("Add New");
				next.setPreferredSize(new Dimension(125,50));
				next.setOpaque(true);
				next.setForeground(Color.white);
				next.setBackground(new Color(41,142,208));
				next.setBorderPainted(false);
				backAndNew.add(next, BorderLayout.EAST); 
				
			//list of users
			String patients[] = {" Temp 1 "," Temp 2 "," Temp 3 "," Temp 4 "," Temp 5 "," Temp 6 "}; //get this from model
			//note that a space b4 and after information makes it look nicer and less crowded.
			JList list = new JList(patients);
			list.setFont(new Font("Arial", Font.PLAIN, 30));
			JScrollPane scrollBar = new JScrollPane(list);
			
			//for buttons regarding patients
			JPanel patientButtons = new JPanel();
			patientButtons.setLayout(new GridLayout(5,2));
			
			info = new JButton("Info"); 
			info.setPreferredSize(new Dimension(125,50));
			info.setOpaque(true);
			info.setForeground(Color.white);
			info.setBackground(new Color(41,142,208));
			info.setBorderPainted(false);
			patientButtons.add(info, BorderLayout.WEST);
			
			addVisit = new JButton("+ Add Visit"); 
			addVisit.setPreferredSize(new Dimension(125,50));
			addVisit.setOpaque(true);
			addVisit.setForeground(Color.white);
			addVisit.setBackground(new Color(41,142,208));
			addVisit.setBorderPainted(false);
			patientButtons.add(addVisit, BorderLayout.WEST);
			
			history = new JButton("Visit History"); 
			history.setPreferredSize(new Dimension(125,50));
			history.setOpaque(true);
			history.setForeground(Color.white);
			history.setBackground(new Color(41,142,208));
			history.setBorderPainted(false);
			patientButtons.add(history, BorderLayout.WEST);
			
			schedule = new JButton("Schedule Visit"); 
			schedule.setPreferredSize(new Dimension(125,50));
			schedule.setOpaque(true);
			schedule.setForeground(Color.white);
			schedule.setBackground(new Color(41,142,208));
			schedule.setBorderPainted(false);
			patientButtons.add(schedule, BorderLayout.WEST);
			
			delete = new JButton("Delete"); 
			delete.setPreferredSize(new Dimension(125,50));
			delete.setOpaque(true);
			delete.setForeground(Color.white);
			delete.setBackground(new Color(41,142,208));
			delete.setBorderPainted(false);
			patientButtons.add(delete, BorderLayout.WEST);
			
			
			
			// For space between buttons and bottom 
			JPanel bottomDecorationWhite = new JPanel();
				
			backAndNew.add(bottomDecorationWhite, BorderLayout.SOUTH);	
			
			//add the panels into the frame 
			frame.add(top, BorderLayout.NORTH); 
			frame.add(backAndNew, BorderLayout.SOUTH); 
			frame.add(scrollBar, BorderLayout.WEST);
			frame.add(patientButtons, BorderLayout.CENTER);
			
			frame.repaint();
			frame.revalidate();
	}


	public void addBackListener(ActionListener b) 
	{
		back.addActionListener(b);
	}


	public void addNextListener(ActionListener a) 
	{
		next.addActionListener(a);
	}

}
