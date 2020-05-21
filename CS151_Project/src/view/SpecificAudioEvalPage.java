package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * page 16
 * 
 * Looks at a specific Visit's audio Evaluation.
 * Can edit information on this page
 * 
 */
public class SpecificAudioEvalPage {

	JFrame frame; 
	JButton next;
	JButton back;
	private JTextField lDiscomfortText;
	private JTextField rDiscomfortText;
	private JTextField tinPitchText;
	private JTextField tinMatchText;
	private JTextField tinMatchTypeText;
	private JTextField hearThresholdText;
	private JTextField lMinMaskLevelText;
	private JTextField rMinMaskLevelText;
	private JTextField addCommentText;
	private JTextField categoryText; 
	private int startX;
	private int startY;
	private int endX;
	private int endY;


	/**
	 * Reuses frame from last Page and redraws on it
	 * takes in various input to display information
	 * Creates UI and sizes things appropriately
	 * 
	 * @param frame
	 * @param lastName
	 * @param inputLDiscom
	 * @param inputRDiscom
	 * @param inputTinPitch
	 * @param inputTinMatch
	 * @param inputTinMatchType
	 * @param inputHearThresh
	 * @param inputLMinMask
	 * @param inputRMinMask
	 * @param inputAddComment
	 * @param inputStartX
	 * @param inputStartY
	 * @param inputEndX
	 * @param inputEndY
	 */
	public SpecificAudioEvalPage(JFrame frame, String lastName, String inputLDiscom, String inputRDiscom, String inputTinPitch, String inputTinMatch, String inputTinMatchType,
								 String inputHearThresh, String inputLMinMask, String inputRMinMask, String inputAddComment, String inputStartX, 
								 String inputStartY, String inputEndX, String inputEndY, String assignCat)
	{
		this.frame = frame; 
		frame.getContentPane().removeAll(); 
		frame.setTitle("Audiological Information"); 
		//temporary
		frame.setSize(910,700); 

		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());


		JLabel titleOfTop = new JLabel("Results of Audiological Evaluation for Patient " + lastName); 
		titleOfTop.setFont(new Font("Arial", Font.BOLD, 40));
		titleOfTop.setForeground(Color.white);
		top.add(titleOfTop, BorderLayout.WEST); 

		JPanel topDecoration = new JPanel();
		topDecoration.setPreferredSize(new Dimension(440, 15));
		top.add(topDecoration, BorderLayout.NORTH);

		//left side of the panel
		JPanel centerLeft = new JPanel(); 
		centerLeft.setLayout(new BorderLayout());

		//from loudness discomfort to minimum masking
		JPanel upperCenterLeft = new JPanel();
		upperCenterLeft.setLayout(new GridLayout(4,2));

		//row 1 of upperCenterLeft panel
		JLabel loudDiscLevel = new JLabel(" Loudness Discomfort Level");
		loudDiscLevel.setFont(new Font("Arial", Font.PLAIN, 14));
		upperCenterLeft.add(loudDiscLevel);

		JPanel r1UpperCenterLeft = new JPanel();
		r1UpperCenterLeft.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel left = new JLabel("Left");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		r1UpperCenterLeft.add(left, gbc);
		
		lDiscomfortText = new JTextField();
		//setting this JTextField according to input
		lDiscomfortText.setText(inputLDiscom);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 0;
		r1UpperCenterLeft.add(lDiscomfortText, gbc);
		
		JLabel right = new JLabel(" Right");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 0;
		r1UpperCenterLeft.add(right, gbc);
		
		rDiscomfortText = new JTextField();
		//setting JTextField according to input
		rDiscomfortText.setText(inputRDiscom);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 0;
		r1UpperCenterLeft.add(rDiscomfortText, gbc);
		
		upperCenterLeft.add(r1UpperCenterLeft);

		
		//row 2 of upperCenterLeft panel
		JLabel tinnitus = new JLabel(" Tinnitus");
		tinnitus.setFont(new Font("Arial", Font.PLAIN, 14));
		upperCenterLeft.add(tinnitus);

		JPanel r2UpperCenterLeft = new JPanel();
		r2UpperCenterLeft.setLayout(new GridLayout(3,2));
		
