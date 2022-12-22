package org.example;

public class Sekira extends Axe {

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Секира наносит урон: %d ",damage());
    }
}
