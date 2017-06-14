
public class Key {
private String door;
	public Key(String door)
	{
		this.door = door;
	}
	
	public void useWith(String door)
	{
		if(door.toLowerCase() == this.door.toLowerCase())
		{
			//door.setOpen();
		}
	}
}
