package weapon;

public class Wand implements MagicWeapon{
    private int damage;
    private String name;

    public Wand() {
        this.damage = 20;
        this.name = "Wand";
    }

    public Wand(int damage, String name) {
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
