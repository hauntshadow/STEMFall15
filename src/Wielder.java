/**
  * Wilder Character
  *
  * @author Chase Costner
**/
public class Wielder extends NPC
{
  private int maxHealthVal;
	private int attackVal;
	private int defenseVal;
	private int currentHealthVal;
	private String name;

  public Wielder(int attackVal, int defenseVal, int currentHealthVal, String name)
  {
    super();
	this.maxHealthVal = currentHealthVal;
    this.attackVal = attackVal;
    this.defenseVal = defenseVal;
    this.currentHealthVal = currentHealthVal;
    this.name = name;
  }

	public int getMaxHealthVal() {
		return maxHealthVal;
	}

	public int getAttackVal() {
		return attackVal;
	}

	public int getDefenseVal() {
		return defenseVal;
	}

	public int getCurrentHealthVal() {
		return currentHealthVal;
	}

	public String getName() {
		return name;
	}

	public void setMaxHealthVal(int maxHealthVal) {
		this.maxHealthVal = maxHealthVal;
	}

	public void setAttackVal(int attackVal) {
		this.attackVal = attackVal;
	}

	public void setDefenseVal(int defenseVal) {
		this.defenseVal = defenseVal;
	}

	public void setCurrentHealthVal(int currentHealthVal) {
		this.currentHealthVal = currentHealthVal;
	}

	public void setName(String name) {
		this.name = name;
	}
}
