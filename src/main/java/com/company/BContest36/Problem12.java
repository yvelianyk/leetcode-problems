package com.company.BContest36;

import java.util.*;

public class Problem12 {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<String>> timesMap = new HashMap<>();
        for (int i = 0; i < keyName.length; i++) {
            String name = keyName[i];
            List<String> times = timesMap.getOrDefault(name, new ArrayList<>());
            times.add(keyTime[i]);
            timesMap.put(name, times);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : timesMap.entrySet()) {
            if (checkAlert(entry.getValue())) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }

    private boolean checkAlert(List<String> times) {
        List<Integer> intTimes = new ArrayList<>();

        for (String time : times) {
            intTimes.add(toMinutes(time));
        }
        Collections.sort(intTimes);
        for (int i = 0; i < intTimes.size() - 2; i++) {
            int first = intTimes.get(i);
            int last = intTimes.get(i + 2);
            if (last - first <= 60) return true;
        }
        return false;
    }

    private int toMinutes(String hrmin) {
        String[] tokens = hrmin.split(":");
        int minutes = 0;
        for (int i = tokens.length; i > 0; i--) {
            int value = Integer.parseInt(tokens[i - 1]);
            if (i == 1) minutes += 60 * value;
            else minutes += value;
        }
        return minutes;
    }
}
