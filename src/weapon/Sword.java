package weapon;

public class Sword implements MeleeWeapon{
    private int damage;
    private String name;

    public Sword() {
        this.damage = 15;
        this.name = "Sword";
    }

    public Sword(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return name;
    }
}
