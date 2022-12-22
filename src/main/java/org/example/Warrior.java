package org.example;

public abstract class Warrior <T extends Weapon>  {
    private  String name;
    private int healthpoint;
    private T weapon;

    @Override
    public String toString() {
        return String.format("name: %s, здоровье: %d, вооружен: %s", name,healthpoint,weapon.toString());
    }

    public Warrior(String name, int healthpoint, T weapon) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
