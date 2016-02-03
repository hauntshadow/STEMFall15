import java.util.Scanner;

public class Game
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Game game = new Game();

    String name = game.getUserName(keyboard);
    String createPlayer = game.createPlayer(keyboard);
    System.out.println("Hi");
  }

  public String createPlayer(Scanner keyboard)
  {
    System.out.println("What type of character would you like to be?");
    String type;
    String selected;

    while(true)
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
  public String getUserName(Scanner keyboard)
  {
    System.out.print("Enter your name: ");
    return keyboard.nextLine();
  }
}
