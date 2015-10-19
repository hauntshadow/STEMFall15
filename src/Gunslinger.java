public class Gunslinger extends Player
{
	private int maxHealthVal;
	private int attackVal;
	private int defenseVal; 
	private int currentHealthVal;
	public Gunsilinger()
	{
		setHealthVal(24);
		setAttackVal(14);
		setDefenseVal(8);
		setCurrentHealthVal(24);
		setName("Gunslingo");
	}
	public Gunslinger(int w, x, y, z, String a)
	{
		super();
		setHealthVal(w);
		setAttackVal(x);
		setDefenseVal(y);
		setCurrentHealthVal(z);
		setName(a);
	}
		public int getMaxHealthVal()
	{
		return maxHealthVal;
	}
	public void setHealthVal(int maxHealthVal) {
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
	public static void main(String[] args) 
	{
			
	}
	
}