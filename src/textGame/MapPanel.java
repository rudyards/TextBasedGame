package textGame;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;


public class MapPanel extends JPanel {
	JButton[] locations = new JButton[16];

	/**
	 * Create the panel.
	 */
	public MapPanel() {
		setLayout(new GridLayout(4, 4, 0, 0));
		for (int i = 0; i < locations.length; i++) {
			locations[i] = new JButton("?");
			this.add(locations[i]);
		}


	}

}
