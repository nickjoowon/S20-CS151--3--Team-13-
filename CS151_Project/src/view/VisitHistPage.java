package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import model.Patient;
import model.Visit;

/**
 * page 14
 *
 */
public class VisitHistPage {
	JFrame frame; 
	JButton back;
	JButton info;
	JList list;
	ArrayList<Visit> visits;
	String name;
	String last;
	
	public VisitHistPage(JFrame frame, ArrayList<Visit> visits, String name, String lastname) 
	{
		this.frame = frame;
		this.visits = visits;
		this.name = name;
		last = lastname;
		frame.getContentPane().removeAll(); 
		frame.setTitle(" Patient Visit History ");
		
		//panel for the top blue part
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());
		
		JLabel titleOfTop = new JLabel("Visit History of "+last+", "+ name); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 
		
		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);
		
		//Panel to organize back and next buttons 
				JPanel backP = new JPanel(); 
				backP.setLayout(new BorderLayout());
				
				back = new JButton("Back"); 
				back.setPreferredSize(new Dimension(125,50));
				back.setOpaque(true);
				back.setForeground(Color.white);
				back.setBackground(new Color(41,142,208));
				back.setBorderPainted(false);
				backP.add(back, BorderLayout.WEST);
				
				
				
				JPanel sbTitle = new JPanel();
				JLabel titleOfScroll = new JLabel("Select a Visit"); 
				titleOfScroll.setFont(new Font("Arial", Font.BOLD, 20));
				titleOfScroll.setForeground(Color.black);
				sbTitle.add(titleOfScroll);
				//list of visits
				//get this from model
				String information[] = new String [visits.size()];
				for(int i = 0; i < information.length; i++) {
					information[i] = visits.get(i).getDate() + "          " + visits.get(i).getSeqNum();
				}
			
			//note that a space b4 and after information makes it look nicer and less crowded.
			JPanel scroll = new JPanel(new BorderLayout());
			list = new JList(information);
			list.setFont(new Font("Arial", Font.PLAIN, 25));
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			list.setSelectionBackground(Color.cyan); 
			JScrollPane scrollBar = new JScrollPane(list);
			scrollBar.setColumnHeaderView(sbTitle);
			scroll.add(scrollBar);
			scroll.setPreferredSize(new Dimension(400,400));
			
			//for buttons in the visit history page
			JPanel VisitButtons = new JPanel();
			VisitButtons.setLayout(new GridLayout(3,1));
			
			//for space between info and left
			JPanel leftInfoDecorationWhite = new JPanel();
			VisitButtons.add(leftInfoDecorationWhite, BorderLayout.WEST);
			//info
			info = new JButton("Info"); 
			info.setFont(new Font("Arial", Font.BOLD, 30));
			info.setPreferredSize(new Dimension(125,50));
			info.setOpaque(true);
			info.setForeground(Color.white);
			info.setBackground(new Color(41,142,208));
			info.setBorderPainted(false);
			VisitButtons.add(info, BorderLayout.WEST);
			//for space between info and right
			JPanel rightInfoDecorationWhite = new JPanel();
			VisitButtons.add(rightInfoDecorationWhite, BorderLayout.EAST);
			
			//for space between info and left
			JPanel leftAudioDecorationWhite = new JPanel();
			VisitButtons.add(leftInfoDecorationWhite, BorderLayout.WEST);
			//info
			info = new JButton("View Audiological Evaluation"); 
			info.setFont(new Font("Arial", Font.BOLD, 30));
			info.setPreferredSize(new Dimension(125,50));
			info.setOpaque(true);
			info.setForeground(Color.white);
			info.setBackground(new Color(41,142,208));
			info.setBorderPainted(false);
			VisitButtons.add(info, BorderLayout.WEST);
			//for space between info and right
			JPanel rightAudioDecorationWhite = new JPanel();
			VisitButtons.add(rightInfoDecorationWhite, BorderLayout.EAST);
			
			
			
			
			
			
			//add the panels into the frame 
			frame.add(top, BorderLayout.NORTH); 
			frame.add(backP, BorderLayout.SOUTH); 
			frame.add(VisitButtons, BorderLayout.CENTER);
			frame.add(scroll, BorderLayout.WEST);
			
			

			frame.repaint();
			frame.revalidate();
	}
	public boolean isVisitSelected()
	{
		for(int i = 0; i < visits.size();i++)
		{
			if(list.isSelectedIndex(i) == true)
				return true; //returns true if any one of them is selected
		}
		
		
		return false;
	}
	
	public Visit whichVisit() //only use if isVisitSelected() returns true
	{
		for(int i = 0; i < visits.size();i++)
		{
			if(list.isSelectedIndex(i) == true)
				return visits.get(i);
		}
		System.out.println("Error. WhichVisit() called when no visit is selected");
		return visits.get(0); //this doesnt matter
							//a patient needs to be selected b4 this method is called
							//so this should hopefully never be reached
		
	}
				
}
