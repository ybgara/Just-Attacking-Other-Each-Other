package gara.weapons;

public class Weapon {
  private String name  ;
  private double power ;
  
  public Weapon(String name, double power){
    this.name = name ;
    this.power = power;
  }

  // DISPLAY
  public void display(){
    System.out.println(" Weapon\t: " + this.name);
    System.out.println(" Power\t: " + this.power);
  }
  public void setName(String name) {
    this.name = name;
  }

  public void setPower(double power) {
    this.power = power;
  }

  public String getName() {
    return name;
  }

  public double getPower() {
    return power;
  }
  
}
