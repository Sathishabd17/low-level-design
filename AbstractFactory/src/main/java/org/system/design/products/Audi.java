package org.system.design.products;

public abstract class Audi implements Car {
    protected String color;
    protected Integer noOfGears;
    protected String modelName;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getNoOfGears() {
        return noOfGears;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "color='" + color + '\'' +
                ", noOfGears=" + noOfGears +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
