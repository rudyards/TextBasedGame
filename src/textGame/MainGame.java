package textGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class MainGame extends JFrame {

	private JPanel contentPane;
	private InputPanel inputPanel;
	private TitlePanel titlePanel;
	private JLabel label;
	private ImageIcon helmet;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGame frame = new MainGame();
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
	public MainGame() {
		helmet = new ImageIcon("helmet.jpg");
		
		
		setTitle("Helen's Quest");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(0, 0, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));

		inputPanel = new InputPanel();
		inputPanel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(inputPanel, BorderLayout.CENTER);

		titlePanel = new TitlePanel();
		titlePanel.setBackground(Color.GRAY);
		getContentPane().add(titlePanel, BorderLayout.NORTH);
		
		label = new JLabel(helmet);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.LEFT);

		contentPane.add(label, BorderLayout.WEST);
		label.setSize(10, 10);
	}
}
