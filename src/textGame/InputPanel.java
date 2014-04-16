package textGame;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class InputPanel extends JPanel {
	private JTextField InputField;
	private String currentAction;
	private JTextArea Reaction;

	/**
	 * Create the panel.
	 */
	public InputPanel() {
		currentAction = "";
		
		setLayout(null);
		
		InputField = new JTextField();
		InputField.setBounds(16, 32, 354, 28);
		add(InputField);
		InputField.setColumns(10);
		
		Reaction = new JTextArea();
		Reaction.setEditable(false);
		Reaction.setLineWrap(true);
		Reaction.setBounds(23, 82, 347, 155);
		add(Reaction);

		JButton ActButton = new JButton("Act!");
		ActButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentAction = InputField.getText();
				InputField.setText("");
				Reaction.setText(currentAction);
			}
		});
		ActButton.setBounds(376, 33, 68, 29);
		add(ActButton);
		

	}
}
