
public class Rogue extends Hero
{
    //Chance to attack a second time
    private double secondAttackChance = 0.3;
    
    
    public Rogue(String name, int maxDamage, int minDamage, int health, String[] inventory)
    {
        super(name, maxDamage, minDamage, health, inventory);
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.health = health;
        this.name = name;
        System.out.println("Created");
    }
    
    public double getSecondAttackChance()
    {
        return secondAttackChance;
    }
    
    public void setSecondAttackChance(double value)
    {
        secondAttackChance = value;
    }
    
    
    public void attack(Player enemy)
    {
        //Attacks enemy and checks if attacks a second time
        enemy.setDamageTaken((int)(Math.random() * (getMaxDamage() - getMinDamage() + 1) + getMinDamage()));
        System.out.println(this.getName() + " has attacked " + enemy.getName() + " doing " + enemy.getDamageTaken() + " damage.");
        enemy.recieveDamage(enemy.getDamageTaken());
        if(enemy.getHealth() > 0)
        {
        //System.out.println("The " + enemy.getName() + " has " + enemy.getHealth() + " remaining.");
        }
        double secondAttackCheck = Math.random() * (1.0) + 0.0;
        if(secondAttackCheck < getSecondAttackChance() && enemy.getHealth() > 0)
        {
            System.out.println(getName() + "'s speed allows them to attack a second time!");
            //attack a second time
            enemy.setDamageTaken((int)(Math.random() * (getMaxDamage() - getMinDamage() + 1) + getMinDamage()));
        System.out.println(this.getName() + " has attacked " + enemy.getName() + " doing " + enemy.getDamageTaken() + " damage.");
        enemy.recieveDamage(enemy.getDamageTaken());
        if(enemy.getHealth() > 0)
        {
        System.out.println("The " + enemy.getName() + " has " + enemy.getHealth() + " remaining.");
        }
        }
    }
}
