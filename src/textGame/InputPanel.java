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
	private JButton choice1;
	private JButton choice2;
	private JButton choice3;
	private JButton choice4;
	private int currentChoice;

	/**
	 * Create the panel.
	 */
	public InputPanel() {

		setLayout(null);

		Reaction = new JTextArea();
		Reaction.setEditable(false);
		Reaction.setLineWrap(true);
		Reaction.setBounds(18, 26, 415, 155);
		add(Reaction);

		currentChoice = 0;
		// Button text is instantiated for their initial choice
		final JButton choice1 = new JButton("Dikaiopolis");
		choice1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					Reaction.setText("Your name is now Dikaiopolis");
					currentChoice++;
				}
			}
		});
		choice1.setBounds(6, 193, 117, 29);
		add(choice1);

		final JButton choice2 = new JButton("Huphantes");
		choice2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					Reaction.setText("Your name is now Huphantes");
					currentChoice++;
				}
			}
		});

		choice2.setBounds(6, 265, 117, 29);
		add(choice2);

		final JButton choice3 = new JButton("Axaitios");
		choice3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					Reaction.setText("Your name is now Axaitios");
					currentChoice++;
				}
			}
		});

		choice3.setBounds(327, 193, 117, 29);
		add(choice3);

		final JButton choice4 = new JButton("Eruthros");
		choice4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					Reaction.setText("Your name is now Eruthros");
					currentChoice++;
				}
			}
		});

		choice4.setBounds(327, 265, 117, 29);
		add(choice4);

		start();
	}

	public void start() {
		Reaction.setText("What is your name?");

	}
}
