package textGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class AboutFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutFrame frame = new AboutFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutFrame() {
		setTitle("Helen's Quest About");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea txtrLolLikeId = new JTextArea();
		txtrLolLikeId.setLineWrap(true);
		txtrLolLikeId.setBackground(UIManager.getColor("Panel.background"));
		txtrLolLikeId.setText("\n\nHelen's Quest is a chose your own adventure style game, about the \nTrojan war. You play as a soldier in the war, under a general of your \nchoice.");
		contentPane.add(txtrLolLikeId, BorderLayout.CENTER);
	}

}
