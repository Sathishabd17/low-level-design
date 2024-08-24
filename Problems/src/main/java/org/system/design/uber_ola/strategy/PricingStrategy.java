package org.system.design.uber_ola.strategy;

import org.system.design.uber_ola.model.TripMetaData;

public interface PricingStrategy {

    public double calculatePrice(TripMetaData tripMetaData);
}
