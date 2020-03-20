package com.company.Contest178;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem2 {
    public String rankTeams(String[] votes) {
        int[][] count = new int[26][26];

        for (String vote : votes) {
            char[] chars = vote.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char aChar = chars[j];
                count[aChar - 'A'][j] += 1;
            }
        }

        Character[] ans = new Character[votes[0].length()];
        for (int i = 0; i < votes[0].length(); i++) ans[i] = votes[0].charAt(i);

        Arrays.sort(ans, (a,b) -> {
            for (int i = 0; i < 26; i++)
                if (count[a - 'A'][i] != count[b - 'A'][i])
                    return count[b - 'A'][i] - count[a - 'A'][i];
            return a - b;
        });

        StringBuilder sb = new StringBuilder();
        for (Character an : ans) sb.append(an);

        return new String(sb);
    }
}
