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
	//should check if the previous page's text is filled out
	static class gotoReqInputListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ReqInfoPage reqInfo = new ReqInfoPage(frame); 
			gotoMenuListener b = new gotoMenuListener();
			gotoOptInfoListener n = new gotoOptInfoListener(reqInfo); //maybe take previous page a parameter for action listeners to see if fields put in 
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
		ReqInfoPage reqInfo; 
		boolean isCheckReqInfo; 
		public gotoOptInfoListener(ReqInfoPage reqInfo)
		{
			this.reqInfo = reqInfo; 
			isCheckReqInfo = true; 
		}
		public gotoOptInfoListener()
		{
			isCheckReqInfo = false; 
		}
		public void actionPerformed(ActionEvent e)
		{
			if (isCheckReqInfo)
			{
				String[] info = reqInfo.getRequiredInfo();
				for (String a: info)
				{
					if (a.isEmpty())
					{
						return; 
						//error message 
					}
				}
			}
			
				
			OptInfoPage optInfo = new OptInfoPage(frame);
			gotoReqInputListener b = new gotoReqInputListener(); 
			GotoTinHypStatusListener n = new GotoTinHypStatusListener(); 
			optInfo.addBackListener(b);
			
			optInfo.addNextListener(n);
			
			
		}
		
	}
	static class GotoTinHypStatusListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			TinHypInputPage tinHyp = new TinHypInputPage(frame);
			gotoOptInfoListener b = new gotoOptInfoListener(); 
			InputMedListener n = new InputMedListener(); 
			tinHyp.addBackListener(b);
			tinHyp.addNextListener(n);
			
			
			
		}
		
	}
	static class InputMedListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			InputMedPage inputMedPage = new InputMedPage(frame);
			GotoTinHypStatusListener b = new GotoTinHypStatusListener();
			InputMedListener m = new InputMedListener();
			inputMedPage.addBackListener(b);
			inputMedPage.addNextListener(m);
		}
		
	}
	
		
}
  


