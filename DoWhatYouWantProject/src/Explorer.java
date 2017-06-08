import java.util.Scanner;

public class Explorer {
	private static String direction;
	private Hero playerOne;

	public Explorer(Hero playerOne) {
		this.playerOne = playerOne;
	}

	public static void move() {
		PlayerMap.mapMovePlayer(directionChecker());

	}

	public static String directionChecker() {
		// obsticalChecker(check spaces around player and list possible
		// options);
		System.out.println("Where would you like to move");
		Scanner input = new Scanner(System.in);
		direction = input.next();
		return direction;
	}
}