		JLabel pitch = new JLabel("Pitch");
		tinPitchText = new JTextField();
		//setting JTextField according to input
		tinPitchText.setText(inputTinPitch);
		JLabel match = new JLabel("match");
		tinMatchText = new JTextField();
		//setting JTextField according to input
		tinMatchText.setText(inputTinMatch);
		JLabel matchType = new JLabel("Match Type");
		tinMatchTypeText = new JTextField();
		//setting JTextField according to input
		tinMatchTypeText.setText(inputTinMatchType);
		
		r2UpperCenterLeft.add(pitch);
		r2UpperCenterLeft.add(tinPitchText);
		r2UpperCenterLeft.add(match);
		r2UpperCenterLeft.add(tinMatchText);
		r2UpperCenterLeft.add(matchType);
		r2UpperCenterLeft.add(tinMatchTypeText);
		
		upperCenterLeft.add(r2UpperCenterLeft);

		//row 3 of upperCenterLeft panel
		JLabel hearingThreshold = new JLabel(" Hearing Threshold");
		hearingThreshold.setFont(new Font("Arial", Font.PLAIN, 14));
		upperCenterLeft.add(hearingThreshold);
		
		JPanel r3UpperCenterLeft = new JPanel();
		r3UpperCenterLeft.setLayout(new GridBagLayout());
		hearThresholdText = new JTextField();
		//setting JTextField according to input
		hearThresholdText.setText(inputHearThresh);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		r3UpperCenterLeft.add(hearThresholdText, gbc);
		
		upperCenterLeft.add(r3UpperCenterLeft);

		//row 4 of upperCenterLeft panel
		JLabel minMaskingLevel = new JLabel(" Minimum Masking Level");
		minMaskingLevel.setFont(new Font("Arial", Font.PLAIN, 14));
		upperCenterLeft.add(minMaskingLevel);

		JPanel r4UpperCenterLeft = new JPanel();
		r4UpperCenterLeft.setLayout(new GridBagLayout());
		
		JLabel left4 = new JLabel("Left");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		r4UpperCenterLeft.add(left4, gbc);
		
		lMinMaskLevelText = new JTextField();
		//setting JTextField according to input
		lMinMaskLevelText.setText(inputLMinMask);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 0;
		r4UpperCenterLeft.add(lMinMaskLevelText, gbc);
		
		JLabel right4 = new JLabel(" Right");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 0;
		r4UpperCenterLeft.add(right4, gbc);
		
		rMinMaskLevelText = new JTextField();
		//setting JTextField according to input
		rMinMaskLevelText.setText(inputRMinMask);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 0;
		r4UpperCenterLeft.add(rMinMaskLevelText, gbc);
		
		
		upperCenterLeft.add(r4UpperCenterLeft);


		//lower center left section
		JPanel lowerCenterLeft = new JPanel();
		lowerCenterLeft.setLayout(new BorderLayout());

		JLabel addComment = new JLabel(" Addtional Comments");
		addComment.setFont(new Font("Arial", Font.PLAIN, 14));
		lowerCenterLeft.add(addComment, BorderLayout.NORTH);
		addCommentText = new JTextField();
		//setting JTextField according to input
		addCommentText.setText(inputAddComment);
		lowerCenterLeft.add(addCommentText, BorderLayout.CENTER);
		
		categoryText = new JTextField(assignCat); 
		JPanel lowerCenterLeftLower = new JPanel(new BorderLayout()); 
		lowerCenterLeftLower.add(categoryText, BorderLayout.CENTER);
		JLabel category = new JLabel("Category"); 
		lowerCenterLeftLower.add(category, BorderLayout.WEST);
		
		lowerCenterLeft.add(lowerCenterLeftLower,BorderLayout.SOUTH);

		//combining lower and upper center left
		centerLeft.add(upperCenterLeft, BorderLayout.CENTER);
		centerLeft.add(lowerCenterLeft, BorderLayout.SOUTH);
		upperCenterLeft.setPreferredSize(new Dimension(300, 200));
		lowerCenterLeft.setPreferredSize(new Dimension(300, 100));
		centerLeft.setPreferredSize(new Dimension(300, 300));

		
		//right side of the panel
		JPanel centerRight = new JPanel();
		centerRight.setLayout(new BorderLayout());
		
