package com.company.MockInterviews.GMockInterviews.Mock14042020;

import java.util.Stack;

// TODO: analyze it
public class Problem2 {
    public int lengthLongestPath(String input) {
        Stack<Integer> lengths = new Stack<Integer>();
        lengths.add(0);
        int maxPath = 0;
        for (String part : input.split("\\n")) {
            String subparts[] = part.split("\\t");
            String cur = subparts[subparts.length - 1];
            int depth = subparts.length;
            while (lengths.size() > depth){
                lengths.pop();
            }

            if (cur.indexOf('.') != -1) {
                maxPath = Math.max(maxPath, lengths.peek() + cur.length() + lengths.size() - 1);
            } else {
                lengths.add(lengths.peek() + cur.length());
            }
        }
        return maxPath;
    }

}
