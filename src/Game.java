import java.util.Scanner;

/**
 * Launcher for the entire game.
 */
public class Game
{
    private Player player;
    private Scanner keyboard;
    
    public Game()
    {
        keyboard = new Scanner(System.in);
        
        if (player.equals("hammerer")) player = new Hammerer();
        else if (player.equals("gunslinger")) player = new Gunslinger();
        else if (player.equals("wielder")) player = new Wielder();
        else System.out.println("Please pick one of the three classes");
        
    }
    
    public static void main(String[] args)
    {
        Game game = new Game();
        game.startGame();
        
        //playgame(keyboard);
    }
    
    public void startGame()
    {
        String name = game.getUserName();
        String createPlayer = game.createPlayer();
    }
    
    public void playGame()
    {
        int level = 0;
        
        
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
        //Weapons
        Item crowbar = new Item("Crowbar", "For bashing skulls and/or opening doors."),
        Item hammer = new Item("Hammer","For hammering skulls and/or prying open doors."),
        Item raygun = new Item("Raygun", "For blasting skulls and/or opening doors maybe?."), 
        Item flightSuit = new Item("Flight Suit","The standard attire for a true space explorer."),
        Item spaceSuit = new Item("Space Suit", "Can withstand the harshest of envoronments."),
        Item metalPlating = new Item("Metal Plating", "Strong metal plating used to shield the hull."),
        //Progression Items
        Item oxygen = new Item("Oxygen Tank","You can breath this."),
        Item bike = new Item("Space Bike", "Used to cross large distances."),
        Item shoes = new Item("Galactic Shoes","Used to reach greater heights."),
        //Life and health
        Item medkit = new Item("Medkit", "You can use this to heal yourself."),
        Item pizza = new Item("Mars Pizza","Delicious pizza! Grown and cooked on Mars."),
        Item foodBar = new Item("Martian Bar","A tasty treat that will also restore some health.")
    };

    /**
     * Obstacles that occur during the game.
     */
    public enum Obstacles
    {
        Obstacle bats = new Obstacle("Bats", "A swarm of bats attacks!"),
        Obstacle pitfall = new Obstacle("Pitfall", "A pit that you fall into."),
        Obstacle rockSlide = new Obstacle("Rock Slide", "A slide of rocks!"),
        Obstacle acidPuddle = new Obstacle(),
        Obstacle androids = new Obstacle(),
        Obstacle siren = new Obstacle(),
        Obstacle pirates = new Obstacle(),
        Obstacle curiosity = new Obstacle(),
        Obstacle poisonousPlant = new Obstacle(),
        Obstacle shipDefense = new Obstacle()
    };
}
