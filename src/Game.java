import java.util.Scanner;
import java.util.Random;
/**
 * Launcher for the entire game.
 *  
 * Pushed on 2/10/16
 */
public class Game
{
    
    public static String name;
    public static Player player;
    private Scanner keyboard;
    private static Game game;
    private Level currentLevel;
    
    public Game()
    {
        keyboard = new Scanner(System.in);
    }
    
    public static void main(String[] args)
    {
        game = new Game();
        game.startGame();
        
        game.playGame();
    }
    
    public void startGame()
    {
        Game.name = game.getUserName();
        game.createPlayer();
    }
    
    public void playGame()
    {
        StoryText.intro();
        String wat = "";
        Scanner keyboard = new Scanner(System.in);
        
        ActualRooms actual = new ActualRooms();
        currentLevel = actual.getLevel1();
        while (!currentLevel.isLevelOver(player))
        {
            wat = keyboard.nextLine();
            makeMove(wat);
        }
        if(player.getCurrentHealthVal() <= 0)
        {
        	System.out.println("Sorry. You died. Better luck next time!");
        	System.exit(0);
        }
        StoryText.level1();
        
        currentLevel = actual.getLevel2();
        while (!currentLevel.isLevelOver(player))
        {
            wat = keyboard.nextLine();
            makeMove(wat);
        }
        if(player.getCurrentHealthVal() <= 0)
        {
        	System.out.println("Sorry. You died. Better luck next time!");
        	System.exit(0);
        }
        StoryText.level2();
        
        currentLevel = actual.getLevel3();
        while (!currentLevel.isLevelOver(player))
        {
            wat = keyboard.nextLine();
            makeMove(wat);
        }
        if(player.getCurrentHealthVal() <= 0)
        {
        	System.out.println("Sorry. You died. Better luck next time!");
        	System.exit(0);
        }
        keyboard.close();
        StoryText.level3();
        StoryText.outro();
    }
    
    public void makeMove(String move)
    {
        if (move.equals("move"))
        {
            Room[] j = currentLevel.getAvailableRooms(currentLevel.getCurrent());
            for (int i = 0; i < j.length; i++)
            {
                System.out.println(i + ". " + j[i].getId());
            }
            System.out.println("Choose a room: ");
            String floob = keyboard.next();
            try
            {
                int choice = Integer.parseInt(floob);
                if (choice >= 0 && choice < j.length)
                {
                    currentLevel.moveCurrentRoom(choice);
                    System.out.println(currentLevel.getCurrentRoom().getId());
                    System.out.println(currentLevel.getCurrentRoom().getDescription());
                }
                else
                {
                    System.out.println("The room is locked and/or does not actually exist");
                }
            }
            catch (Exception e)
            {
                System.out.println(getSnarkyRemark());
            }
        }
        /*
        else if (move.equals("down"))
        {
            Room[] j = currentLevel.getAvailableRooms(currentLevel.getCurrent());
            for (int i = 0; i < j.length; i++)
            {
                System.out.println(i + ". " + j[i].getId());
            }
            System.out.println("Choose a room: ");
            int choice = keyboard.nextInt();
            if (choice >= 0 && choice < j.length)
            {
                currentLevel.moveCurrentRoom(choice);
            }
        }
        else if (move.equals("left"))
        {
            Room[] j = currentLevel.getAvailableRooms(currentLevel.getCurrent());
            for (int i = 0; i < j.length; i++)
            {
                System.out.println(i + ". " + j[i].getId());
            }
            System.out.println("Choose a room: ");
            int choice = keyboard.nextInt();
            if (choice >= 0 && choice < j.length)
            {
                currentLevel.moveCurrentRoom(choice);
            }
        }
        else if (move.equals("right"))
        {
            Room[] j = currentLevel.getAvailableRooms(currentLevel.getCurrent());
            for (int i = 0; i < j.length; i++)
            {
                System.out.println(i + ". " + j[i].getId());
            }
            System.out.println("Choose a room: ");
            int choice = keyboard.nextInt();
            if (choice >= 0 && choice < j.length)
            {
                currentLevel.moveCurrentRoom(choice);
            }
        }
        */
        else if (move.equals("give up"))
        {
            System.exit(0);
        }
        else if (move.equals("analyze"))
        {
            System.out.println(currentLevel.getCurrentRoom().getId());
            System.out.println(currentLevel.getCurrentRoom().getDescription());
        }
        else if (move.equals("pickup"))
        {
        	Item thing = currentLevel.getCurrentRoom().getItems();
            if (thing != null)
            {
                player.addToInventory(thing);
                currentLevel.getCurrentRoom().setItems(null);
                if(thing == ActualRooms.CROWBAR || thing == ActualRooms.HAMMER 
                		|| thing == ActualRooms.RAYGUN)
                {
                	player.setAttackVal(2 * player.getAttackVal());
                }
                else if(thing == ActualRooms.FLIGHTSUIT)
                {
                	player.setDefenseVal(player.getDefenseVal() + 5);
                }
                else if(thing == ActualRooms.SPACESUIT && player.has(ActualRooms.FLIGHTSUIT))
                {
                	player.setDefenseVal(player.getDefenseVal() + 5);
                }
                else if(thing == ActualRooms.SPACESUIT)
                {
                	player.setDefenseVal(player.getDefenseVal() + 10);
                }
                else if(thing == ActualRooms.METALPLATING && player.has(ActualRooms.SPACESUIT))
                {
                	player.setDefenseVal(player.getDefenseVal() + 5);
                }
                else if(thing == ActualRooms.METALPLATING && player.has(ActualRooms.FLIGHTSUIT))
                {
                	player.setDefenseVal(player.getDefenseVal() + 10);
                }
                else if(thing == ActualRooms.METALPLATING)
                {
                	player.setDefenseVal(player.getDefenseVal() + 15);
                }
            }
        }
        else if (move.equals("open"))
        {
            
        }
        else if (move.equals("bag"))
        {
            player.displayInventory();
        }
        else if (move.equals("attack"))
        {
            
        }
        else if (move.equals("defend"))
        {
            
        }
        else if (move.equals("item"))
        {
            player.displayInventory();
            System.out.println("What item would you like to use?");
            try
            {
                int i = keyboard.nextInt();
                player.use(i);
            }
            catch(Exception e)
            {
                System.out.println("invalid input");
                makeMove("item");
            }
            
        }
        else if (move.equals("run"))
        {
            
        }
        else if (move.equals("help"))
        {
            System.out.println("up: Moves the player up a room");
            System.out.println("down: Moves the player down a room");
            System.out.println("left: Moves the player left a room");
            System.out.println("right: Moves the player right a room");
            System.out.println("analyze: Describes the player's current room");
            System.out.println("pickup: Adds the items in the room to the player's inventory");
            System.out.println("open: ");
            System.out.println("bag: Displays the player's inventory");
            System.out.println("attack: ");
            System.out.println("defend: ");
            System.out.println("item: Allows the player to use an item from their inventory");
            System.out.println("run: ");
            System.out.println("give up: Ends the game");
            System.out.println("help: Prints all possible player commands");
        }
        else
        {
            System.out.println("Invalid Move");
        }
    }

