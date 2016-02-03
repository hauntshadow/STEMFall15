import java.util.Random;
public class Passive extends NPC
{
    int maxHealthVal;
    int attackVal;
    int defenseVal;
    int currentHealthVal;
    String name;
    
    
    public Passive(int maxHealthVal, int attackVal, int defenseVal,
        int currentHealthVal, String name)
    {
        super(maxHealthVal, attackVal, defenseVal, currentHealthVal, name);
        this.attackVal = attackVal;
        this.defenseVal = defenseVal;
        this.currentHealthVal = currentHealthVal;
        this.name = name;
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
    Random rando = new Random();
    public enum PassiveCharacters
    {
        
    }
    public static void main (String[] args)
    {
    
    }
}