		JLabel pureToneAudio = new JLabel("Pure Tone Audiograph for Left & Right Ear");
		pureToneAudio.setFont(new Font("Arial", Font.PLAIN, 14));
		
		//drawing audioGraph line according to input
		startX = Integer.parseInt(inputStartX);
		startY = Integer.parseInt(inputStartY);
		endX = Integer.parseInt(inputEndX);
		endY = Integer.parseInt(inputEndY);
		JPanel pureToneAudioGraph = new JPanel() {
			Point pointStart = null;
			Point pointEnd = null;
			
			{
				addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						pointStart = e.getPoint();
					}

					public void mouseReleased(MouseEvent e) {
						pointEnd = null;
					}
				});
				addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseMoved(MouseEvent e) {
						pointEnd = e.getPoint();
					}

					public void mouseDragged(MouseEvent e) {
						pointEnd = e.getPoint();
						
						repaint();
					}
				});
			}
			public void paint(Graphics g) {
				super.paint(g);
				g.setColor(Color.black);
				g.drawLine(startX, startY, endX, endY);
				//updating to the new starting and ending points
				if(pointStart != null)
					updateXY(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
			}
			public void updateXY(int x1, int y1, int x2, int y2) {
				startX = x1;
				startY = y1;
				endX = x2;
				endY = y2;
			}
		};
		
		pureToneAudioGraph.setBackground(Color.white);
		centerRight.add(pureToneAudio, BorderLayout.NORTH);
		centerRight.add(pureToneAudioGraph, BorderLayout.CENTER);
		centerRight.setPreferredSize(new Dimension(500,500));





		//Panel to organize back and next buttons 
		JPanel backAndNext = new JPanel(); 
		backAndNext.setLayout(new BorderLayout());

		back = new JButton("Back"); 
		back.setPreferredSize(new Dimension(125,50));
		back.setOpaque(true);
		back.setForeground(Color.white);
		back.setBackground(new Color(41,142,208));
		back.setBorderPainted(false);
		backAndNext.add(back, BorderLayout.WEST);


		next = new JButton("Edit Information");
		next.setPreferredSize(new Dimension(125,50));
		next.setOpaque(true);
		next.setForeground(Color.white);
		next.setBackground(new Color(41,142,208));
		next.setBorderPainted(false);
		backAndNext.add(next, BorderLayout.EAST); 


		// For space between buttons and bottom 
		JPanel bottomDecorationWhite = new JPanel();

		backAndNext.add(bottomDecorationWhite, BorderLayout.SOUTH); 




		frame.add(top, BorderLayout.NORTH); 
		frame.add(centerRight, BorderLayout.EAST);
		frame.add(centerLeft, BorderLayout.CENTER);
		frame.add(backAndNext, BorderLayout.SOUTH);

		//temprorary
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.repaint();
		frame.revalidate();

	}


	/**
	 * actionlisteners will work for this next button
	 * @param a
	 */
	public void addNextListener(ActionListener a)
	{
		next.addActionListener(a);
	}
	
	/**
	 * actionlisteners will work for this back button
	 * @param a
	 */
	public void addBackListener(ActionListener a)
	{
		back.addActionListener(a);
	}
	
	
	 /**
	  * gives various text field values as a String array
	  * @return
	  */
	public String[] getInfo() 
	{
		String[] info =
			{
					lDiscomfortText.getText(),
					rDiscomfortText.getText(),
					tinPitchText.getText(),
					tinMatchText.getText(),
					tinMatchTypeText.getText(),
					hearThresholdText.getText(),
					lMinMaskLevelText.getText(),
					rMinMaskLevelText.getText(),
					addCommentText.getText(),
					Integer.toString(startX),
					Integer.toString(startY),
					Integer.toString(endX),
					Integer.toString(endY),
					categoryText.getText()
					
			};
		return info;
	}
	
	
	
	

	//for testing purposes
	public static void main(String[] args) {
		String s = "amazing nick";
		SpecificAudioEvalPage n = new SpecificAudioEvalPage(new JFrame(), s, "a", "b", "c", "d", "e", "f", "g", "h", "l", "100", "400", "400", "100","hi");
		for(String v : n.getInfo()) {
			System.out.println(v);
		}
	}




}
