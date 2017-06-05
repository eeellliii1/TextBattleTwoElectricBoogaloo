import java.util.*;
public class BattleClass
{
    private static Scanner input = new Scanner(System.in);
    private static String cName;
    //Default Inventory
    private static String[] inventory = {"Health_Potion", "Damage_Potion", "empty"};
    private static String cClass;

    public static void main(String args[])
    {
        //Begins character creation
        characterCreation();
    }

    public static void characterCreation()
    {
        System.out.println("Enter in a character name:");
        cName = input.next();
        //Begins class selection
        classPicker();
    }

    public static void classPicker()
    {
        //Allows player to choose a class and look at a description (upgraded classes not yet available)
        int choice = 1;
        while(choice!= 0)
        {
            System.out.println("Choose a class: 1 For Mage, 2 For Warrior, 3 For Rogue");
            int classSpec = input.nextInt();
            if(classSpec == 1)
            {
                System.out.println("The mage is a spellcaster capabale of dealing high damage. However, the mage relies on a recourcse known as mana to help cast their spells. \nWithout mana the mage is helpless. A mage can upgrade into pyromancer or cryomancer. Is this your final choice? Enter 0 for yes or any other number for no.");
                choice = input.nextInt();
                if(choice != 0)
                {
                    System.out.println("Returning to class selection.");
                }
                else
                {
                    System.out.println("You are a wizard " + cName + "!");
                    cClass = "Mage";
                    Hero playerOne = new Mage(cName, 45, 35, 80, inventory);
                    System.out.println("And so begins the journey of " + cName + " the " + cClass + "!");
                    fightClub(playerOne);
                }
            }

            if(classSpec == 2)
            {
                System.out.println("The Warrior is a powerfull melee fighter capable of dealing critical hits for massive damage. Warrior can multiclass into palidin or barbarian. \nEnter 0 to confirm or any other number to return to class selection.");
                choice = input.nextInt();
                if(choice != 0)
                {
                    System.out.println("Returning to class selection.");
                }
                else
                {
                    cClass = "Warrior";
                    Hero playerOne = new Warrior(cName, 20, 5, 100, inventory);
                    System.out.println("And so begins the journey of " + cName + " the " + cClass + "!");
                    fightClub(playerOne);
                }
            }

            if(classSpec == 3)
            {
                System.out.println("The rogue is a quick fighter able of using speed to attack twice in one turn on the occasion. The rogue can multiclass into gunslinger or assasin. \nEnter 0 to select rogue as your class or enter another number to return to class selection.");
                choice = input.nextInt();
                if(choice != 0)
                {
                    System.out.println("Returning to class selection.");
                }
                else
                {
                    cClass = "Rogue";
                    Hero playerOne = new Rogue(cName, 30, 10, 95, inventory);
                    System.out.println("And so begins the journey of " + cName + " the " + cClass + "!");
                    fightClub(playerOne);
                }
            }
        }

    }

    public static void fightClub(Hero playerOne)
    {
        //Creates a random enemy and has the player repeatedly fight it
        System.out.println("Lets get ready to ruuuuuummmmmbbbbllllleeee!!!!!");
        int monster = (int) (Math.random() * 3.0);
        Player evil = new Player("PlaceHolder", 100, 100, 50);
        if(monster == 1)
        {
            evil = new Player("Troll", 30, 1, 150);
        }
        else if(monster == 2)
        {
            evil = new Player("Goblin", 20, 10, 70);
        }
        else
        {
            evil = new Player("Dark Night", 40, 10, 100);
        }

        while(playerOne.getHealth() > 0 && evil.getHealth() > 0)
        {

            if(playerOne.getHealth() > 0 && evil.getHealth() > 0)
            {
                playerOne.showInventory();
                System.out.println("What would you like to do: Enter in a inventory slot to use a item or another number to attack.");
                int choice = input.nextInt();
                if(choice == 1 || choice == 2 || choice == 3)
                {
                    playerOne.useItem(choice);
                }
                else
                {
                    playerOne.attack(evil);
                    //System.out.println("enemy has been attacked");
                }
            }
            if(playerOne.getHealth() > 0 && evil.getHealth() > 0)
            {

                evil.attack(playerOne);
                //System.out.println("PlayerOne has been attacked");
            }
        }
        
        //Continue or quit screen?
        if(playerOne.getHealth() > 0)
        {
            System.out.println("Would you like to continue? Enter 1 to continue, 2 to go to shop(coming soon!), or anything other number to quit");
            int response = input.nextInt();
            if(response == 1)
            {
                playerOne.setHealth(playerOne.ogHp);
                fightClub(playerOne);
            }
            else
            {
            System.out.println("Thank you for playing!");    
            }
        }
        else
        {
            System.out.println("You are defeated, try again? (y/n)");
            String response = input.next();
            if(response.equals("y"))
            {
                characterCreation();
            }
            else
            {
                System.out.println("Thank you for playing!");
            }
        }
        //System.out.println("Combat has ended");
    }
}
