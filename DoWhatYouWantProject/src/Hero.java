
public class Hero extends Player
{  
    String[] inventory;
    public String name;
    public int health = 100;
    public int ogHp = health;
    public int minDamage = 20;
    public int maxDamage = 40;
    
        
     public Hero(String name, int maxDamage, int minDamage, int health, String[] inventory)
    {
        super(name, maxDamage, minDamage, health);
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.health = health;
        this.name = name;
        ogHp = health;
        this.inventory = inventory;
    }
       
        
        public void useItem(int slot)
        {
            //Uses item and sets slot to empty
            int place = slot - 1;
            if(inventory[place].equals("Health_Potion"))
            {
                int newHealth = getHealth() + 20;
                if(newHealth > ogHp)
                {
                setHealth(ogHp);
            }
            else
            {
                setHealth(newHealth);
            }
          System.out.println(getName() + " now has  " + getHealth() + " health.");
          inventory[place] = "empty";
        }
        else if(inventory[place].equals("Damage_Potion"))
        {
            setMaxDamage(getMaxDamage() + 10);
            inventory[place] = "empty";
            System.out.println(getName() + " can do more damge.");
        }
        else
        {
            System.out.println("That inventory slot is empty!");
        }
        
    }
    
    public void showInventory()
    {
        //Prints inventory effectively a toString method
        System.out.println("Your inventory holds: ");
        for(int i = 0; i < inventory.length; i++)
        {
            //System.out.println(name);
            System.out.print((i + 1) + ". " + inventory[i] + "; ");
        }
        System.out.println();
    }
}