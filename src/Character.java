public abstract class Character
{
	int maxHealthVal;
	int attackVal;
	int defenseVal;
	int currentHealthVal;
	String name;
	
	public int getMaxHealthVal()
    {
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
    
    public void increaseMaxH(int health)
    {
        maxHealthVal += health;
    }
    
    public void decreaseCurrH(int health)
    {
        currentHealthVal -= health;
    }
}
