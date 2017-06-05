
public class Mage extends Hero
{
   private int mana = 180;
   private int health = 80;
   private int maxDamage = 45; 
   private int minDamage = 35;
   public boolean usesMana = true;
   
   public Mage(String name, int maxDamage, int minDamage, int health, String[] inventory)
    {
        super(name, maxDamage, minDamage, health, inventory);
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.health = health;
        this.name = name;
        System.out.println("Created!");
        inventory[2] = "Mana_Potion";
    }
   
   public void attack(Player enemy)
   {
       //Attacks enemy and decreases mana by 10 for each attack
        if(mana >= 10)
        {
        enemy.setDamageTaken((int)(Math.random() * (maxDamage - minDamage) + minDamage));
        System.out.println(this.getName() + " has attacked " + enemy.getName() + " doing " + enemy.getDamageTaken() + " damage.");
        enemy.recieveDamage(enemy.getDamageTaken());
        if(enemy.getHealth() > 0)
        {
        //System.out.println("The " + enemy.getName() + " has " + enemy.getHealth() + " remaining.");
        }
        setMana(getMana() - 10);
        if(enemy.getHealth() > 0)
        {
        System.out.println(this.getName() + " has " + this.getMana() + " mana left.");
        }
        }
        else
        {
            System.out.println("Not enough mana!");
        }
   }
   
   public void useItem(int slot)
        {
            //a overriding use item method to use mana potions
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
        
        if(inventory[place].equals("Mana_Potion"))
        {
            setMana(getMana()+10);
            System.out.println(getName() + "'s mana is restored to " + getMana());
            inventory[place] = "empty";
        }
        else
        {
            System.out.println("That inventory slot is empty!");
        }
        
        
    }
   
   public int getMana()
   {
       return mana;    
   }
   
   public void setMana(int value)
   {
       mana = value;
       if(mana < 0)
       {
           mana = 0;
       }
   }
}
