import java.util.Scanner;

public class Explorer {
	private String direction;
	private Hero playerOne;
	public Explorer(Hero playerOne)
	{
	this.playerOne = playerOne;
	}
	public void move() {
		directionChecker();
		if (direction.equals("south") || direction.equals("South") || direction.equals("s")) {

		}

		else if (direction.equals("east") || direction.equals("east") || direction.equals("e")) {

		}

		else if (direction.equals("west") || direction.equals("West") || direction.equals("w")) {

		}

		else if (direction.equals("north") || direction.equals("North") || direction.equals("n")) {

		} else {
			System.out.println("That is not a possible direction...");
			move();
		}

	}

	public String directionChecker() {
		// obsticalChecker(check spaces around player and list possible
		// options);
		System.out.println("Where would you like to move");
		Scanner input = new Scanner(System.in);
		direction = input.next();
		return direction;
	}
}
