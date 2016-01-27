public class NPC extends Character
{
    int maxHealthVal;
    int attackVal;
    int defenseVal;
    int currentHealthVal;
    String name;

    public NPC(int w, int x, int y, int z,String a)
    {
        super();
        setHealthVal(w);
        setAttackVal(x);
        setDefenseVal(y);
        setCurrentHealthVal(z);
        setName(a);

    }

    public int getHealthVal()
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
}