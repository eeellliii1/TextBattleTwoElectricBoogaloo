import java.util.Scanner;
import java.util.*;

public class CharacterCreator {
	// Default Inventory
	private static String[] inventory = { "Health_Potion", "Damage_Potion", "empty" };
	private static String cClass;
	private static Scanner input = new Scanner(System.in);
	private static String cName;

	public static void main(String args[]) {
		// Begins character creation
		PlayerMap position = new PlayerMap();
		Map map = new Map();
		characterCreation();
		Explorer.surroundings();
		Explorer.move();
	}

	public static void characterCreation() {
		System.out.println("Enter in a character name:");
		String cName = input.next();
		// Begins class selection
		classPicker();
	}

	public static void classPicker() {
		// Allows player to choose a class and look at a description (upgraded
		// classes not yet available)
		int choice = 1;
		while (choice != 0) {
			System.out.println("Choose a class: 1 For Mage, 2 For Warrior, 3 For Rogue");
			int classSpec = input.nextInt();
			if (classSpec == 1) {
				System.out.println(
						"The mage is a spellcaster capabale of dealing high damage. However, the mage relies on a recourcse known as mana to help cast their spells. \nWithout mana the mage is helpless. A mage can upgrade into pyromancer or cryomancer. Is this your final choice? Enter 0 for yes or any other number for no.");
				choice = input.nextInt();
				if (choice != 0) {
					System.out.println("Returning to class selection.");
				} else {
					System.out.println("You are a wizard " + cName + "!");
					cClass = "Mage";
					Hero playerOne = new Mage(cName, 45, 35, 80, inventory);
					System.out.println("And so begins the journey of " + cName + " the " + cClass + "!");
					// BattleClass.fightClub(playerOne);
				}
			}

			if (classSpec == 2) {
				System.out.println(
						"The Warrior is a powerfull melee fighter capable of dealing critical hits for massive damage. Warrior can multiclass into palidin or barbarian. \nEnter 0 to confirm or any other number to return to class selection.");
				choice = input.nextInt();
				if (choice != 0) {
					System.out.println("Returning to class selection.");
				} else {
					cClass = "Warrior";
					Hero playerOne = new Warrior(cName, 20, 5, 100, inventory);
					System.out.println("And so begins the journey of " + cName + " the " + cClass + "!");
					// BattleClass.fightClub(playerOne);

				}
			}

			if (classSpec == 3) {
				System.out.println(
						"The rogue is a quick fighter able of using speed to attack twice in one turn on the occasion. The rogue can multiclass into gunslinger or assasin. \nEnter 0 to select rogue as your class or enter another number to return to class selection.");
				choice = input.nextInt();
				if (choice != 0) {
					System.out.println("Returning to class selection.");
				} else {
					cClass = "Rogue";
					Hero playerOne = new Rogue(cName, 30, 10, 95, inventory);
					System.out.println("And so begins the journey of " + cName + " the " + cClass + "!");
					// BattleClass.fightClub(playerOne);

				}
			}
		}

	}
}