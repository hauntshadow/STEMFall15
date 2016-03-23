import java.util.*;
public class Level
{
  private Item[] items;
  private Obstacle[] obstacles;
  private Room[] rooms;
  private String destination;
  private int current;
  
  public Level(Room[] rooms, Item[] items, Obstacle[] obstacles, String destination)
  {
      this.rooms = rooms;
      this.items = items;
      this.obstacles = obstacles;
      current = 0;
      this.destination = destination;
      
      putObstaclesInRooms(this.obstacles, this.rooms);
      putItemsInRooms(this.items, this.rooms);
  }
  
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
    	rooms[i].setItems(item);
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
	
	public ArrayList<String> findItem(Item item)
	{
		ArrayList<String> foo = new ArrayList<String>();
		for(int i = 0; i < rooms.length; i++ )
		{
		    if(item.equals(rooms[i].getItems()))
		    {
		        foo.add(rooms[i].getId());
			}
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
	
	public void moveCurrentRoom(int index)
	{
	    Room room = getAvailableRooms(current).get(index);
	    
	    for (int i = 0; i < rooms.length; i++)
	    {
	        if (room == rooms[i])
	        {
	            current = i;
	            break;
	        }
	    }
	}
}
