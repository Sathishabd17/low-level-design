package org.system.design.uber_ola.service;

import org.system.design.uber_ola.model.Driver;

import java.util.HashMap;
import java.util.Map;

public class DriverService {

    private static DriverService driverServiceInstance = null;

    private Map<String, Driver> driversMap = new HashMap<>();

    private DriverService() {

    }

    public static synchronized DriverService getDriverService() {
        if (driverServiceInstance == null) {
            driverServiceInstance = new DriverService();
        }
        return driverServiceInstance;
    }

    public void addDriver(Driver driver) {
        driversMap.put(driver.getName(), driver);
    }

    public void deleteDriver(Driver driver) {
        driversMap.remove(driver.getName());
    }

    public Driver getDriver(String name) {
        return driversMap.get(name);
    }

    public Map<String, Driver> getDriversMap() {
        return driversMap;
    }
}
