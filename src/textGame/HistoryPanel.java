package textGame;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class HistoryPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HistoryPanel() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel historyLabel = new JLabel("Action History");
		historyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(historyLabel);
		
		JButton oldest = new JButton("");
		add(oldest);
		
		JButton almostOldest = new JButton("");
		add(almostOldest);
		
		JButton barelyOld = new JButton("");
		add(barelyOld);
		
		JButton barelyNew = new JButton("");
		add(barelyNew);
		
		JButton almostNewest = new JButton("");
		add(almostNewest);
		
		JButton newest = new JButton("");
		add(newest);
		
		JSeparator separator = new JSeparator();
		add(separator);

	}

}
