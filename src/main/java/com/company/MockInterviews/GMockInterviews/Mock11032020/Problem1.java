package com.company.MockInterviews.GMockInterviews.Mock11032020;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) set.add(filterEmail(email));
        return set.size();
    }

    private String filterEmail(String email) {
        StringBuilder sb = new StringBuilder();
        String[] parts = email.split("@");
        String local = parts[0];
        for (int i = 0; i < local.length(); i++) {
            char charAt = local.charAt(i);
            if (charAt == '.') continue;
            if (charAt == '+') {
                sb.append('@');
                sb.append(parts[1]);
                return new String(sb);
            }
            sb.append(charAt);
        }
        sb.append('@');
        sb.append(parts[1]);
        return new String(sb);
    }
}
