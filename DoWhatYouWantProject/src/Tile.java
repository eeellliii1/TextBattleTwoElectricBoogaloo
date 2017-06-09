
public class Tile {
	private String contents;
	private boolean isPassable;
	private boolean containsCharacter;
	//Default constructor
	public Tile(){
		contents = "Plains";
		isPassable = true;
		containsCharacter = false;
	}
	public Tile(String c, boolean p, boolean cC)
	{
		contents = c;
		isPassable = p;
		containsCharacter = cC;
	}
	public String getContents() {
		return contents;
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