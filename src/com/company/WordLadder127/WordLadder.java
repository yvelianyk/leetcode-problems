package com.company.WordLadder127;

import java.util.*;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, ArrayList<String>> dictionary = createDictionary(wordList);
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(beginWord);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                visited.add(current);
                if (current.equals(endWord)) {
                    return level + 1;
                }
                ArrayList<String> adjacents = getAdjacents(current, dictionary);
                for (String adjacent : adjacents) {
                    if (!visited.contains(adjacent)) {
                        queue.add(adjacent);
                    }
                }
            }
            level++;
        }

        return 0;
    }

    private ArrayList<String> getAdjacents(String word, Map<String, ArrayList<String>> dictionary) {
        int length = word.length();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String newWord = word.substring(0, i) + "*" + word.substring(i + 1, length);
            ArrayList<String> array = dictionary.getOrDefault(newWord, new ArrayList<>());
            result.addAll(array);
        }
        return result;
    }

    private Map<String, ArrayList<String>> createDictionary(List<String> wordList) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        int wordLength = wordList.get(0).length();
        for (String word : wordList) {
            for (int i = 0; i < wordLength; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, wordLength);
                ArrayList<String> array = map.getOrDefault(newWord, new ArrayList<>());
                array.add(word);
                map.put(newWord, array);
            }
        }
        return map;
    }
}
