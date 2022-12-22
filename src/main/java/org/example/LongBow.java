package org.example;

public class LongBow extends Bow {

    @Override
    public int range() {
        return 100;
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return "Большой лук: "+super.toString();
    }
}
