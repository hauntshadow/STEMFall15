import java.util.*;
public class Level
{
  private Item[] items;
  private Obstacle[] obstacles;
  private Room[] rooms;
  private String destination;
  private int current;
	
  public void putObstaclesInRooms(Obstacle[] obstacles, Room[] rooms)
  {
 	 Random rnd = new Random();
	
  	for (Obstacle obstacle: obstacles)
  	{
    	int i = rnd.nextInt(rooms.length - 1) + 1;
    	rooms[i].setObstacle(obstacle);
  	}
  }

  public void putItemsInRooms(Item[] items, Room[] rooms)
  {
 	 Random rnd = new Random();

  	for (Item item: items)
  	{
    	int i = rnd.nextInt(rooms.length - 1) + 1;
    	rooms[i].setItems(items);
  	}
  }
	
	public Room[] getRoom() {
		return rooms;
	}
	

	public String getDestination() {
		return destination;
	}

	public int getCurrent() {
		return current;
	}

	public void setRoom(Room[] rooms) {
		this.rooms = rooms;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
	
	public ArrayList<Integer> findItem(Item item)
	{
		ArrayList<Integer> foo = new ArrayList<Integer>();
		for(int i = 0; i < rooms.length; i++ )
		{
			//if(item.getName() == rooms[i].getItems().getName())
			//{
			//	foo.add(rooms[i].getId());
			//}
		}
		return foo;
	}
	
    public ArrayList<Room> obstacleRooms(Room[] rooms)
 	{
 	 	ArrayList<Room> obstacleRooms = new ArrayList<Room>();
  		for (Room r: rooms)
   	 		if (r.getObstacles() != null)
      			obstacleRooms.add(r);
  		return obstacleRooms;
	}

    public ArrayList<Room> itemRooms(Room[] rooms)
	{
  		ArrayList<Room> itemRooms = new ArrayList<Room>();
  		for (Room r: rooms)
    		if (r.getItems() != null)
      			itemRooms.add(r);
  		return itemRooms;
	}
    public LinkedList<Room> getAvailableRooms(int current)
	{
		return rooms[current].getAdjRooms();
	}
	
	public void moveCuurentRoom(int current, Room newRoom)
	{
	
	}
	
}
