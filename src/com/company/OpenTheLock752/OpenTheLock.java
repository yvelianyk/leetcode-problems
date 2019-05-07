package com.company.OpenTheLock752;

import java.util.*;

public class OpenTheLock {

    public int openLock(String[] deadends, String target) {
        if (target.equals("0000")) return 0;
        Set <String> visited = new HashSet<String>();
        for (String deadend : deadends) visited.add(deadend);
        if(visited.contains("0000")) return -1;

        Queue<String> queue = new LinkedList<String>();

        queue.offer("0000");
        visited.add("0000");
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                for (int j = 0; j < 4; j++) {
                    char first = (char)(current.charAt(j) + 1);
                    char second = (char)(current.charAt(j) - 1);

                    if(current.charAt(j) == '0') second = '9';
                    if(current.charAt(j) == '9') first = '0';

                    String firstStr = current.substring(0, j) + first + current.substring(j+1);
                    String secondStr = current.substring(0, j) + second + current.substring(j+1);

                    if(firstStr.equals(target) || secondStr.equals(target)) return level;

                    if(!visited.contains(firstStr)) {
                        queue.offer(firstStr);
                        visited.add(firstStr);
                    }
                    if(!visited.contains(secondStr)) {
                        queue.offer(secondStr);
                        visited.add(secondStr);
                    }
                }
            }
        }

        return -1;
    }

}
