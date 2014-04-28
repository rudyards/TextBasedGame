package textGame;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

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
	private boolean MedVis;
	private boolean GenVis;
	private boolean SparVis;
	private boolean AltarVis;
	private boolean exVis;
	private boolean injured;

	/**
	 * Create the panel.
	 */
	public InputPanel() {
		setLayout(new BorderLayout(0, 0));

		Reaction = new JTextArea();
		Reaction.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		Reaction.setEditable(false);
		Reaction.setLineWrap(true);
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

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		choice1 = new JButton("Choice One");
		choice1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choice1.setBackground(Color.LIGHT_GRAY);
		panel.add(choice1);

		choice2 = new JButton("Choice Two");
		choice2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choice2.setBackground(Color.LIGHT_GRAY);
		panel.add(choice2);

		choice3 = new JButton("Choice Three");
		choice3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choice3.setBackground(Color.LIGHT_GRAY);
		panel.add(choice3);

		choice4 = new JButton("Choice Four");
		choice4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choice4.setBackground(Color.LIGHT_GRAY);
		panel.add(choice4);
		

		choice1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choice1.getText().equals("N/A")) {
					System.out.println("Not a valid choice. Try again.");
				} else {
					if (currentChoice == 0) {
						name = "Dikaiopolis";
						currentChoice =1;
						generals();
					} else if (currentChoice == 1) {
						general = "Achilles";
						currentChoice =2;
						talents();
					} else if (currentChoice == 2) {
						talent = "Agility";
						currentChoice=3;
						level1();
					} else if (currentChoice == 3) {
						// output result of choice, then give counterattack
						// opportunity
						if (talent.equals("Combat")) {
							Reaction.setText("You block his sword, and turn it to the side with relative\nease.");
						} else if (talent.equals("Luck")) {
							Reaction.setText("Your swords clash, and his shatters. You met blades\nalong a crack in his weapon. Luck strikes again.");
						} else {
							Reaction.setText("His attack is stronger than your block, and you are forced back.\nHe follows up with a quick stab that slices open your side.");
							injured = true;
						}
						counterAttack();

					} else if (currentChoice == 4) {
						// Feint
						if (talent.equals("Wits")) {
							// success
							
							Reaction.setText("You cleverly outwit your foe, tricking him into blocking an \nattack that you didn't follow through on. You cut him down with ease.");
							exploreC();
						} else if (talent.equals("Agility")) {
							// success
							Reaction.setText("Your bluffing skills are subpar, but your movements impress.\nYou send an attack to his left, and as he moves to block you slash along his right.\nHe falls, horribly slain.");
							exploreC();
						} else {
							// failure
							if(injured == true){
								Reaction.setText("Your feint doesn't fool him, and he parries with ease. \nHe cuts you down, and the world grows black.");
								die();
							}
							if(injured == false){
								Reaction.setText("Your feint leaves much to be desired and he parries. \nYou sustain heavy injuries, but barely win the fight. Better go back to camp to be repaired.");
								injured = true;
								exploreC();
							}
						}
						
					} else {
						start();
					}
				}
			}
		});
		choice2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choice2.getText().equals("N/A")) {
					System.out.println("Not a valid choice. Try again.");
				} else {
					if (currentChoice == 0) {
						name = "Huphantes";
						currentChoice=1;
						generals();
					} else if (currentChoice == 1) {
						general = "Agammemnon";
						currentChoice=2;
						talents();
					} else if (currentChoice == 2) {
						talent = "Luck";
						currentChoice=3;
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
						if (talent.equals("Combat")) {
							if (injured == true) {
								Reaction.setText("Even while injured, you can trounce this footsoldier with ease.");
							}
							Reaction.setText("You strike him down, your sword removing his head from his body.");
							exploreC();
						} else if (talent.equals("Luck")) {
							Reaction.setText("He can't hope to defend himself with a faulty sword. You strike him down.");
							exploreC();
						} else {
							// maybe add death scene.
							if(injured == true){
								Reaction.setText("Your injuries and lack of combat expertise means that your frontal attack\nis an utter failure, and a dangerous one at that. As his sword slips between your ribs\nyou see the Olympians shaking their heads.");
								die();
							}
						}
					} else {
						start();
					}
				}
			}
		});
		choice3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choice3.getText().equals("N/A")) {
					System.out.println("Not a valid choice. Try again.");
				} else {
					if (currentChoice == 0) {
						name = "Axaitios";
						currentChoice=1;
						generals();
					} else if (currentChoice == 1) {
						general = "Odysseus";
						currentChoice=2;
						talents();
					} else if (currentChoice == 2) {
						talent = "Might";
						currentChoice=3;
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
						if (talent.equals("Agility")){
							Reaction.setText("Your speed reigns supreme once again. A blade dances past\nhis grip and opens him open from throat to sternum. He is, quite simply, dead.");

							exploreC();
						}else if(talent.equals("Luck")){

							Reaction.setText("He fumbles with his shield and you take that opportunity\nto strike. You rip through his armor with ease, and he falls.");

							exploreC();
						}else{
							if(injured == true){
								Reaction.setText("You clang against his armor and shield, and he retailiates. \nA sword through your chest leaves you gasping for air. A pity it ended this way.");
								die();
							}else{

								Reaction.setText("You're barely able to cut around his armor and gaurd,\n sustaining heavy injuries in the process. You need to see a medic.");
								injured = true;
								exploreC();
							}
						}
					} else {
						start();
					}
				}
			}
		});

		choice4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choice4.getText().equals("N/A")) {
					System.out.println("Not a valid choice. Try again.");
				} else {
					if (currentChoice == 0) {
						name = "Eruthros";
						currentChoice=1;
						generals();
					} else if (currentChoice == 1) {
						general = "Diomedes";
						currentChoice=2;
						talents();
					} else if (currentChoice == 2) {
						talent = "Wits";
						currentChoice=3;
						level1();
					} else {
						start();
					}
				}
			}
		});
		preGame();
	}

	public void preGame() {
		Reaction.setText("Please hit any choice to start.");

		currentChoice = -1;
	}

	public void start() {
		activateButtons();
		choice1.setText("Dikaiopolis");
		choice2.setText("Huphantes");
		choice3.setText("Axaitios");
		choice4.setText("Eruthros");

		Reaction.setText("What is your name?");
		currentChoice = 0;
	}

	public void generals() {
		activateButtons();
		choice1.setText("Achilles");
		choice2.setText("Agammemnon");
		choice3.setText("Odysseyus");
		choice4.setText("Diomedes");

		Reaction.setText("Ah, "
				+ name
				+ ". An excellent name. \n\nYou came to Troy in service of one of the following generals.");

	}

	public void talents() {
		activateButtons();
		choice1.setText("Agility");
		choice2.setText("Luck");
		choice3.setText("Might");
		choice4.setText("Wits");

		Reaction.setText("You came to Troy in service of " + general + ".");
		if (general.equals("Achilles")) {
			Reaction.append("\nThe great Achilles is known for his invincibility in combat. You are in good hands.");
		} else if (general.equals("Agammemnon")) {
			Reaction.append("\nAh, the great king Agammemnon, the general of all the Greeks");
		} else if (general.equals("Diomedes")) {
			Reaction.append("\nThe legendary warrior king, known for felling two gods over the course of the war.");
		} else if (general.equals("Odysseus")) {
			Reaction.append("\nPerhaps the most clever of all the greek generals, the Ithican Odysseyus.");
		}

		Reaction.append("\n\nWhat are you known for?");
	}

	public void level1() {
		if (talent.equals("Luck")) {
			Reaction.setText("You're not personally blessed by Tyche, but you roll knucklebones among the best of them.");
		} else if (talent.equals("Agility")) {
			Reaction.setText("Atalanta could outrun you any day of the week, but you move quick for someone of your size.");
		} else if (talent.equals("Might")) {
			Reaction.setText("You're no Ajax, but you can hold your own in a fight.");
		} else if (talent.equals("Wits")) {
			Reaction.setText("Its a strech to compare yourself to Daedalus, but \nyou're certainly an intellegent individual.");
		}

		if (general.equals("Diomedes") || general.equals("Odysseus")) {
			Reaction.append("\n\nYou have the day off, and choose to explore the camp during \nyour freetime.");
			exploreC();
		} else if (general.equals("Agammemnon") || general.equals("Achilles")) {
			Reaction.append("\n\nIt is time for you to join the battlefield, and take arms \nagainst the Trojains.");
			firstCombat();
		}
	}

	public void exploreC() {
		currentChoice = 5;
		if (exVis == false) {
			if (general.equals("Diomedes") || general.equals("Odysseus")) {
				Reaction.append("\n\nIt is a lovely day, you think as you strech your legs and \nexplore.");
			} else if (general.equals("Agammemnon")
					|| general.equals("Achilles")) {
				Reaction.append("You arrive at camp.");
			}

		}else{
			Reaction.append("You return outside, and consider what to do next.");
		}
		choice1.setText("Medical Tent");
		choice2.setText("Generals' Tent");
		choice3.setText("Sparring Area");
		choice4.setText("Olympian Altar");
		if (MedVis == true) {
			choice1.disable();
		}
		if (GenVis == true) {
			choice2.disable();
		}
		if (SparVis == true) {
			choice3.disable();
		}
		if (AltarVis == true) {

		}
		//tempCode
		AltarVis = true;
		SparVis = true;
		GenVis = true;
		MedVis = true;
		if(AltarVis == true && SparVis == true && GenVis == true && MedVis == true){
			Reaction.append("\n\nThere is nothing left to do, other than to enter the battlefield.");
			choice1.enable();
			choice1.setText("To Battle!");
			choice2.setText("N/A");
			choice3.setText("N/A");
			choice4.setText("N/A");
			currentChoice = 10;
		}
	}

	public void firstCombat() {
		Reaction.append("\n\nYou find yourself engaged in man on man combat with a Trojan.\nHe lashes out at you with a sword. What do you do?\n\n");
		activateButtons();
		choice1.setText("Block");
		choice2.setText("Dodge");
		choice3.setText("Scream in Fear");
		choice4.setText("N/A");
		choice4.disable();
		// Combat description and trojan attack, 4 defensive options
	}

	public void counterAttack() {
		// 4 offensive options
		if (injured == true) {
			Reaction.append("\n\nYour wound throbs distantly. You'll need to get that fixed \nafter the fight. But for now, you can soldier through.");
		}
		Reaction.append("\n\nNow the ball is in your court. Time to strike.");

		activateButtons();
		choice1.setText("Feint");
		choice2.setText("Overpower");
		choice3.setText("Nimbly Slip By");
		choice4.disable();
		choice4.setText("N/A");
	}

	public void activateButtons() {
		choice1.enable();
		choice2.enable();
		choice3.enable();
		choice4.enable();
	}

	public void die() {
		Reaction.append("\n\n\nYou have been slain. Reboot program and try again.");
		choice1.disable();
		choice2.disable();
		choice3.disable();
		choice4.disable();
	}
}
