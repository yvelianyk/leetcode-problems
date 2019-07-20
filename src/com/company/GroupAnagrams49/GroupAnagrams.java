package com.company.GroupAnagrams49;

import com.company.LinkedListCycleII142.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map, List> result = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            Map map = getMap(str);
            if (result.containsKey(map)) {
                List list = result.get(map);
                list.add(str);
                result.put(map, list);
            } else {
                List list = new ArrayList();
                list.add(str);
                result.put(map, list);
            }
        }

        List<List<String>> resultList = new ArrayList<>();

        for (List value : result.values()) {
            resultList.add(value);
        }

        return resultList;
    }

    private Map<Character, Integer> getMap(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (map.containsKey(aChar)) {
                int count = map.get(aChar);
                map.put(aChar, count + 1);
            } else {
                map.put(aChar, 1);
            }
        }
        return map;
    }
}
