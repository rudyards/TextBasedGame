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
	private String talent;

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

		// Current Choice index:
		/*
		 * Choice 0 = name Choice 1 = general Choice 2 = Talent Choice 3 =
		 * Reaction to Trojan Attack Choice 4 = Counter Attack
		 * 
		 * 
		 * 
		 * Other = Restart, there's a bug
		 */
		choice1 = new JButton("Choice One");
		choice1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentChoice == 0) {
					name = "Dikaiopolis";
					currentChoice++;
					generals();
				} else if (currentChoice == 1) {
					general = "Achilles";
					currentChoice++;
					talents();
				} else if (currentChoice == 2) {
					talent = "Agility";
					currentChoice++;
					level1();
				} else if (currentChoice == 3) {
					// output result of choice, then give counterattack
					// opportunity

					counterAttack();

				} else if (currentChoice == 4) {
					// output result of choice, then return to camp (if survive)

					exploreC();
				} else {
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
				} else if (currentChoice == 1) {
					general = "Agammenmon";
					currentChoice++;
					talents();
				} else if (currentChoice == 2) {
					talent = "Luck";
					currentChoice++;
					level1();
				} else if (currentChoice == 3) {
					// output result of choice, then give counterattack
					// opportunity

					counterAttack();
				} else if (currentChoice == 4) {
					// output result of choice, then return to camp (if survive)

					exploreC();
				} else {
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
				} else if (currentChoice == 1) {
					general = "Odysseus";
					currentChoice++;
					talents();
				} else if (currentChoice == 2) {
					talent = "Might";
					currentChoice++;
					level1();
				} else if (currentChoice == 3) {
					// output result of choice, then give counterattack
					// opportunity

					counterAttack();

				} else if (currentChoice == 4) {
					// output result of choice, then return to camp (if survive)

					exploreC();
				} else {
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
				} else if (currentChoice == 1) {
					general = "Diomedes";
					currentChoice++;
					talents();
				} else if (currentChoice == 2) {
					talent = "Wits";
					currentChoice++;
					level1();
				} else if (currentChoice == 3) {
					// output result of choice, then give counterattack
					// opportunity

					counterAttack();

				} else if (currentChoice == 4) {
					// output result of choice, then return to camp (if survive)

					exploreC();
				} else {
					start();
				}
			}
		});

		choice4.setBounds(327, 265, 117, 29);
		add(choice4);

		preGame();
	}

	public void preGame() {
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

	public void talents() {
		choice1.setText("Agility");
		choice2.setText("Luck");
		choice3.setText("Might");
		choice4.setText("Wits");

		Reaction.setText("You came to Troy in service of " + general + ".");
		if (general.equals("Achilles")) {
			Reaction.append("\n The great Achilles is known for his invincibility in combat. You are in good hands.");
		} else if (general.equals("Agammemnon")) {
			Reaction.append("Ah, the great king Agamemnon, the general of all the Greeks");
		} else if (general.equals("Diomedes")) {
			Reaction.append("The legendary warrior king, known for felling two gods over the course of the war.");
		} else if (general.equals("Odysseyus")) {
			Reaction.append("Perhaps the most clever of all the greek generals, the Ithican Odysseyus.");
		}

		Reaction.append("\nWhat are you known for?");
	}

	public void level1() {
		if (talent.equals("Luck")) {
			Reaction.setText("You're not personally blessed by Tyche, but you\n roll knucklebones among the best of them.");
		} else if (talent.equals("Agility")) {
			Reaction.setText("Atalanta could outrun you any day of the week, but you\n move quick for someone of your size.");
		} else if (talent.equals("Might")) {
			Reaction.setText("You're no Ajax, but you can hold your own in a fight.");
		} else if (talent.equals("Wits")) {
			Reaction.setText("Its a strech to compare yourself to Daedalus, but\n you're certainly an\n intellegent individual.");
		}

		if (general.equals("Diomedes") || general.equals("Odysseus")) {
			Reaction.append("\n You have the day off, and choose to explore the camp during\n your freetime.");
			exploreC();
		} else if (general.equals("Agammemnon") || general.equals("Achilles")) {
			Reaction.append("\n It is time for you to join the battlefield, and\n take arms agains the Trojains.");
			firstCombat();
		}
	}

	public void exploreC() {

	}

	public void firstCombat() {

		// Combat description and trojan attack, 4 defensive options
	}

	public void counterAttack() {
		// 4 offensive options
	}
}
