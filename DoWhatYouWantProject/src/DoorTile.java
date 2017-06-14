
public class DoorTile extends Tile {
	private String contents;
	private boolean isPassable;
	private String material;
	private Door door;

	// Default constructor
	public DoorTile() {
		contents = "Plains";
		isPassable = true;

	}

	public DoorTile(String c, boolean p) {
		contents = c;
		isPassable = p;
	}

	public String getContents() {

		return contents + " " + material + " door that is " + door;
	}

	public boolean checkPass() {
		return isPassable;
	}

	public void setContents(String con) {
		contents = con;
	}

	public void setPass(int b) {
		// 1 is passable 0 is not
		if (b == 1) {
			isPassable = true;
		} else {
			isPassable = false;
		}
	}
}
