package ch14_casting.game.system;

import ch14_casting.game.items.*;       // * 의 발음은 애스터리스크(asterisk라고 하고, all의 의미를 가집니다.)

public class Inventory {

    private Weapon[] weaponSlots;

    public Inventory(int size){
        weaponSlots = new Weapon[size];
    }

    public void addWeapon(Weapon weapon){
        for(int i = 0; i < weaponSlots.length; i++){
            if(weaponSlots[i] == null){
                weaponSlots[i] = weapon;
                return;
            }
        }
        System.out.println("인벤토리가 가득 찼습니다.");
    }

    public void attackAll(){
        for(Weapon weapon : weaponSlots){
            if(weapon != null){
                weapon.attack();
            }
        }
    }

    public void useSpecialAbilities(){
        for(Weapon weapon : weaponSlots){
            if(weapon == null) continue;

            if(weapon instanceof Sword){
                Sword sword = (Sword) weapon;
                sword.parry();
            } else if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                bow.snipe();
            } else if (weapon instanceof Staff) {
                Staff staff = (Staff) weapon;
                staff.castSpell();
            } else if (weapon instanceof Axe) {
                Axe axe = (Axe) weapon;
                axe.smash();
            } else {
                System.out.println("알 수 없는 무기입니다.");
            }
        }

    }

    public void deleteWeapon(int index) {
        weaponSlots[index] = null;
    }

    public void deleteWeapon(String device){
        for (int i = 0; i < weaponSlots.length; i++){
            if(weaponSlots[i] != null && weaponSlots[i].getClass().getSimpleName().equals(device)){
                weaponSlots[i] = null;
            }
        }
    }

    public void showInfo() {
        int i = 0;
        for ( Weapon weapon : weaponSlots ) {
            if(weapon == null) {
                System.out.println("슬롯 [ " + ++i + " ] 번 : Empty" );
                continue;
            }
            System.out.println("슬롯 [ " + ++i + " ] 번 : " + weapon.getClass().getSimpleName());
        }
    }

}
