package org.system.design.uber_ola.strategy;

import org.system.design.uber_ola.model.TripMetaData;

public class DefaultPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(TripMetaData tripMetaData) {
        System.out.println("DefaultPricingStrategy: Setting default price 100");
        return 100.0;
    }
}
