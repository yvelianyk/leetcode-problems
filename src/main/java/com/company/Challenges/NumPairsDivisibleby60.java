package com.company.Challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumPairsDivisibleby60 {
    public int numPairsDivisibleBy60(int[] time) {
       // create map with values
       Map<Integer, Integer > counter = new HashMap<>();
       int result = 0;
       for (int i = 0; i < time.length; i++) {
           int timeI = time[i] % 60;
           if (timeI == 0) {
              result += counter.getOrDefault(timeI, 0);
           } else {
               result += counter.getOrDefault(60 - timeI, 0);
           }
          counter.put(timeI, counter.getOrDefault(timeI, 0) + 1);
       }
       return result;
    }
}
