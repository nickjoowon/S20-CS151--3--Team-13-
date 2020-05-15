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
		
		MenuPage menu = new MenuPage(frame); 
		RegisterMenuListener r = new RegisterMenuListener(); 
		menu.addRegisterListener(r); 
	
	}
	//add what the model should do with the information for each actionlistener
	static class RegisterMenuListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ReqInfoPage reqInfo = new ReqInfoPage(frame); 
			BackReqListener b = new BackReqListener();
			reqInfo.addBackListener(b);
		}
	}
	static class BackReqListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			MenuPage menu = new MenuPage(frame); 
			
			RegisterMenuListener r = new RegisterMenuListener(); 
			menu.addRegisterListener(r); 
			
		}
		
	}
	static class NextReqListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			
			
			
		}
		
	}
		
}
  


