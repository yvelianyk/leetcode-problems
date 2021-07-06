package com.company.Contest170;

import java.util.*;

public class Problem3 {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        List<Integer> friendOnLevel = bfs(friends, id, level);

        Map<String, Integer> freqMap = new HashMap<>();
        for (Integer friend : friendOnLevel) {
            List<String> videos = watchedVideos.get(friend);
            for (String video : videos) {
                int count = freqMap.getOrDefault(video, 0);
                freqMap.put(video, count + 1);
            }
        }

        // TODO: Very useful trick. Need to use it in the further problems.
        // It's using when you need to sort some array by number of usage and
        // if you have some equal numbers of usage it should be sorted alphabetically
        // For this purposes we use map with number of usages and after that
        // we just use `sort` static method from Collections framework with
        // custom comparator.
        List<String> res = new ArrayList(freqMap.keySet());
        Collections.sort(res, (a, b) -> (freqMap.get(a).equals(freqMap.get(b)) ? a.compareTo(b) : freqMap.get(a) - freqMap.get(b)));
        return new ArrayList<>(res);
    }

    private List<Integer> bfs(int[][] friends, int id, int targetLevel) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.add(id);
        visited.add(id);

        int level = 0;
        while (!queue.isEmpty()) {
            level++;
            result = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                int[] children = friends[curr];
                for (int j = 0; j < children.length; j++) {
                    int child = children[j];
                    if (!visited.contains(child)) {
                        queue.add(child);
                        visited.add(child);
                        result.add(child);
                    }
                }
            }
            if (level == targetLevel) {
                return result;
            }
        }
        return result;
    }
}
