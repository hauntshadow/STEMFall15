public class Character
{
	abstract int maxHealthVal;
	abstract int attackVal;
	abstract int defenseVal;
	abstract int currentHealthVal;
	abstract String name;
	
	abstract void getMaxHealthVal();
	abstract void setMaxHealthVal(int maxHealthVal);
	abstract int getAttackVal();
	abstract void setAttackVal(int attackVal);
	abstract int getDefenseVal();
	abstract void setDefenseVal(int defenseVal);
	abstract int getCurrentHealthVal();
	abstract void setCurrentHealthVal(int currentHealthVal);
	abstract String getName();
	abstract void setName(String name);
	abstract void decreaseCurrH(int damage);
	abstract void increaseMaxH(int increase);
}
