//Vincent Ou, Joey Zeng, Anna Qu
//pd 9
//2013-11-18
//HW#26

public class Zombie extends Character{

    public Zombie(){
        super();
        health = 120;
        strength = (int)(45 * Math.random()) + 20;
        defense = 20;
        attack = 1;
    }
    
    public String about(){
            return "Undead creature ready to be killed.";
    }
}
