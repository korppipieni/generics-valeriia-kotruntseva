package hero;

import weapon.Weapon;

public class HeroEquipment {
    public static <T extends Weapon> void equipHero(Hero<? super T> hero, T weapon) {
        Hero<T> typedHero = (Hero<T>) hero;
        typedHero.setWeapon(weapon);
        System.out.println("Герой " + hero.getName() + " экипирован оружием " + weapon.getName());
    }
}
