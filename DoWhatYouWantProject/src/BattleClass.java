import java.util.Scanner;
import java.util.*;

public class BattleClass {
	private static Scanner input = new Scanner(System.in);

	public static void fightClub(Hero playerOne) {
		// Creates a random enemy and has the player repeatedly fight it
		System.out.println("Lets get ready to ruuuuuummmmmbbbbllllleeee!!!!!");
		int monster = (int) (Math.random() * 3.0);
		Player evil = new Player("PlaceHolder", 100, 100, 50);
		if (monster == 1) {
			evil = new Player("Troll", 30, 1, 150);
		} else if (monster == 2) {
			evil = new Player("Goblin", 20, 10, 70);
		} else {
			evil = new Player("Dark Night", 40, 10, 100);
		}

		while (playerOne.getHealth() > 0 && evil.getHealth() > 0) {

			if (playerOne.getHealth() > 0 && evil.getHealth() > 0) {
				playerOne.showInventory();
				System.out.println(
						"What would you like to do: Enter in a inventory slot to use a item or another number to attack.");
				int choice = input.nextInt();
				if (choice == 1 || choice == 2 || choice == 3) {
					playerOne.useItem(choice);
				} else {
					playerOne.attack(evil);
					// System.out.println("enemy has been attacked");
				}
			}
			if (playerOne.getHealth() > 0 && evil.getHealth() > 0) {

				evil.attack(playerOne);
				// System.out.println("PlayerOne has been attacked");
			}
		}

		// Continue or quit screen?
		if (playerOne.getHealth() > 0) {
			System.out.println(
					"Would you like to continue? Enter 1 to continue, 2 to go to shop(coming soon!), or anything other number to quit");
			int response = input.nextInt();
			if (response == 1) {
				playerOne.setHealth(playerOne.ogHp);
				fightClub(playerOne);
			} else {
				System.out.println("Thank you for playing!");
			}
		} else {
			System.out.println("You are defeated, try again? (y/n)");
			String response = input.next();
			if (response.equals("y")) {
				CharacterCreator.characterCreation();
			} else {
				System.out.println("Thank you for playing!");
			}
		}
		// System.out.println("Combat has ended");
	}
}