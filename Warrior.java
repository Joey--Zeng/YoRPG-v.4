//Vincent Ou
//pd 9
//2013-11-14
//HW#25

public class Warrior extends Character{
   
    public Warrior(){
	health = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }
    public Warrior(String x){
	this();
	name = x;
    } 
}
