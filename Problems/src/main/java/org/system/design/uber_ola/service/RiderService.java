package org.system.design.uber_ola.service;

import org.system.design.uber_ola.model.Driver;
import org.system.design.uber_ola.model.Rider;

import java.util.HashMap;
import java.util.Map;

public class RiderService {

    private static RiderService riderServiceInstance = null;

    private Map<String, Rider> ridersMap = new HashMap<>();

    private RiderService() {
    }

    public static synchronized RiderService getRiderServiceInstance() {
        if (riderServiceInstance == null) {
            riderServiceInstance = new RiderService();
        }
        return riderServiceInstance;
    }

    public void addRider(Rider rider) {
        ridersMap.put(rider.getName(), rider);
    }

    public void deleteRider(Rider rider) {
        ridersMap.remove(rider.getName());
    }

    public Rider getRider(String name) {
        return ridersMap.get(name);
    }

    public Map<String, Rider> getRidersMap() {
        return ridersMap;
    }
}
