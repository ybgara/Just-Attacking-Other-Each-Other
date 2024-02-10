package gara.main;

import gara.hero.*;
import gara.weapons.*;

public class Main {
  public static void main(String[] args) {

    System.out.println("===================================");
    System.out.println();

      HeroMage mage = new HeroMage("Atsuya", 75d, "Mage");
      HeroTank tank = new HeroTank("Shiriyu", 150d, "Tank");
      HeroWarrior warrior = new HeroWarrior("Dante", 100d, "Warrior");

      WeaponMage book = new WeaponMage("Book", 75);
      WeaponTank shield = new WeaponTank("Shield", 25);
      WeaponWarrior sword = new WeaponWarrior("Sword", 50);
      
      mage.equipWeapon(book);
      tank.equipWeapon(shield);
      warrior.equipWeapon(sword);
      
      mage.display();
      tank.display();
      warrior.display();
      
      mage.attackHero(tank);
      tank.attackHero(mage);
      warrior.attackHero(tank);
      
      mage.display();
      tank.display();
      warrior.display();
      
    
    System.out.println();
    System.out.println("===================================");
  
  }
}
