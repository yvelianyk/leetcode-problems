package com.company.Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] dirs = path.split("\\/");
        Stack<String> stack = new Stack<>();
        for(String dir : dirs) {
            if (dir.equals("") || dir.equals(".")) continue;
            if (dir.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
                continue;
            }
            stack.push(dir);
        }
        if (stack.size() == 0) return "/";
        List<String> reverse = new ArrayList<>();
        while(!stack.isEmpty()) reverse.add(stack.pop());
        StringBuilder sb = new StringBuilder();
        for(int i = reverse.size() - 1; i >= 0; i--) {
           sb.append("/");
           sb.append(reverse.get(i));
        }

        return new String(sb);
    }
}
