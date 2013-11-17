//Vincent Ou, Joey Zeng, Anna Qu
//pd 9
//2013-11-18
//HW#26

public abstract class Character {
    protected String name;
    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;
    protected boolean isSpecialized;
    
    public Character(){
	name = "Bob";
	health = 125;
	strength = 100;
	defense = 40;
	attack = .4;
    }
    public boolean isAlive(){
	return health > 0;
    }
    public int getDefense(){
	return defense;
    }
    public void lowerHP( int x){
	health = health - x;
    }
    public int attack (Character name){
	int damage = 0;
	damage = (int)((strength * attack) - name.getDefense());
	if (damage < 0){
	    damage = 0;
	}
	name.lowerHP(damage);
	return damage;
    }
    public void specialize(){
    	if (!isSpecialized){
    		attack *=2;
    		defense /=2;
    	}
    	isSpecialized = true;
    }
    public void normalize(){
	if(isSpecialized){
		attack /=2;
		defense *=2;
	}
	isSpecialized = false;
    }
	
    public String getName(){
	return name;
    }
    abstract String about();


}
