package org.system.design.products;

public class AudiSports extends Audi {

    public AudiSports() {
        setColor();
        setModelName();
        setNoOfGears();
    }

    @Override
    public void setColor() {
        this.color = "Green";
    }

    @Override
    public void setNoOfGears() {
        this.noOfGears = 6;
    }

    @Override
    public void setModelName() {
        this.modelName = "Sports Audi";
    }
}
