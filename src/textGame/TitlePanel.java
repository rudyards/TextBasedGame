package textGame;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class TitlePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TitlePanel() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel mainTitle = new JLabel("Text Game Thing");
		mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		add(mainTitle);

	}

}
