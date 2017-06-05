
public class Player
{
    //Sets default values
    private String name;
    private int health = 100;
    private int minDamage = 20;
    private int maxDamage = 10;
    private int damageTaken = 0;
    
    public Player(String name, int maxDamage, int minDamage, int health)
    {
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.health = health;
        this.name = name;
        //System.out.println(name);
    }

    
    public String getName()
    {
        return name;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int getMinDamage()
    {
        return minDamage;
    }
    
    public int getMaxDamage()
    {
        return maxDamage;
    }
    
    public int getDamageTaken()
    {
        return damageTaken;
    }
    
    
    
    
    public void recieveDamage(int damageTaken)
    {
        setHealth(getHealth() - getDamageTaken());
        //Checks to see if enemy is dead and prevents overkill messages
        if(getHealth() < 0)
        {
            setHealth(0);
        }
        System.out.println(getName() + " has " + getHealth() + " health remaning!");
       
        if(getHealth() <= 0)
        {
            System.out.println(this.name + " has been defeated!");
        }
    }
    
    public void attack(Player enemy)
    {
        //Allows characters to deal eachother damage
        int damage = ((int)(Math.random() * (this.maxDamage - this.minDamage) + this.minDamage));
        enemy.setDamageTaken(damage);
        System.out.println(this.getName() + " has attacked " + enemy.getName() + " doing " + enemy.getDamageTaken() + " damage.");
        enemy.recieveDamage(getDamageTaken()); 
        //System.out.println(this.getName());
    }
    
    public void setHealth(int value)
    {
        health = value;
    }
    
    public void setMinDamage(int value)
    {
        minDamage = value;
    }
    
    public void setMaxDamage(int value)
    {
        maxDamage = value;
    }
    
    public void setDamageTaken(int value)
    {
        damageTaken = value;
    }
}
