package org.system.design;

public class Car {

    private String color;
    private Integer noOfGears;
    private String modelName;

    public Car(CarBuilder carBuilder) {
        this.color = carBuilder.color;
        this.noOfGears = carBuilder.noOfGears;
        this.modelName = carBuilder.modelName;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", noOfGears=" + noOfGears +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    public static class CarBuilder {

        private String color;
        private Integer noOfGears;
        private String modelName;

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setNoOfGears(Integer noOfGears) {
            this.noOfGears = noOfGears;
            return this;
        }

        public CarBuilder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
