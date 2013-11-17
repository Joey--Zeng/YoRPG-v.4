//Vincent Ou
//pd 9
//2013-11-14
//HW#25

public abstract class Character {
    protected String name;
    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;
    
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
	attack = .75;
	defense = 20;
    }
    public void normalize(){
	attack = .4;
	defense = 40;
    }
    public String getName(){
	return name;
    }
    public static String about(){
	return "A Warrior is a mighty warrior that swings his sword. \n A Mage is an intellectual being that casts spells and places wards";
    }
}
