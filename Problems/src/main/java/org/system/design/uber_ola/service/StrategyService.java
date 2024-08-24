package org.system.design.uber_ola.service;

import org.system.design.uber_ola.model.TripMetaData;
import org.system.design.uber_ola.strategy.DefaultDriverMatchingStrategy;
import org.system.design.uber_ola.strategy.DriverMatchingStrategy;
import org.system.design.uber_ola.strategy.PricingStrategy;
import org.system.design.uber_ola.strategy.RatingBasedPricingStrategy;

public class StrategyService {

    private static StrategyService strategyServiceInstance = null;

    private StrategyService() {
    }

    public static synchronized StrategyService getStrategyServiceInstance() {
        if (strategyServiceInstance == null) {
            strategyServiceInstance = new StrategyService();
        }
        return strategyServiceInstance;
    }

    public PricingStrategy determinePricingStrategy(TripMetaData tripMetaData) {
        System.out.println("Based on location and other factors, setting pricing strategy");
        return new RatingBasedPricingStrategy();
    }

    public DriverMatchingStrategy determineDriverMatchingStrategy(TripMetaData tripMetaData) {
        System.out.println("Based on location and other factors, setting driver matching strategy");
        return new DefaultDriverMatchingStrategy();
    }
}
