//Vincent Ou
//pd 9
//2013-11-14
//HW#25

public class Monster extends Character{

    public Monster(){
	super();
	health = 150;
	strength = (int)(45 * Math.random()) + 20;
	defense = 20;
	attack = 1;
    }
}
