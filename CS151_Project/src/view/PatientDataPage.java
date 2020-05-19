package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import model.Patient;


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
	JButton listB;
	
	
	public PatientDataPage(JFrame frame, ArrayList<Patient> pList)
	{
		this.frame = frame;
		frame.getContentPane().removeAll(); 
		frame.setTitle(" Patient Database ");
		
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
				
				JPanel sbTitle = new JPanel();
				JLabel titleOfScroll = new JLabel("Select a Patient"); 
				titleOfScroll.setFont(new Font("Arial", Font.BOLD, 20));
				titleOfScroll.setForeground(Color.black);
				sbTitle.add(titleOfScroll);
				//list of users and their ID number
				//get this from model
				String patients[] = new String [pList.size()];
				for(int i = 0; i < patients.length; i++) {
					patients[i] = pList.get(i).getPatientID() + "          " + pList.get(i).getFirstName() + "" + pList.get(i).getLastName();
				}
			
			//note that a space b4 and after information makes it look nicer and less crowded.
			JPanel scroll = new JPanel(new BorderLayout());
			JList list = new JList(patients);
			list.setFont(new Font("Arial", Font.PLAIN, 25));
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane scrollBar = new JScrollPane(list);
			scrollBar.setColumnHeaderView(sbTitle);
			scroll.add(scrollBar);
			scroll.setPreferredSize(new Dimension(400,400));
			listB = new JButton("");
			
			//for buttons regarding patients
			JPanel patientButtons = new JPanel();
			patientButtons.setLayout(new GridLayout(6,1));
			
			
			//for space between info and left
			JPanel leftInfoDecorationWhite = new JPanel();
			patientButtons.add(leftInfoDecorationWhite, BorderLayout.WEST);
			//info
			info = new JButton("Info"); 
			info.setFont(new Font("Arial", Font.BOLD, 30));
			info.setPreferredSize(new Dimension(125,50));
			info.setOpaque(true);
			info.setForeground(Color.white);
			info.setBackground(new Color(41,142,208));
			info.setBorderPainted(false);
			patientButtons.add(info, BorderLayout.WEST);
			//for space between info and right
			JPanel rightInfoDecorationWhite = new JPanel();
			patientButtons.add(rightInfoDecorationWhite, BorderLayout.EAST);
			
			//for space between addvisit and left
			//JPanel leftVisitDecorationWhite = new JPanel();
			//patientButtons.add(leftVisitDecorationWhite, BorderLayout.WEST);
			//addvisit
			addVisit = new JButton("+ Add Visit"); 
			addVisit.setFont(new Font("Arial", Font.BOLD, 30));
			addVisit.setPreferredSize(new Dimension(125,50));
			addVisit.setOpaque(true);
			addVisit.setForeground(Color.white);
			addVisit.setBackground(new Color(41,142,208));
			addVisit.setBorderPainted(false);
			patientButtons.add(addVisit, BorderLayout.WEST);
			//for space between addvisit and right
			//JPanel rightVisitDecorationWhite = new JPanel();
			//patientButtons.add(rightVisitDecorationWhite, BorderLayout.EAST);
			
			
			//for space between history and left
			JPanel leftHistoryDecorationWhite = new JPanel();
			patientButtons.add(leftHistoryDecorationWhite, BorderLayout.WEST);
			//history
			history = new JButton("Visit History");
			history.setFont(new Font("Arial", Font.BOLD, 30));
			history.setPreferredSize(new Dimension(125,50));
			history.setOpaque(true);
			history.setForeground(Color.white);
			history.setBackground(new Color(41,142,208));
			history.setBorderPainted(false);
			patientButtons.add(history, BorderLayout.WEST);
			//for space between history and right
			//JPanel rightHistoryDecorationWhite = new JPanel();
			//patientButtons.add(rightHistoryDecorationWhite, BorderLayout.EAST);
			
			
			//for space between schedule and left
			JPanel leftScheduleDecorationWhite = new JPanel();
			patientButtons.add(leftScheduleDecorationWhite, BorderLayout.WEST);
			//schedule
			schedule = new JButton("Schedule Visit");
			schedule.setFont(new Font("Arial", Font.BOLD, 30));
			schedule.setPreferredSize(new Dimension(125,50));
			schedule.setOpaque(true);
			schedule.setForeground(Color.white);
			schedule.setBackground(new Color(41,142,208));
			schedule.setBorderPainted(false);
			patientButtons.add(schedule, BorderLayout.WEST);
			//for space between addvisit and right
			JPanel rightScheduleDecorationWhite = new JPanel();
			patientButtons.add(rightScheduleDecorationWhite, BorderLayout.EAST);
			
			
			//for space between delete and left
			//JPanel leftDeleteDecorationWhite = new JPanel();
			//patientButtons.add(leftDeleteDecorationWhite, BorderLayout.WEST);
			//delete
			delete = new JButton("Delete");
			delete.setFont(new Font("Arial", Font.BOLD, 30));
			delete.setPreferredSize(new Dimension(125,50));
			delete.setOpaque(true);
			delete.setForeground(Color.white);
			delete.setBackground(new Color(41,142,208));
			delete.setBorderPainted(false);
			patientButtons.add(delete, BorderLayout.WEST);
			//for space between delete and right
			JPanel rightDeleteDecorationWhite = new JPanel();
			patientButtons.add(rightDeleteDecorationWhite, BorderLayout.EAST);
			
			
			// For space between buttons and bottom 
			JPanel bottomDecorationWhite = new JPanel();
				
			backAndNew.add(bottomDecorationWhite, BorderLayout.SOUTH);	
			
			
			//add the panels into the frame 
			frame.add(top, BorderLayout.NORTH); 
			frame.add(backAndNew, BorderLayout.SOUTH); 
			frame.add(patientButtons, BorderLayout.CENTER);
			frame.add(scroll, BorderLayout.WEST);
			
			
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
	public void addInfoListener(ActionListener i)
	{
		info.addActionListener(i);
	}
	public void addVisitListener(ActionListener v)
	{
		addVisit.addActionListener(v);
	}
	public void addDeleteListener(ActionListener d)
	{
		delete.addActionListener(d);
	}
	public void addHistoryListener(ActionListener h)
	{
		history.addActionListener(h);
	}
	public void addScheduleListener(ActionListener s)
	{
		schedule.addActionListener(s);
	}
	public void addListListener(ActionListener l)
	{
		listB.addActionListener(l);
	}
}
