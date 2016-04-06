import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Launcher for the entire game.
 *  
 * Pushed on 2/10/16
 */
public class Game
{
    //Weapons
    public static final Item CROWBAR = new Item("Crowbar", "For bashing skulls and/or opening doors.");
    public static final Item HAMMER = new Item("Hammer","For hammering skulls and/or prying open doors.");
    public static final Item RAYGUN = new Item("Raygun", "For blasting skulls and/or opening doors maybe?.");
    public static final Item FLIGHTSUIT = new Item("Flight Suit","The standard attire for a true space explorer.");
    public static final Item SPACESUIT = new Item("Space Suit", "Can withstand the harshest of envoronments.");
    public static final Item METALPLATING = new Item("Metal Plating", "Strong metal plating used to shield the hull.");
    //Progression Items
    public static final Item OXYGEN = new Item("Oxygen Tank","You can breath this.");
    public static final Item SPACEBIKE = new Item("Space Bike", "Used to cross large distances.");
    public static final Item SHOES = new Item("Galactic Shoes","Used to reach greater heights.");
    //Life and health
    public static final Item MEDKIT = new Item("Medkit", "You can use this to heal yourself.");
    public static final Item PIZZA = new Item("Mars Pizza","Delicious pizza! Grown and cooked on Mars.");
    public static final Item FOODBAR = new Item("Martian Bar","A tasty treat that will also restore some health.");
    public static final Item WATER = new Item("Water","H20.");
    //Obstacles
    public static final Obstacle BATS = new Obstacle("Bats", "A swarm of bats attacks!");
    public static final Obstacle PITFALL = new Obstacle("Pitfall", "A pit that you fall into.");
    public static final Obstacle ROCKSLIDE = new Obstacle("Rock Slide", "A slide of rocks!");
    public static final Obstacle ACIDPUDDLE = new Obstacle("Acid Puddle", "You probably should not step in this.");
    public static final Obstacle ANDROIDS = new Obstacle("Androids", "A squad of lethal android assassians.");
    public static final Obstacle SIREN = new Obstacle("Siren", "Try asking it to sing.");
    public static final Obstacle PIRATES = new Obstacle("Space Pirates", "Hide yer booty.");
    public static final Obstacle CURIOSITY = new Obstacle("The Curiosity Rover", "Abandoned as a pup, it lives in the middle of nowhere.");
    public static final Obstacle POISONOUSPLANT = new Obstacle("A friendly plant", "Possibly has medicinal purposes.");
    public static final Obstacle SHIPDEFENSE = new Obstacle("Ship defense systems", "The automated defenses responsible for keeping the ship safe.");
    
    public static String name;
    private Player player;
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
        this.name = game.getUserName();
        game.createPlayer();
    }
    
    public void playGame()
    {
        StoryText.intro();
        String wat = "";
        Scanner keyboard = new Scanner(System.in);
        
        wat = keyboard.nextLine();
        
        StoryText.level1();
        wat = keyboard.nextLine();
        StoryText.level2();
        wat = keyboard.nextLine();
        StoryText.level3();
        wat = keyboard.nextLine();
        StoryText.outro();
    }
    
    public void makeMove(String move)
    {
        if (move.equals("up"))
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
        if (move.equals("down"))
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
        if (move.equals("left"))
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
        if (move.equals("right"))
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
        if (move.equals("give up"))
        {
            System.exit(0);
        }
        if (move.equals("analyze"))
        {
            System.out.println(currentLevel.getCurrentRoom().getId());
            System.out.println(currentLevel.getCurrentRoom().getDescription());
        }
        if (move.equals("pickup"))
        {
            if (currentLevel.getCurrentRoom().getItems() != null)
            {
                player.addToInventory(currentLevel.getCurrentRoom().getItems());
                currentLevel.getCurrentRoom().setItems(null);
            }
        }
        if (move.equals("open"))
        {
            
        }
        if (move.equals("bag"))
        {
            player.displayInventory();
        }
        if (move.equals("attack"))
        {
            
        }
        if (move.equals("defend"))
        {
            
        }
        if (move.equals("item"))
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
        if (move.equals("run"))
        {
            
        }
        if (move.equals("help"))
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
