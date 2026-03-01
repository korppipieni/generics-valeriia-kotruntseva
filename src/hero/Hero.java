package hero;
import weapon.Weapon;

public abstract class Hero <T extends Weapon>{
    private T weapon;
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + name + "}";
    }
}
