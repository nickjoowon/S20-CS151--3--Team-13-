package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * page 12
 * @author Nick
 */
public class AudioEvalPage {

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
	private JTextField pureToneAudioText;

	public AudioEvalPage(JFrame frame, String lastName){
		this.frame = frame; 
		frame.getContentPane().removeAll(); 
		frame.setTitle("Visit Information Page"); 
		//temporary
//		frame.setSize(910,700); 

		//panel for the top blue part 
		JPanel top = new JPanel(); 
		top.setPreferredSize(new Dimension(440, 100));
		top.setOpaque(true);
		top.setForeground(Color.white);
		top.setBackground(new Color(41,142,208));
		top.setLayout(new BorderLayout());


		JLabel titleOfTop = new JLabel("New Visit Information for Patient " + lastName); 
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
		JLabel match = new JLabel("match");
		tinMatchText = new JTextField();
		JLabel matchType = new JLabel("Match Type");
		tinMatchTypeText = new JTextField();
		
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
		lowerCenterLeft.add(addCommentText, BorderLayout.CENTER);

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
		pureToneAudioText = new JTextField();
		centerRight.add(pureToneAudio, BorderLayout.NORTH);
		centerRight.add(pureToneAudioText, BorderLayout.CENTER);
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


		next = new JButton("Next");
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
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.repaint();
		frame.revalidate();

	}



	//for testing purposes
//	public static void main(String[] args) {
//		String s = "amazing nick";
//		AudioEvalPage n = new AudioEvalPage(new JFrame(), s);
//	}




}
