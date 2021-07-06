package com.company.Contest182;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {

    private Map<Integer, StationInfo> checkInMap;
    private Map<String, Double> avarageMap;
    private Map<String, Integer> tripsMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        avarageMap = new HashMap<>();
        tripsMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new StationInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        StationInfo info = checkInMap.get(id);
        String key = info.name + stationName;
        if (tripsMap.containsKey(key)) {
            double curr = avarageMap.get(key);
            int trips = tripsMap.get(key);
            double sum = curr + t - info.time;
            avarageMap.put(key, sum);
            tripsMap.put(key, trips + 1);
        } else {
            tripsMap.put(key, 1);
            avarageMap.put(key, t - info.time);
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + endStation;
        double sum = avarageMap.get(key);
        int trips = tripsMap.get(key);
        return sum / trips;
    }

    private class StationInfo {
        double time;
        String name;
        StationInfo(String name, double t) {
            this.time = t;
            this.name = name;
        }
    }
}
