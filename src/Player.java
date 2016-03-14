import java.util.ArrayList;
public abstract class Player extends Character
{
    private int maxHealthVal;
    private int attackVal;
    private int defenseVal;
    private int currentHealthVal;
    private String name;
    private ArrayList<Item> inventory;

    public Player(int attackVal, int defenseVal,
        int currentHealthVal, String name)
    {
        super();
        this.attackVal = attackVal;
        this.defenseVal = defenseVal;
        this.currentHealthVal = currentHealthVal;
        this.name = name;
        inventory = new ArrayList<Item>();
    }
    
    public ArrayList<Item> getInventory()
    {
        return inventory;
    }
}
