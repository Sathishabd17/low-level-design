package org.system.design.products.factory;

import org.system.design.products.Auto;
import org.system.design.products.Vehicle;

public class AutoFactory extends ProductFactory {

    @Override
    public Vehicle createVehicle() {
        Auto auto = new Auto();
        auto.setGears(5);
        return auto;
    }
}
