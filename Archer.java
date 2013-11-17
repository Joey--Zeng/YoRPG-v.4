//Vincent Ou, Joey Zeng, Anna Qu
//pd 9
//2013-11-18
//HW#26

public class Archer extends Character{
   
    public Archer(){
        health = 100;
        strength = 80;
        defense = 75;
        attack = 0.4;
    }
    public Archer(String x){
        this();
        name = x;
    }
    
    
  
    public String about(){
            return "An Archer is the master of the bow and arrow, deftly avoiding close combat.";
    }
    
}
