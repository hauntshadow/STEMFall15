import java.util.Scanner;

/**
 * Launcher for the entire game.
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
    
    public static final Obstacle BATS = new Obstacle("Bats", "A swarm of bats attacks!");
    public static final Obstacle PITFALL = new Obstacle("Pitfall", "A pit that you fall into.");
    public static final Obstacle ROCKSLIDE = new Obstacle("Rock Slide", "A slide of rocks!");
    public static final Obstacle ADICPUDDLE = new Obstacle("Acid Puddle", "You probably should not step in this.");
    public static final Obstacle ANDROIDS = new Obstacle("Androids", "A squad of lethal android assassians.");
    public static final Obstacle SIREN = new Obstacle("Siren", "Try asking it to sing.");
    public static final Obstacle PIRATES = new Obstacle("Space Pirates", "Hide yer booty.");
    public static final Obstacle CURIOSITY = new Obstacle("The Curiosity Rover", "Abandoned as a pup, it lives in the middle of nowhere.");
    public static final Obstacle POISONOUSPLANT = new Obstacle("A friendly plant", "Possibly has medicinal purposes.");
    public static final Obstacle SHIPDEFENSE = new Obstacle("Ship defense systems", "The automated defenses responsible for keeping the ship safe.");
    
    private String name;
    private Player player;
    private Scanner keyboard;
    private static Game game;
    
    
    public Game()
    {
        keyboard = new Scanner(System.in);
        
        if (player.equals("hammerer")) player = new Hammerer(0, 0, 0, name);
        else if (player.equals("gunslinger")) player = new Gunslinger(0, 0, 0, name);
        else if (player.equals("wielder")) player = new Wielder(0, 0, 0, name);
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
                break;
            }
            else if (selected.equals("gunslinger"))
            {
                type = "Gunslinger";
                break;
            }
            else if (selected.equals("wielder"))
            {
                type = "Wielder";
                break;
            }
            else
            {
                System.out.println("INVALID CHOICE, MORTAL.");
            }
        }
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
