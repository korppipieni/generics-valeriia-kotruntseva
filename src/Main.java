import hero.*;
import weapon.Bow;
import weapon.Sword;
import weapon.Wand;

void main() {
    System.out.println("Задача 1");
    PairRunner.runStringIntegerExample();
    PairRunner.runIntegerStringExample();
    PairRunner.runIntegerDoubleExample();

    demonstrateHeroes();
}

private static void demonstrateHeroes() {
    System.out.println("Задача 2: Информация о героях и их оружии \n");

    Archer archer = new Archer("Леголас");
    archer.setWeapon(new Bow(10, "Длинный лук"));

    Mage mage = new Mage("Гэндальф");
    mage.setWeapon(new Wand(20, "Магическиц посох"));

    Warrior warrior = new Warrior("Арагорн");
    warrior.setWeapon(new Sword(15, "Андрил"));

    HeroInfoPrinter.printHeroInfo(archer);
    HeroInfoPrinter.printHeroInfo(mage);
    HeroInfoPrinter.printHeroInfo(warrior);

    System.out.println("\nЗадача 3: Демонстрация equipHero");
    Bow eliteBow = new Bow(25, "Эльфийский лук");
    Wand fireWand = new Wand(35, "Огненный посох");
    Sword ancientSword = new Sword(30, "Древний меч");

    HeroEquipment.equipHero(archer, eliteBow);
    HeroEquipment.equipHero(mage, fireWand);
    HeroEquipment.equipHero(warrior, ancientSword);

    System.out.println("\nИнформация после смены оружия");
    HeroInfoPrinter.printHeroInfo(archer);
    HeroInfoPrinter.printHeroInfo(mage);
    HeroInfoPrinter.printHeroInfo(warrior);
}