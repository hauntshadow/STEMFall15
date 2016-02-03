public class Obstacle
{
    private String description;
    private String name;

    public Obstacle()
    {
        this.name = "undetermined";
        this.description = "undetermined";
    }

    public Obstacle(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
