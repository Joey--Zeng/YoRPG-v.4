//Vincent Ou, Joey Zeng, Anna Qu
//pd 9
//2013-11-18
//HW#26

public class Pirate extends Character{
   
    public Pirate(){
        health = 100;
        strength = 115;
        defense = 25;
        attack = 0.4;
    }
    public Pirate(String x){
        this();
        name = x;
    }
    
    
  
    public String about(){
            return "A Pirate is a disciple of all greasy maritime legends, patrolling the seas with a trusty pistol.";
    }
    
}
