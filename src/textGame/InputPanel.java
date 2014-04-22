package textGame;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class InputPanel extends JPanel {
	private String currentAction;
	private JTextArea Reaction;
	private JButton choice1;
	private JButton choice2;
	private JButton choice3;
	private JButton choice4;
	private int currentChoice;
	private String name;
	private String general;

	/**
	 * Create the panel.
	 */
	public InputPanel() {

		setLayout(null);

		Reaction = new JTextArea();
		Reaction.setEditable(false);
		Reaction.setLineWrap(true);
		Reaction.setBounds(18, 26, 415, 155);
		add(Reaction);

		// Button text is instantiated for their initial choice
		choice1 = new JButton("Choice One");
		choice1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					name = "Dikaiopolis";
					currentChoice++;
					generals();
				}else if(currentChoice == 1){
					general = "Achilles";
					currentChoice++;
					talents();
				}else{
					start();
				}
			}
		});
		choice1.setBounds(6, 193, 117, 29);
		add(choice1);

		choice2 = new JButton("Choice Two");
		choice2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					name = "Huphantes";
					currentChoice++;
					generals();
				}else if(currentChoice == 1){
					general = "Agammenmon";
					currentChoice++;
					talents();
				}else{
					start();
				}
			}
		});

		choice2.setBounds(6, 265, 117, 29);
		add(choice2);

		choice3 = new JButton("Choice Three");
		choice3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					name = "Axaitios";
					currentChoice++;
					generals();
				}else if(currentChoice == 1){
					general = "Odysseus";
					currentChoice++;
					talents();
				}else{
					start();
				}
			}
		});

		choice3.setBounds(327, 193, 117, 29);
		add(choice3);

		choice4 = new JButton("Choice Four");
		choice4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					name = "Eruthros";
					currentChoice++;
					generals();
				}else if(currentChoice == 1){
					general = "Diomedes";
					currentChoice++;
					talents();
				}else{
					start();
				}
			}
		});

		choice4.setBounds(327, 265, 117, 29);
		add(choice4);

		preGame();
	}
	public void preGame(){
		Reaction.setText("Please hit any choice to start.");
		
		currentChoice = -1;
	}
	
	public void start() {
		choice1.setText("Dikaiopolis");
		choice2.setText("Huphantes");
		choice3.setText("Axaitios");
		choice4.setText("Eruthros");
		
		
		Reaction.setText("What is your name?");
		currentChoice = 0;
	}

	public void generals() {
		choice1.setText("Achilles");
		choice2.setText("Agammemnon");
		choice3.setText("Odysseyus");
		choice4.setText("Diomedes");

		Reaction.setText("Ah, "
				+ name
				+ ". An excellent name. \n You came to Troy in service of one of the following generals.");
	}
	public void talents(){
		choice1.setText("Agility");
		choice2.setText("Luck");
		choice3.setText("Stregnth");
		choice4.setText("Intellegence");
		
		Reaction.setText("You came to Troy in service of "+general+".");
		

	}
}
