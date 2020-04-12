package com.company.Contest184;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    private Map<String, String> map;
    public String entityParser(String text) {
        map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");

        StringBuilder sb = new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length;) {
            char aChar = chars[i];
            if(aChar == '&') {
                Item item = getSpecInd(text, i);
                if (item.end != -1) {
                    sb.append(item.symbol);
                    i = item.end;
                } else {
                    sb.append(aChar);
                    i++;
                }
            } else {
                sb.append(aChar);
                i++;
            }
        }
        return new String(sb);
    }

    private Item getSpecInd(String text, int start) {
        int max = start + 6;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < text.length(); i++) {
             if (i > max) return new Item(start, -1, "");
             sb.append(text.charAt(i));
             String key = new String(sb);
             if(map.containsKey(key)) {
                 return new Item(start, i + 1, map.get(key));
             }
        }
        return new Item(start, -1, "");
    }

    private class Item {
        int start;
        int end;
        String symbol;
        Item(int start, int end, String symbol) {
            this.start = start;
            this.end = end;
            this.symbol = symbol;
        }
    }
}
