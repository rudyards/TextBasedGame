package textGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;

public class CreditsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditsFrame frame = new CreditsFrame();
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
	public CreditsFrame() {
		setTitle("Helen's Quest Credits");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblCredits = new JLabel("Credits:");
		lblCredits.setHorizontalAlignment(SwingConstants.CENTER);
		lblCredits.setForeground(Color.WHITE);
		contentPane.add(lblCredits, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textArea.setBackground(UIManager.getColor("Panel.background"));
		textArea.setForeground(Color.BLACK);
		textArea.setLineWrap(true);
		textArea.setText("Created By: Rudy Summers\nProgrammed By: Rudy Summers\nWritten By: Rudy Summers\nCharacters From: Virgil and Homer\nMoral Support: Lucas Kaplan");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
