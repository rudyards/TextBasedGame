package textGame;

import java.util.Scanner;

public class ScannerGameThing {
	static Scanner scan = new Scanner(System.in);

	static String general;
	static String skill;
	static Boolean injured;

	public static void main(String args[]) {
		ScannerGameThing joey = new ScannerGameThing();
		joey.start();
	}

	// Core thingy
	// Scanner scan = new Scanner(System.in);
	// System.out.println();
	public ScannerGameThing() {

	}

	public void start() {

		System.out.println("Sing to me muse, of that great soldier...");
		String name = scan.nextLine();
		System.out
				.println("of that great soldier "
						+ name
						+ ", who first came to the great Trojan Battlefield as a humble footsoldier, in service of...");
		System.out
				.println("(Input a number: 1-Agamemnon, 2-Achilles, 3-Diomedes, 4-Odysseus)");
		String general = scan.nextLine();
		if (general.equals("1")) {
			general = "Agamemnon";
			System.out.println("in service of that great general, Agamemnon.");
		} else if (general.equals("2")) {
			general = "Achilles";
			System.out
					.println("in service of the swift and invincible warrior, Achilles.");
		} else if (general.equals("3")) {
			general = "Diomedes";
			System.out.println("in service of that powerful lord Diomedes.");
		} else if (general.equals("4")) {
			System.out.println("in service of Laertes' son, Odysseus.");
		} else {
			System.out
					.println("Couldn't understand your input. Defaulted to Agamemnon.");
			general = "Agamemnon";
		}
		System.out.println("You are known for your...");
		System.out
				.println("(Input a number: 1-Strength in Combat, 2-Cunning Wits, 3-Incredible Luck, 4-Unbelievable Agility");
		skill = scan.nextLine();
		if (skill.equals("1")) {
			System.out
					.println("You're no Ajax, but you can hold your own in a fight.");
			skill = "Combat";
		} else if (skill.equals("2")) {
			System.out
					.println("Perhaps its a strech to compare yourself to Daedalus, but you're certainly an intellegent individual.");
			skill = "Wits";
		} else if (skill.equals("3")) {
			System.out
					.println("You're not personally blessed by Tyche, but you roll knucklebones among the best of them.");
			skill = "Luck";
		} else if (skill.equals("4")) {
			System.out
					.println("Atalanta could outrun you any day of the week, but you move quick for someone of your size.");
			skill = "Agility";
		} else {
			System.out
					.println("Couldn't understand your input. Defaulted to Strength in Combat");
			skill = "Combat";
		}
		tempPause();
		start2(general);

	}

	public static void start2(String general) {
		System.out
				.println("\n \n \nIt was a day like any of the others that you had suffered since you arrived at this accursed battlefield.");
		System.out
				.println("Nothing changed. The important people survived, and endless footsoldiers died.");
		System.out
				.println("The gods had a specific plan for how this battle would pan out, people said, and most likely your name was merely a footnote.");
		if (general.equals("Agamemnon") || general.equals("Odysseus")) {
			System.out
					.println("\n \nIt was your day to lay seige to the great walls of Troy. You rose, and prepared for combat");
			combat();
		} else {
			System.out
					.println("\n \n Luckily, it was a day of rest for you. Other units were laying seige, but you had a chance to relax.");
			sneakAround();
		}
	}

	public static void combat() {
		System.out
				.println("Combat is a rather unpleasant affair, full of blood and brutality. You're assigned to the rightmost flank of the battleline");
		tempPause();
		System.out
				.println("You find yourself engaged in man on man combat with a Trojan.");
		System.out.println("He strikes out at you with his sword. Do you: ");
		System.out
				.println("1- Attempt to Block, 2- Dodge, 3- Remain petrified in fear.");
		String combatChoice = scan.nextLine();
		if (combatChoice.equals("1")) {
			if (skill.equals("Combat")) {
				System.out
						.println("You block his sword, and turn it to the side with relative ease.");
			} else if (skill.equals("Luck")) {
				System.out
						.println("Your swords clash, and his shatters. You met blades along a crack in his weapon. Luck strikes again.");
			} else {
				System.out
						.println("His attack is stronger than your block, and you are forced back.\n He follows up with a quick stab that slices open your side. Pain rips through you.");
				injured = true;
			}
		} else if (combatChoice.equals("2")) {
			if (skill.equals("Agility")) {
				System.out
						.println("You nimbly step aside, and line yourself up to counter attack.");
			} else {
				System.out
						.println("You weren't quite quick enough, and his sword rips along your upper leg. Your eyes blur.");
				injured = true;
			}
		} else if (combatChoice.equals("3")) {
			if (skill.equals("Luck")) {
				System.out
						.println("He had you dead to rights, but a stray arrow from a skirmish downwind embeds itself in his arm. You got lucky.");
			} else {
				System.out
						.println("The sword slashes your shoulder, and you roar in pain.");
				injured = true;
			}
		} else {
			System.out.println("Defaulted to Remain petrified in fear.");
			if (skill.equals("Luck")) {
				System.out
						.println("He had you dead to rights, but a stray arrow from a skirmish downwind embeds itself in his arm. You got lucky.");
			} else {
				System.out
						.println("The sword slashes your shoulder, and you roar in pain.");
				injured = true;
			}
		}
		tempPause();
		combat2(injured);
	}

	public static void combat2(Boolean injured) {
		if (injured == true) {
			System.out
					.println("You might not be in peak condition, but you can still probably take this sucker down.");
		}
		System.out.println("You need to decide your plan of attack.");
		System.out
				.println("1- Overpower him with a straight up assault, 2-Trick him with a cunning feint, 3-Slip between his gaurd and end his pitiful life");
		String combatChoice = scan.nextLine();
		if (combatChoice.equals("1")) {
			if (skill.equals("Combat")) {
				if (injured == true) {
					System.out
							.println("Even while injured, you can trounce this footsoldier with ease.");

				}
				System.out
						.println("You strike him down, your sword removing his head from his body.");
				if (injured == true) {
					System.out.println("You return to your tent to recover.");
					injured = false;
					tempPause();
					sneakAround();
				} else {
					System.out
							.println("You remain in the battlefield for a while longer, before you chose to retire to your tent.");
					injured = false;
					tempPause();
					sneakAround();
				}
			}
		}
		if (skill.equals("Luck")) {
			System.out
					.println("He can hardly defend himself with that faulty sword he aparently armed himself with this morning.");
			System.out.println("Your Luck is your greatest weapon by far.");
			System.out
					.println("You cut him down, and chuckle to yourself as he falls.");
			if (injured == true) {
				System.out.println("You return to your tent to recover.");
				injured = false;
				tempPause();
				sneakAround();
			} else {
				System.out
						.println("You remain in the battlefield for a while longer, before you chose to retire to your tent.");
				injured = false;
				tempPause();
				sneakAround();

			}
		} else if (combatChoice.equals("2")) {

		} else if (combatChoice.equals("3")) {

		} else {

		}

	}

	public static void sneakAround() {
		System.out
				.println("You decide to explore camp and see what goes on behind the scenes");
		tempPause();

	}

	public static void tempPause() {
		System.out.println("Type anything to continue.");
		String placeholder = scan.nextLine();
	}
}
