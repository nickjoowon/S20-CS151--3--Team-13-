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
	
	static class RegisterListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ReqInfoPage page2 = new ReqInfoPage(frame); 
			NextListener n = new NextListener();
			page2.addNextListener(n);
		}
	}
	static class NextListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			MenuPage view = new MenuPage(frame); 
			
			RegisterListener r = new RegisterListener(); 
			view.addRegisterListener(r); 
			
		}
		
	}
		
}
  


