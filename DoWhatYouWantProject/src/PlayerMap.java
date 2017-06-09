
public class PlayerMap extends Map {
	private static int[][] pMap = new int[50][50];
	private static int x = 25;
	private static int y = 40;

	public static void main(String[] args) {
		for (int x = 0; x < 50; x++) {
			for (int y = 0; y < 50; y++) {
				pMap[x][y] = 0;
				pMap[25][40] = 1;
			}

		}
	}

	public static void mapMovePlayer(String direction) {
		if (direction.equals("south") || direction.equals("South") || direction.equals("s")) {
			if (Map.getTile(x, y--).checkPass() == true) {
				pMap[x][y] = 0;
				pMap[x][y--] = 1;
				y--;
			}
		}

		else if (direction.equals("east") || direction.equals("east") || direction.equals("e")) {
			if (Map.getTile(x++, y).checkPass() == true) {
				pMap[x][y] = 0;
				pMap[x++][y] = 1;
				x++;
			}
		}

		else if (direction.equals("west") || direction.equals("West") || direction.equals("w")) {
			if (Map.getTile(x--, y).checkPass() == true) {
				pMap[x][y] = 0;
				pMap[x--][y] = 1;
				x--;
			}
		}

		else if (direction.equals("north") || direction.equals("North") || direction.equals("n")) {
			if (Map.getTile(x, y++).checkPass() == true) {
				pMap[x][y] = 0;
				pMap[x][y++] = 1;
				y++;
			}
		} else {
			System.out.println("That is not a possible direction...");
			Explorer.move();
		}
	}

	public static int getX() {
		return x;
	}

	public static int getY() {
		return y;
	}

}
