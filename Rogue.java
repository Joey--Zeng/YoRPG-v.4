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
  

  
  public String about(){
	  return "A Rogue is a speedy fighter who can reliably deal and avoid damage, but is easily killed.";
  }
  
}
