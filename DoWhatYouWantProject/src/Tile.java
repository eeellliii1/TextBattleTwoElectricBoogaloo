public class Tile {
	private String contents;
	private boolean isPassable;
	//Default constructor
	public Tile(){
		contents = "Plains";
		isPassable = true;
	}
	public Tile(String c, boolean p)
	{
		contents = c;
		isPassable = p;
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



