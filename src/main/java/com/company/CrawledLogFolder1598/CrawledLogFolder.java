package com.company.CrawledLogFolder1598;

public class CrawledLogFolder {
    public int minOperations(String[] logs) {
        int result = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (result > 0) result--;
            } else if (log.equals("./")) {
            } else {
                result++;
            }
        }
        return Math.max(result, 0);
    }
}
