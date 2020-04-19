package com.company.Contest185;

import java.util.*;

public class Problem2 {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Set<String> tables = new TreeSet<>((a,b) -> Integer.parseInt(a) - Integer.parseInt(b));
        Set<String> dishesSet = new TreeSet<>();
        Map<String, Integer> dishes = new HashMap<>();
        for (List<String> order : orders) {
            String table = order.get(1);
            String dish = order.get(2);
            tables.add(table);
            dishesSet.add(dish);
            int count = dishes.getOrDefault(table + "#" + dish, 0);
            dishes.put(table + "#" + dish, count + 1);
        }

        List<List<String>> result = new ArrayList<>();
        List<String> first = new ArrayList<>();
        first.add("Table");
        result.add(first);
        for (String dish : dishesSet) first.add(dish);

        for (String table : tables) {
            List<String> res = new ArrayList<>();
            res.add(table);
            for (String dish : dishesSet) {
                int number = dishes.getOrDefault(table + "#" + dish, 0);
                res.add(Integer.toString(number));
            }

            result.add(res);
        }
        return result;
    }
}
