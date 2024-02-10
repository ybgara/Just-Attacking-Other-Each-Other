package gara.hero;

import gara.weapons.*;

public class Hero {

  private String name ;
  private Double health ;
  private String role ;

  Hero hero ;
  Weapon weapon ;

  
  // CONSTRUCTOR
  public Hero(String name, double health, String role){
    this.name = name ;
    this.health = health ;
    this.role = role ; 
  };

  // EQUIP WEAPON
  public void equipWeapon(Weapon weapon){
    this.weapon = weapon ;
  };
  
  // DISPLAY
  public void display(){
    System.out.println(" Hero\t: " + this.name);
    System.out.println(" Health\t: " + this.health);
    this.weapon.display();
  }

  // ATTACK OTHERS
  public void attackHero(Hero enemy){
    System.out.println("==================================");
    this.hero = enemy ;
    
    System.out.println(" Attack Time ! ");
    System.out.println( " " + this.name + " [" + this.role + "] " + " Attacking " + " [" + enemy.getRole() + "] "  + enemy.name);
    System.out.println( " " + this.weapon.getPower() + " Attacking " + enemy.getHealth() );
    
    defence(enemy);
  }
  
  // DEFENCE FROM OTHERS
  public void defence(Hero enemy){
    System.out.println();
    System.out.println(" Defence Time ! ");
    System.out.println( " " + enemy.getHealth() + " Take Damage " + this.weapon.getPower());
    
    double damage ;
    damage = enemy.health - this.weapon.getPower();
    
    enemy.setHealth(damage);
    System.out.println("==================================");
  }

  // SETTER
  public void setName(String name) {
    this.name = name;
  }

  public void setHealth(Double health) {
    this.health = health;
  }

  public void setRole(String role) {
    this.role = role;
  }


  // GETTER  
  public String getName() {
    return name;
  }
  
  public Double getHealth() {
    return health;
  }

  public String getRole() {
    return role;
  }

}
