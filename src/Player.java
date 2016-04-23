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
        this.maxHealthVal = currentHealthVal;
        this.name = name;
        inventory = new ArrayList<Item>();
    }
    
    public int getMaxHealthVal()
    {
        return maxHealthVal;
    }

    public void setMaxHealthVal(int maxHealthVal)
    {
        this.maxHealthVal = maxHealthVal;
    }

    public int getAttackVal()
    {
        return attackVal;
    }

    public void setAttackVal(int attackVal)
    {
        this.attackVal = attackVal;
    }

    public int getDefenseVal()
    {
        return defenseVal;
    }

    public void setDefenseVal(int defenseVal)
    {
        this.defenseVal = defenseVal;
    }

    public int getCurrentHealthVal()
    {
        return currentHealthVal;
    }

    public ArrayList<Item> getInventory()
    {
        return inventory;
    }
    
    public void addToInventory(Item i)
    {
        System.out.println(i.getName() + " added to bag.");
        inventory.add(i);
    }
    
    public void displayInventory()
    {
        for (int i = 0; i < inventory.size(); i++)
        {
            System.out.println("Slot " + i + ": " + inventory.get(i).getName()
                + ": " + inventory.get(i).getDescription());
        }
    }
    
    public void use(int i)
    {
        if (i > 0 && i < inventory.size())
        {
            Item item = inventory.get(i);
            inventory.remove(item);
            if(item == ActualRooms.MEDKIT)
            {
            	setCurrentHealth(currentHealthVal + 5);
            }
            else if(item == ActualRooms.PIZZA)
            {
            	setCurrentHealth(currentHealthVal + 10);
            }
            else if(item == ActualRooms.FOODBAR)
            {
            	setCurrentHealth(currentHealthVal + 15);
            }
            else if(item == ActualRooms.WATER)
            {
            	setCurrentHealth(currentHealthVal + 20);
            }
        }
        else
        {
        	System.out.println("Invalid item choice.");
        }
    }

    private void setCurrentHealth(int i) {
		if(i > maxHealthVal)
		{
			currentHealthVal = maxHealthVal;
		}
		else
		{
			currentHealthVal = i;
		}
	}

	public boolean has(Item item)
    {
        boolean found = false;
        for (Item i : inventory)
        {
            if (i.equals(item))
            {
                found = true;
            }
        }
        return found;
    }
}
