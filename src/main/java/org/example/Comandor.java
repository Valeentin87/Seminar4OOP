package org.example;

public class Comandor extends Warrior<Weapon>{
    public Comandor(String name, int healthpoint, Weapon weapon) {
        super(name, healthpoint, weapon);
    }

    @Override
    public String toString() {
        return "Командир: "+ super.toString();
    }
}
