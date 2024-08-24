package org.system.design.uber_ola.strategy;

import org.system.design.uber_ola.model.TripMetaData;

public class RatingBasedPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(TripMetaData tripMetaData) {
        double price = 0;
        if (tripMetaData.getRiderRating().getValue() >= 4) {
            System.out.println("RatingBasedPricingStrategy: Rider rating is " + tripMetaData.getRiderRating() +
                    " setting trip price " + 55.0);
            price = 55.0;
        } else  {
            System.out.println("RatingBasedPricingStrategy: Rider rating is " + tripMetaData.getRiderRating() +
                    " setting trip price " + 65.0);
            price = 65.0;
        }
        return price;
    }
}
