package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


import View.*;


public class PatientController {
  
  static JFrame frame = new JFrame();
	public static void main(String[] args)
	{
		
		MenuPage menu = new MenuPage(frame); 
		gotoReqInputListener r = new gotoReqInputListener(); 
		menu.addRegisterListener(r); 
	
	}
	//add what the model should do with the information for each actionlistener
	//call the approrpiate actionlisteners for each page it goes to 
	static class gotoReqInputListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ReqInfoPage reqInfo = new ReqInfoPage(frame); 
			gotoMenuListener b = new gotoMenuListener();
			gotoOptInfoListener n = new gotoOptInfoListener(); 
			reqInfo.addBackListener(b);
			reqInfo.addNextListener(n);
		}
	}
	static class gotoMenuListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			MenuPage menu = new MenuPage(frame); 
			
			gotoReqInputListener r = new gotoReqInputListener(); 
			menu.addRegisterListener(r); 
			
		}
		
	}
	static class gotoOptInfoListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			OptInfoPage optInfo = new OptInfoPage(frame);
			gotoReqInputListener b = new gotoReqInputListener(); 
			gotoTinHypStatusListener n = new gotoTinHypStatusListener(); 
			optInfo.addBackListener(b);
			
			optInfo.addNextListener(n);
			
			
		}
		
	}
	static class gotoTinHypStatusListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			TinHypInputPage tinHyp = new TinHypInputPage(frame);
			gotoOptInfoListener b = new gotoOptInfoListener(); 
			tinHyp.addBackListener(b);
			
			
			
		}
		
	}
	
		
}
  


