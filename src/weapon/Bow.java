package weapon;

public class Bow implements RangeWeapon{
    private int damage;
    private String name;

    public Bow() {
        this.damage = 10;
        this.name = "Bow";
    }

    public Bow(int damage, String name) {
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
