package org.system.design.products.factory;

import org.system.design.products.TwoWheeler;
import org.system.design.products.Vehicle;

public class TwoWheelerFactory extends ProductFactory {

    @Override
    public Vehicle createVehicle() {
        Vehicle tw = new TwoWheeler();
        tw.setGears(4);
        return tw;
    }
}
