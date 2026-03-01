package hero;

import weapon.Weapon;

public class HeroInfoPrinter {
    public static void printHeroInfo(Hero<? extends Weapon> hero) {
        Weapon weapon = hero.getWeapon();

        System.out.println("Герой: " + hero);
        System.out.println("Имя героя: " + hero.getName());
        System.out.println("Оружие: " + weapon.getName());
        System.out.println("Урон: " + weapon.getDamage());
        System.out.println();
    }
}
