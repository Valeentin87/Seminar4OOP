package org.example;

public class Archer extends Warrior<Bow>{
     public Archer(String name, int healthpoint, Bow bow) {
        super(name, healthpoint, bow);
    }

    @Override
    public String toString() {
        return "Лучник: "+super.toString();
    }
}
