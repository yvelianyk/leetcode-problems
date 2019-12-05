package com.company.ReorderDataInLogFiles937;

import java.util.*;

public class ReorderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Map<String, String> letMap = new TreeMap<>();
        Map<String, Set<String>> duplicated = new TreeMap<>();
        List<String> digitsList = new ArrayList<>();

        for (String log : logs) {
            int firstSpace = log.indexOf(' ');
            if (Character.isDigit(log.charAt(firstSpace + 1))) {
                digitsList.add(log);
            } else {
                String key = log.substring(firstSpace);
                if (letMap.containsKey(key)) {
                    Set<String> dupSet = duplicated.getOrDefault(key, new TreeSet<>());
                    dupSet.add(letMap.get(key));
                    dupSet.add(log);
                    duplicated.put(key, dupSet);
                }
                letMap.put(log.substring(firstSpace), log);
            }
        }

        String[] result = new String[letMap.size() + digitsList.size() + duplicated.size()];

        int i = 0;

        for (Map.Entry<String, String> entry : letMap.entrySet()) {
            if (duplicated.containsKey(entry.getKey())) {
                Set<String> sortedSet = duplicated.get(entry.getKey());
                for (String s : sortedSet) {
                    result[i++] = s;
                }
            } else {
                result[i++] = entry.getValue();
            }
        }

        for (String s : digitsList) {
            result[i++] = s;
        }

        return result;
    }
}
