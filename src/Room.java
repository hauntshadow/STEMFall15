import java.util.LinkedList;

public class Room
{
  private String id;
  private String description;
  private Obstacle obstacle;
  private Item[] items;
  private LinkedList<Room> adjRooms;

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Obstacle getObstacles() {
		return obstacle;
	}

	public Item[] getItems() {
		return items;
	}
	
	public LinkedList<Room> getAdjRooms()
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

	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public void setAdjRooms(LinkedList<Room> adjRooms)
	{
		this.adjRooms = adjRooms;
	}
}
