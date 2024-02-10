package gara.hero;


public class HeroMage extends Hero {
  private String role = "Mage" ;

  public HeroMage(String name, Double health, String role){
    super(name, health, role);
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    super.display();
    System.out.println(" Role \t: " + role + "\n");
  }


  
}
