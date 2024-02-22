package org.system.design.products;

public class Car implements Vehicle {

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
        return "White";
    }

    @Override
    public Integer getSpeed() {
        return 120;
    }

    @Override
    public Double getPrice() {
        return 1000000.0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "gears=" + gears +
                ", color=" + getColor() +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                '}';
    }
}
