package org.system.design.products;

public class Auto implements Vehicle {

    private int gears;

    @Override
    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public Integer getGears() {
        return this.gears;
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public Integer getSpeed() {
        return 100;
    }

    @Override
    public Double getPrice() {
        return 500000.0;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "gears=" + gears +
                ", color=" + getColor() +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                '}';
    }
}
