
public class Map {
	private static Tile[][] map = new Tile[50][50];

	public static void main(String[] args) {
		for (int x = 0; x < 50; x++) {
			for (int y = 0; y < 50; y++) {
				map[x][y] = new Tile("Plains", true);
			}
			

		}
	}
	public static Tile getTile(int x, int y)
	{
		return map[x][y];
	}
}