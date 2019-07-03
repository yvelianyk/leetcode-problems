package com.company.LetterCombinationsofPhoneNumber17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofPhoneNumber {
    private Map<String, String> map = new HashMap<>();

    private List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return result;

        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        traverse("", digits);

        return result;
    }

    private void traverse(String res, String digitStr) {
        if (digitStr.isEmpty()) {
            result.add(res);
            return;
        }

        String nextDigit = digitStr.substring(0, 1);
        String nextLetters = map.get(nextDigit);
        for (int i = 0; i < nextLetters.length(); i++) {
            String nextRes = nextLetters.substring(i, i + 1);
            traverse(res.concat(nextRes), digitStr.substring(1));
        }
    }

}
