package Control;

public class PatientController {
  
  static JFrame frame = new JFrame();
	public static void main(String[] args)
	{
		
		PatientView view = new PatientView(frame); 
		RegisterListener r = new RegisterListener(); 
		view.addRegisterListener(r); 
	
	}
	
	static class RegisterListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Patient2 page2 = new Patient2(frame); 
			NextListener n = new NextListener();
			page2.addNextListener(n);
		}
	}
	static class NextListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			PatientView view = new PatientView(frame); 
			
			RegisterListener r = new RegisterListener(); 
			view.addRegisterListener(r); 
			
		}
		
	}
		
	}
  

}