    /**
     * Create the player object for our game.
     */
    public String createPlayer()
    {
        System.out.println("What type of character would you like to be?");
        String type;
        String selected;

        while (true)
        {
            System.out.println("Types: Hammerer, Gunslinger, Wielder.");
            selected = keyboard.nextLine().toLowerCase();

            if (selected.equals("hammerer"))
            {
                type = "Hammerer";
                player = new Hammerer(9, 9, 36, name);
                System.out.println("Hammerer's Stats:\nAttack: 9\nDefense: 9\nHealth: 36");
                break;
            }
            else if (selected.equals("gunslinger"))
            {
                type = "Gunslinger";
                player = new Gunslinger(14, 8, 24, name);
                System.out.println("Gunslinger's Stats:\nAttack: 14\nDefense: 8\nHealth: 24");
                break;
            }
            else if (selected.equals("wielder"))
            {
                type = "Wielder";
                player = new Wielder(5, 15, 30, name);
                System.out.println("Wielder's Stats:\nAttack: 5\nDefense: 15\nHealth: 30");
                break;
            }
            else
            {
                System.out.println("INVALID CHOICE, MORTAL.");
            }
        }
        System.out.println("Are you confident in your choice? (y/n)");
        String a = keyboard.nextLine();
        if(a.charAt(0) == 'n')
        {
            createPlayer();
        }
        System.out.println("Good luck on your adventure " +name+ ". You will need it...\n\n\n");
        return type;
    }
    
    public String getSnarkyRemark()
    {
        String[] rems = {"What even are you trying to do?", "I doughnut understand.",
                "Who do you think you are, commanding me like that?"};
        Random rnd = new Random();
        return rems[rnd.nextInt(rems.length)];
    }

    /**
     * Get the user's name.
     * 
     * @param keyboard
     *            The scanner
     */
    public String getUserName()
    {
        System.out.print("Enter your name: ");
        return keyboard.nextLine();
    }

    /**
     * Items that can be obtained by the player.
     */
    public enum Items
    {
        CROWBAR, HAMMER, RAYGUN, FLIGHTSUIT, SPACESUIT, METALPLATING, OXYGEN, SPACEBIKE, SHOES,
        MEDKIT, PIZZA, FOODBAR, WATER
    };

    /**
     * Obstacles that occur during the game.
     */
    public enum Obstacles
    {
        BATS, PITFALL, ROCKSLIDE, ACIDPUDDLE, ANDROIDS, SIREN, PIRATES, CURIOSITY, POISONOUSPLANT,
        SHIPDEFENSE
    };
}
