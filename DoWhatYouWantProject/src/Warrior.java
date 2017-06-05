
public class Warrior extends Hero
{
    //Default values
    private double critChance = 0.5; //Chance to deal double damage
    private int health = 100;
    private int maxDamage = 20;
    private int minDamage = 5;
    
    public Warrior(String name, int maxDamage, int minDamage, int health, String[] inventory)
    {
        super(name, maxDamage, minDamage, health, inventory);
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.health = health;
        this.name = name;
        //System.out.println("Created!");
    }
    
    
    
    public void attack(Player enemy)
    {
        //Attack the enemy and check to see if hit a crit
        double critCheck = Math.random() * (1.0) + 0.0;
        if(critCheck >= critChance)
        {
        System.out.println("Your strike has landed a crit!");
        enemy.setDamageTaken(2 * ((int)(Math.random() * (maxDamage - minDamage + 1) + minDamage)));
        }
        else
        {
        enemy.setDamageTaken((int)(Math.random() * (maxDamage - minDamage + 1) + minDamage));
        }
        if(health > 0 && enemy.getHealth() > 0)
        {
        System.out.println(name + " has attacked " + enemy.getName() + " doing " + enemy.getDamageTaken() + " damage.");
        }
    
        enemy.recieveDamage(enemy.getDamageTaken());
        //if(health > 0 && enemy.getHealth() > 0)
        //{
            //System.out.println("The " + enemy.getName() + " has " + enemy.getHealth() + " remaining.");
        //}
    }
    
    public double getCritChance()
    {
        return critChance;
    }
    
    public void setCritChance(int value)
    {
        critChance = value;
    }
}
