//
//
//
//



public class Rogue extends Character{
  
  public Rogue(){
      name = "asd";
      health = 40;
      strength = 80;
      defense = 100;
      attack = 1.8;
  }

  public Rogue(String a){
      this();
      name = a;
  }
  
  public void specialize(){
      attack = 3.2;
      defense = 50;
  }
  
  public void normalize(){
      attack = 1.8;
      defense = 100;
  }
  
 
  
}
