package com.company.Contest173;

import java.util.*;

public class Problem2 {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, int[]> filtered = new HashMap<>();

        for (int i = 0; i < restaurants.length; i++) {
            int[] restaurant = restaurants[i];
            if (veganFriendly == 1) {
                if (restaurant[2] == 1 && restaurant[3] <= maxPrice && restaurant[4] <= maxDistance) {
                    result.add(restaurant[0]);
                    filtered.put(restaurant[0], restaurant);
                }
            } else if (restaurant[3] <= maxPrice && restaurant[4] <= maxDistance) {
                result.add(restaurant[0]);
                filtered.put(restaurant[0], restaurant);
            }
        }

        Collections.sort(result, new SortRests(filtered));

        return result;

    }

    class SortRests implements Comparator<Integer> {
        private Map<Integer, int[]> filtered;

        public SortRests(Map<Integer, int[]> filtered) {
            this.filtered = filtered;
        }

        @Override
        public int compare(Integer f, Integer s) {
            int[] a = filtered.get(f);
            int[] b = filtered.get(s);
            if (b[1] == a[1]) {
                return b[0] - a[0];
            } else {
                return b[1] - a[1];
            }
        }
    }
}
