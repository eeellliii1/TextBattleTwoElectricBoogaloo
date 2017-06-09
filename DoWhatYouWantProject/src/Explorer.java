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
	
	public static void surroundings()
	{
		System.out.println("You are currently in " + ((Map.getTile((PlayerMap.getX()), (PlayerMap.getY())).getContents())) + ", To the north there is a " + (((Map.getTile((PlayerMap.getX()), (PlayerMap.getY()) + 1).getContents()))) + ", to the east there is " + ((Map.getTile((PlayerMap.getX()) + 1, (PlayerMap.getY())).getContents())) + ", to the south there is " + ((Map.getTile((PlayerMap.getX()), (PlayerMap.getY()) - 1).getContents())) + ", to the west there is " + ((Map.getTile((PlayerMap.getX() - 1), (PlayerMap.getY())).getContents())));
	}
}
