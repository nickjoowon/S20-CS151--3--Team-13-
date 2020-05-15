package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.MenuPage;
import View.ReqInfoPage;

public class PatientController {
  
  static JFrame frame = new JFrame();
	public static void main(String[] args)
	{
		
		MenuPage view = new MenuPage(frame); 
		RegisterListener r = new RegisterListener(); 
		view.addRegisterListener(r); 
	
	}
	//add what the model should do with the information for each actionlistener
	static class RegisterListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ReqInfoPage page2 = new ReqInfoPage(frame); 
			BackListener b = new BackListener();
			page2.addBackListener(b);
		}
	}
	static class BackListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			MenuPage view = new MenuPage(frame); 
			
			RegisterListener r = new RegisterListener(); 
			view.addRegisterListener(r); 
			
		}
		
	}
		
}
  


