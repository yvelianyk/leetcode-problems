package com.company.LetterCasePermutation784;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        char[] chars = S.toCharArray();
        List<String> result = new ArrayList<>();

        backtrack(0, chars, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int index, char[] chars, StringBuilder sb, List<String> result) {
        if (index == chars.length) {
            result.add(new String(sb));
            return;
        }
        char aChar = chars[index];
        if(Character.isLetter(aChar)) {
            sb.append(Character.toLowerCase(aChar));
            backtrack(index + 1, chars, sb, result);
            sb.setLength(sb.length() - 1);
            sb.append(Character.toUpperCase(aChar));
            backtrack(index + 1, chars, sb, result);
            sb.setLength(sb.length() - 1);
        } else {
            sb.append(aChar);
            backtrack(index + 1, chars, sb, result);
            sb.setLength(sb.length() - 1);
        }
    }
}
