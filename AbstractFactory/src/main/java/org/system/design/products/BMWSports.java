package org.system.design.products;

public class BMWSports extends BMW {

    public BMWSports() {
        setColor();
        setModelName();
        setNoOfGears();
    }

    @Override
    public void setColor() {
        this.color = "Yellow";
    }

    @Override
    public void setNoOfGears() {
        this.noOfGears = 8;
    }

    @Override
    public void setModelName() {
        this.modelName = "Sports BMW";
    }
}
