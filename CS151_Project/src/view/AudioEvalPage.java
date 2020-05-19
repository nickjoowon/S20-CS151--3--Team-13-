package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

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
		frame.setSize(910,700); 

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
		JLabel loudDiscLevel = new JLabel("Loudness Discomfort Level");
		loudDiscLevel.setFont(new Font("Arial", Font.PLAIN, 16));
		upperCenterLeft.add(loudDiscLevel);
		
		JPanel r1UpperCenterLeft = new JPanel();
		r1UpperCenterLeft.setLayout(new GridLayout(1,4));
		JLabel left = new JLabel("Left");
		lDiscomfortText = new JTextField();
		JLabel right = new JLabel("Right");
		rDiscomfortText = new JTextField();
		r1UpperCenterLeft.add(left);
		r1UpperCenterLeft.add(lDiscomfortText);
		r1UpperCenterLeft.add(right);
		r1UpperCenterLeft.add(rDiscomfortText);
		upperCenterLeft.add(r1UpperCenterLeft);
		
		//row 2 of upperCenterLeft panel
		JLabel tinnitus = new JLabel("Tinnitus");
		loudDiscLevel.setFont(new Font("Arial", Font.PLAIN, 16));
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
		JLabel hearingThreshold = new JLabel("Hearing Threshold");
		hearingThreshold.setFont(new Font("Arial", Font.PLAIN, 16));
		upperCenterLeft.add(hearingThreshold);
		
		
		
		
		
		
		
		
		
		
		
		
		//temprorary
 		frame.setVisible(true);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.repaint();
		frame.revalidate();
		
	}
	
	
	
	//for testing purposes
 	public static void main(String[] args) {
 		String s = "amazing nick";
 		VisitInfoPage n = new VisitInfoPage(new JFrame(), s);
 	}
	
	
	
	
}
