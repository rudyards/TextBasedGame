package textGame;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class JournalPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public JournalPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JTextArea PlayerJournal = new JTextArea();
		PlayerJournal.setText("The Journal of Helen of Troy");
		PlayerJournal.setLineWrap(true);
		PlayerJournal.setBounds(24, 64, 394, 206);
		add(PlayerJournal);
		
		JLabel journalTitle = new JLabel("Journal");
		journalTitle.setBounds(67, 28, 122, 24);
		add(journalTitle);

	}
}
