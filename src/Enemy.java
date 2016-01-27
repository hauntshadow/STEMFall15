public class Enemy extends Obstacle
{
    private int maxHealthVal;
    private int attackVal;
    private int defenseVal;
    private int currentHealthVal;
    private String name;
	private String description;
    
    public Enemy(int attackVal, int defenseVal,
        int currentHealthVal, String name)
	{
		super();
		this.attackVal = attackVal;
		this.defenseVal = defenseVal;
		this.currentHealthVal = currentHealthVal;
		this.name = name;
    }
    public int getMaxHealthVal()
    {
        return maxHealthVal;
    }
	public void setMaxHealthVal(int maxHealthVal) 
	{
		this.maxHealthVal = maxHealthVal;
	}
	public int getAttackVal() {
		return attackVal;
	}
	public void setAttackVal(int attackVal) {
		this.attackVal = attackVal;
	}
	public int getDefenseVal() {
		return defenseVal;
	}
	public void setDefenseVal(int defenseVal) {
		this.defenseVal = defenseVal;
	}
	public int getCurrentHealthVal()
	{
		return currentHealthVal;
	}
	public void setCurrentHealthVal(int currentHealthVal) {
		this.currentHealthVal = currentHealthVal;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
}
