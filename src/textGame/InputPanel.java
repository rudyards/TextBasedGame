package textGame;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class InputPanel extends JPanel {
	private String currentAction;
	private JTextArea Reaction;

	/**
	 * Create the panel.
	 */
	public InputPanel() {
		currentAction = "";
		
		setLayout(null);
		
		Reaction = new JTextArea();
		Reaction.setEditable(false);
		Reaction.setLineWrap(true);
		Reaction.setBounds(18, 26, 415, 155);
		add(Reaction);
		
		JButton choice1 = new JButton("Choice One");
		choice1.setBounds(42, 212, 117, 29);
		add(choice1);
		
		JButton choice2 = new JButton("Choice Two");
		choice2.setBounds(42, 253, 117, 29);
		add(choice2);
		
		JButton choice3 = new JButton("Choice Three");
		choice3.setBounds(258, 212, 117, 29);
		add(choice3);
		
		JButton choice4 = new JButton("Choice Four");
		choice4.setBounds(258, 253, 117, 29);
		add(choice4);
		

	}
}
