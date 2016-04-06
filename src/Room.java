public class Room
{
  private String id;
  private String description;
  private Obstacle obstacle;
  private Item items;
  private Room[] adjRooms;
    
    public Room(String s, String s2, Room[] adj)
    {
        id = s;
        description = s2;
        obstacle = null;
        items = null;
        adjRooms = adj;
    }
    public Room(String s, String s2, Obstacle o, Item i, Room[] adj)
    {
       id = s;
       description = s2;
       obstacle = o;
       items = i;
       adjRooms = adj;
    }
    public Room(String s, String s2, Obstacle o, Room[] adj)
    {
        id = s;
        description = s2;
        obstacle = o;
        items = null;
        adjRooms = adj;
    }
    public Room(String s, String s2, Item i, Room[] adj)
    {
        id = s;
        description = s2;
        obstacle = null;
        items = i;
        adjRooms = adj;
    }
	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Obstacle getObstacles() {
		return obstacle;
	}

	public Item getItems() {
		return items;
	}
	
	public Room[] getAdjRooms()
	{
		return adjRooms;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setObstacle(Obstacle obstacle) {
		this.obstacle= obstacle;
	}

	public void setItems(Item items) {
		this.items = items;
	}
	
	public void setAdjRooms(Room[] adjRooms)
	{
		this.adjRooms = adjRooms;
	}
}
