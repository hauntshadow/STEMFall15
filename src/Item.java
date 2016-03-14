public class Item
{
    private String name;
    private String description;

    public Item()
    {
        this.name = "undetermined";
        this.description = "undetermined";
    }
    
    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    public boolean equals(String x)
    {
        if (getName() == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
