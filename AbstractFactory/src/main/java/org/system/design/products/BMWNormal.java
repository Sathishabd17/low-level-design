package org.system.design.products;

public class BMWNormal extends BMW {

    public BMWNormal() {
        setColor();
        setModelName();
        setNoOfGears();
    }

    @Override
    public void setColor() {
        this.color = "White";
    }

    @Override
    public void setNoOfGears() {
        this.noOfGears = 6;
    }

    @Override
    public void setModelName() {
        this.modelName = "Normal BMW";
    }
}
