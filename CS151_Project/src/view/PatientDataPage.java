public void addPopup()
	{
		//adds popup frame
		 JFrame popframe = new JFrame("Schedule a Visit");
		 popframe.setLayout(new BorderLayout());
		 
		 JLayeredPane popup = new JLayeredPane();
		 popframe.getContentPane().add(popup);
		 
		 //makes button to update information
		 JButton enter = new JButton("Enter");
		 enter.setFont(new Font("Arial", Font.PLAIN, 45));
		 
		 //text fields user has to enter to schedule an appointment
		 JPanel fields = new JPanel();
		 fields.setLayout(new GridLayout(3,2));
		 
		 JLabel date = new JLabel(" Date: ");
		 date.setFont(new Font("Arial", Font.PLAIN, 20));
		 fields.add(date);
		 JTextField dateText = new JTextField();
		 fields.add(dateText);
		 
		 JLabel start = new JLabel(" Start Time: ");
		 start.setFont(new Font("Arial", Font.PLAIN, 20));
		 fields.add(start);
		 JTextField startText = new JTextField();
		 fields.add(startText);
		 
		 JLabel end = new JLabel(" End Time: ");
		 end.setFont(new Font("Arial", Font.PLAIN, 20));
		 fields.add(end);
		 JTextField endText = new JTextField();
		 fields.add(endText);
		 
		 
		 //add components to frame
		 popframe.add(fields);
		 popframe.add(enter, BorderLayout.SOUTH);
		 
		 popframe.setSize (600,400);
		 popframe.setVisible(true); 
	}
