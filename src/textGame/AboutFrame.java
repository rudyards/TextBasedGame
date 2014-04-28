package textGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Color;

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
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea txtrLolLikeId = new JTextArea();
		txtrLolLikeId.setLineWrap(true);
		txtrLolLikeId.setBackground(UIManager.getColor("Panel.background"));
		txtrLolLikeId.setText("\n\"I sing of an unsung hero, who fought his way through the Trojan\nwar. I sing of a great hero: You.\"\n\nHelen's Quest is an adventure game that takes place during the\nTrojan War. The player is given various situations and must pick one of up to four possible choices on how to approach the situation at\nhand. There are several homages to famous ancient myths.");
		contentPane.add(txtrLolLikeId, BorderLayout.CENTER);
	}

}
