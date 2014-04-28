package textGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SplashScreen extends JFrame {

	private JPanel contentPane;
	private JTextField Title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen frame = new SplashScreen();
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
	public SplashScreen() {
		setTitle("Helen's Quest Splash");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1));
		
		Title = new JTextField();
		Title.setForeground(Color.WHITE);
		Title.setBackground(Color.BLACK);
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setText("Helen's Quest");
		contentPane.add(Title);
		Title.setColumns(10);
		
		JButton Play = new JButton("Play");
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainGame gameframe = new MainGame();
				gameframe.setVisible(true);
			}
		});
		contentPane.add(Play);

		
		JButton About = new JButton("About/Help");
		About.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AboutFrame help = new AboutFrame();
				help.setVisible(true);
			}
		});
		
		JButton Credits = new JButton("Credits");
		Credits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreditsFrame credits = new CreditsFrame();
				credits.setVisible(true);
			}
		});
		contentPane.add(Credits);
		contentPane.add(About);
	}

}
