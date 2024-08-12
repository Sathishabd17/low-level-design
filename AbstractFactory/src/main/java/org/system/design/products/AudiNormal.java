package org.system.design.products;

public class AudiNormal extends Audi {
    public AudiNormal() {
        setColor();
        setModelName();
        setNoOfGears();
    }

    @Override
    public void setColor() {
        this.color = "Blue";
    }

    @Override
    public void setNoOfGears() {
        this.noOfGears = 5;
    }

    @Override
    public void setModelName() {
        this.modelName = "Normal Audi";
    }
}
