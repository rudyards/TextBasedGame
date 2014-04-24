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
	private boolean injured;

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
		 * Choice 0 = name Choice 1 = general Choice 2 = talent Choice 3 =
		 * reaction to Trojan Attack Choice 4 = Counter Attack
		 * 
		 * 
		 * 
		 * Other = Restart, there's a bug
		 */
		choice1 = new JButton("Choice One");
		choice1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choice1.getText().equals("N/A")) {
					System.out.println("Not a valid choice. Try again.");
				} else {
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
						if (talent.equals("Combat")) {
							Reaction.setText("You block his sword, and turn it to the side with relative\nease.");
						} else if (talent.equals("Luck")) {
							Reaction.setText("Your swords clash, and his shatters. You met blades\nalong a crack in his weapon. Luck strikes again.");
						} else {
							Reaction.setText("His attack is stronger than your block, and you are forced back.\nHe follows up with a quick stab that slices open your side.\nPain rips through you.");
							injured = true;
						}
						counterAttack();

					} else if (currentChoice == 4) {
						// Feint

						exploreC();
					} else {
						start();
					}
				}
			}
		});
		choice1.setBounds(6, 193, 117, 29);
		add(choice1);

		choice2 = new JButton("Choice Two");
		choice2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choice2.getText().equals("N/A")) {
					System.out.println("Not a valid choice. Try again.");
				} else {
					if (currentChoice == 0) {
						name = "Huphantes";
						currentChoice++;
						generals();
					} else if (currentChoice == 1) {
						general = "Agammemnon";
						currentChoice++;
						talents();
					} else if (currentChoice == 2) {
						talent = "Luck";
						currentChoice++;
						level1();
					} else if (currentChoice == 3) {
						// output result of choice, then give counterattack
						// opportunity
						if (talent.equals("Agility")) {
							Reaction.setText("You nimbly step aside, and line yourself up to counter attack.");
						} else {
							Reaction.setText("You weren't quite quick enough, and his sword rips along your upper leg. Your eyes blur.");
							injured = true;
						}
						counterAttack();
					} else if (currentChoice == 4) {
						// Overpower

						exploreC();
					} else {
						start();
					}
				}
			}
		});

		choice2.setBounds(6, 265, 117, 29);
		add(choice2);

		choice3 = new JButton("Choice Three");
		choice3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choice3.getText().equals("N/A")) {
					System.out.println("Not a valid choice. Try again.");
				} else {
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
						if (talent.equals("Luck")) {
							Reaction.setText("He had you dead to rights, but a stray arrow from a skirmish downwind embeds itself in his arm. You got lucky.");
						} else {
							Reaction.setText("The sword slashes your shoulder, and you roar in pain.");
							injured = true;
						}
						counterAttack();

					} else if (currentChoice == 4) {
						// Nimble

						exploreC();
					} else {
						start();
					}
				}
			}
		});

		choice3.setBounds(327, 193, 117, 29);
		add(choice3);

		choice4 = new JButton("Choice Four");
		choice4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choice4.getText().equals("N/A")) {
					System.out.println("Not a valid choice. Try again.");
				} else {
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
					} else {
						start();
					}
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
				+ ". An excellent name. \n\nYou came to Troy in service of one of the following generals.");

	}

	public void talents() {
		choice1.setText("Agility");
		choice2.setText("Luck");
		choice3.setText("Might");
		choice4.setText("Wits");

		Reaction.setText("You came to Troy in service of " + general + ".");
		if (general.equals("Achilles")) {
			Reaction.append("\nThe great Achilles is known for his invincibility in combat. You \nare in good hands.");
		} else if (general.equals("Agammemnon")) {
			Reaction.append("\nAh, the great king Agammemnon, the general of all the Greeks");
		} else if (general.equals("Diomedes")) {
			Reaction.append("\nThe legendary warrior king, known for felling two gods over the course of the war.");
		} else if (general.equals("Odysseus")) {
			Reaction.append("\nPerhaps the most clever of all the greek generals, \nthe Ithican Odysseyus.");
		}

		Reaction.append("\n\nWhat are you known for?");
	}

	public void level1() {
		if (talent.equals("Luck")) {
			Reaction.setText("You're not personally blessed by Tyche, but you roll \nknucklebones among the best of them.");
		} else if (talent.equals("Agility")) {
			Reaction.setText("Atalanta could outrun you any day of the week, but you move\nquick for someone of your size.\n\n");
		} else if (talent.equals("Might")) {
			Reaction.setText("You're no Ajax, but you can hold your own in a fight.");
		} else if (talent.equals("Wits")) {
			Reaction.setText("Its a strech to compare yourself to Daedalus, but \nyou're certainly an\nintellegent individual.");
		}

		if (general.equals("Diomedes") || general.equals("Odysseus")) {
			Reaction.append("\n\nYou have the day off, and choose to explore the camp during \nyour freetime.");
			exploreC();
		} else if (general.equals("Agammemnon") || general.equals("Achilles")) {
			Reaction.append("\nIt is time for you to join the battlefield, and take arms \nagainst the Trojains.");
			firstCombat();
		}
	}

	public void exploreC() {
		currentChoice = 5;
		choice1.setText("N/A");
		choice2.setText("N/A");
		choice3.setText("N/A");
		choice4.setText("N/A");
	}

	public void firstCombat() {
		Reaction.append("\n\nYou find yourself engaged in man on man combat with a Trojan.\nHe lashes out at you with a sword. What do you do?");

		choice1.setText("Block");
		choice2.setText("Dodge");
		choice3.setText("Scream in Fear");
		choice4.setText("N/A");
		// Combat description and trojan attack, 4 defensive options
	}

	public void counterAttack() {
		// 4 offensive options
		Reaction.append("\nNow the ball is in your court. Time to strike.");

		if (injured == true) {
			Reaction.append("\nYour wound throbs distantly. You'll need to get that fixed \nafter the fight. But for now, you can soldier through");
		}
		choice1.setText("Feint");
		choice2.setText("Overpower");
		choice3.setText("Nimbly Slip By");
		choice4.setText("N/A");
	}
}
