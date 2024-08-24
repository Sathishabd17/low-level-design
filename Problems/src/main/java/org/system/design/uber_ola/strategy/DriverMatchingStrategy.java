package org.system.design.uber_ola.strategy;

import org.system.design.uber_ola.model.Driver;
import org.system.design.uber_ola.model.TripMetaData;

public interface DriverMatchingStrategy {

    public Driver matchDriver(TripMetaData tripMetaData);
}
