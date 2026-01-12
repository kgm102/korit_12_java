package ch14_casting.game;

import ch14_casting.game.items.*;
import ch14_casting.game.system.Inventory;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory(10);

        inventory.addWeapon(new Sword());
        inventory.addWeapon(new Staff());
        inventory.addWeapon(new Bow());
        inventory.addWeapon(new Sword());
        inventory.addWeapon(new Axe());
//        inventory.deleteWeapon("Sword");
        inventory.showInfo();

        System.out.println("====전체공격====");
        inventory.attackAll();

        System.out.println("====특수 기술====");
        inventory.useSpecialAbilities();


    }
}
