package org.system.design.products;

public class TwoWheeler implements Vehicle {

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
        return "Black";
    }

    @Override
    public Integer getSpeed() {
        return 80;
    }

    @Override
    public Double getPrice() {
        return 150000.0;
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "gears=" + gears +
                ", color=" + getColor() +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                '}';
    }
}
