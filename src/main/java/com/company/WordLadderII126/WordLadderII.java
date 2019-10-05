package com.company.WordLadderII126;

import java.util.*;

public class WordLadderII {
    public List<List<String>> findLadders(
            String beginWord,
            String endWord,
            List<String> wordList
    ) {
        List<List<String>> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);
        Map<String, Set<String>> graph = new HashMap<>();
        buildGraph(beginWord, graph, dict);
        Map<String, Integer> distanceMap = new HashMap<>();
        LinkedList<String> path = new LinkedList<>();

        bfs(beginWord, graph, distanceMap);
        backtrack(
                beginWord,
                endWord,
                0,
                graph,
                distanceMap,
                path,
                result
        );

        return result;
    }

    private void backtrack(
            String currentWord,
            String endWord,
            int currentDistance,
            Map<String, Set<String>> graph,
            Map<String, Integer> distanceMap,
            LinkedList<String> path,
            List<List<String>> result
    ) {
        if (currentWord == null) return;

        Integer endWordDistance = distanceMap.get(endWord);
        Integer currentWordDistance = distanceMap.get(currentWord);

        // BASE CASE:
        if (
                currentWord.equals(endWord) &&
                        endWordDistance != null &&
                        currentDistance == endWordDistance
        ) {
            path.addLast(currentWord);
            result.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }

        if (
                currentWordDistance == null ||
                        currentDistance > currentWordDistance
        ) {
            return;
        }

        Set<String> nodes = graph.get(currentWord);
        path.addLast(currentWord);
        for (String word : nodes) {
            backtrack(
                    word,
                    endWord,
                    currentDistance + 1,
                    graph,
                    distanceMap,
                    path,
                    result
            );
        }
        path.removeLast();

    }

    private void bfs(
            String beginWord,
            Map<String, Set<String>> graph,
            Map<String, Integer> distanceMap
    ) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (distanceMap.containsKey(word)) continue;
                distanceMap.put(word, distance);
                queue.addAll(graph.get(word));
            }
            distance++;
        }
    }

    private void buildGraph(
            String beginWord,
            Map<String, Set<String>> graph,
            Set<String> dict
    ) {
        for (String dictWord : dict) {
            createNodes(dictWord, dict, graph);
        }

        createNodes(beginWord, dict, graph);
    }

    private void createNodes(
            String word,
            Set<String> dict,
            Map<String,
                    Set<String>> graph
    ) {
        char[] chars = word.toCharArray();
        Set<String> children = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            char curr = chars[i];
            for (int j = 'a'; j <= 'z'; j++) {
                if (j == curr) continue;
                chars[i] = (char) j;
                String newWord = new String(chars);
                if (dict.contains(newWord)) {
                    children.add(newWord);
                }
                chars[i] = curr;
            }
        }

        graph.put(word, children);
    }

}
