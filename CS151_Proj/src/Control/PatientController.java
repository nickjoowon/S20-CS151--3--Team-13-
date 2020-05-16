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
		gotoDatabaseListener d = new gotoDatabaseListener();
		menu.addRegisterListener(r); 
		menu.addViewListener(d);
		System.out.println("hi");
	
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
			gotoDatabaseListener d = new gotoDatabaseListener();
			menu.addRegisterListener(r);
			menu.addViewListener(d);
			
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
			gotoInputMedListener n = new gotoInputMedListener(); 
			tinHyp.addBackListener(b);
			tinHyp.addNextListener(n);
			
			
			
		}
		
	}
	static class gotoInputMedListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			InputMedPage inputMedPage = new InputMedPage(frame);
			gotoTinHypStatusListener b = new gotoTinHypStatusListener();
			gotoInputMedListener m = new gotoInputMedListener();
			inputMedPage.addBackListener(b);
			inputMedPage.addNextListener(m);
		}
		
	}
	static class gotoDatabaseListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("hi");
			PatientDataPage database = new PatientDataPage(frame);
			gotoMenuListener m = new gotoMenuListener();
			gotoReqInputListener n = new gotoReqInputListener();
			database.addBackListener(m);
			database.addNextListener(n);
		}
		
	}
		
}
  


