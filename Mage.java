//Vincent Ou
//pd 9
//2013-11-14
//HW#25

public class Mage extends Character{
    String name = "Bob";
    public Mage(){
	health = 100;
	strength = 150;
	defense = 25;
	attack = 0.6;
    }
    public Mage(String x){
	this();
	name = x;
    }
    
    public String about(){
    	return "A Mage is an intellectual being that casts spells and places wards";
    }
}
