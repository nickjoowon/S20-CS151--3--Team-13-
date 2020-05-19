package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;



import javax.swing.*; 

public class MenuPage {
  private JButton registerButton; 
	private JButton viewButton; 
	private JFrame frame;
	private JButton undoButton; 
	boolean isUndo; 
	public MenuPage(JFrame frame)
	{
		this.frame = frame;
		frame.setResizable(false);
		frame.getContentPane().removeAll();
		registerButton = new JButton("Register New Patient");
		viewButton = new JButton("View Patients");
		frame.setTitle("Main Menu"); 
		frame.setSize(910,700); 
		JPanel register = new JPanel(); 
		register.setSize(455, 700);
		frame.add(register, BorderLayout.LINE_START); 
		
		
		registerButton.setPreferredSize(new Dimension(455, 665));
		registerButton.setOpaque(true);
		registerButton.setBackground(new Color(41, 142, 208));
		registerButton.setForeground(Color.white);
		registerButton.setBorderPainted(false);
		registerButton.setFont(new Font("Arial", Font.BOLD, 40));
		register.add(registerButton); 
		
	
		
		
		JPanel view = new JPanel(); 
		view.setOpaque(true);

		view.setSize(455, 700);
		frame.add(view, BorderLayout.CENTER);
		
		
		viewButton.setPreferredSize(new Dimension(455, 665));
		viewButton.setOpaque(true);
		viewButton.setBackground(new Color(41, 142, 208));
		viewButton.setForeground(Color.white);
		viewButton.setBorderPainted(false);
		viewButton.setFont(new Font("Arial", Font.BOLD, 40));
		view.add(viewButton); 
		
		
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.repaint();
		frame.revalidate();
	}
	
	public MenuPage(JFrame frame, boolean isUndo)
	{
		this.isUndo = isUndo; 
		this.frame = frame;
		frame.getContentPane().removeAll();
		registerButton = new JButton("Register New Patient");
		viewButton = new JButton("View Patients");
		frame.setTitle("Main Menu"); 
		frame.setSize(910,700); 
		JPanel register = new JPanel(); 
		register.setSize(455, 700);
		frame.add(register, BorderLayout.LINE_START); 
		
		
		registerButton.setPreferredSize(new Dimension(455, 665));
		registerButton.setOpaque(true);
		registerButton.setBackground(new Color(41, 142, 208));
		registerButton.setForeground(Color.white);
		registerButton.setBorderPainted(false);
		registerButton.setFont(new Font("Arial", Font.BOLD, 40));
		register.add(registerButton); 
		
		
		if (isUndo == true)
		{
			undoButton = new JButton("Undo Last Added Patient"); 
			undoButton.setPreferredSize(new Dimension(100,50)); 
			frame.add(undoButton,BorderLayout.SOUTH); 
		}
		
		
		
		JPanel view = new JPanel(); 
		view.setOpaque(true);

		view.setSize(455, 700);
		frame.add(view, BorderLayout.CENTER);
		
		
		viewButton.setPreferredSize(new Dimension(455, 665));
		viewButton.setOpaque(true);
		viewButton.setBackground(new Color(41, 142, 208));
		viewButton.setForeground(Color.white);
		viewButton.setBorderPainted(false);
		viewButton.setFont(new Font("Arial", Font.BOLD, 40));
		view.add(viewButton); 
		
		
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.repaint();
		frame.revalidate();
	}
	
	public void addRegisterListener(ActionListener listenRegister)
	{
		registerButton.addActionListener(listenRegister);
	}
	public void addViewListener(ActionListener listenView)
	{
		viewButton.addActionListener(listenView);
	
	}
	public void addUndoListener(ActionListener undoView)
	{
		undoButton.addActionListener(undoView);
	}
	public void hideUndo()
	{
		undoButton.setVisible(false);
	}
	public boolean isUndo()
	{
		return isUndo; 
	}

}