package com.company.BackspaceStringCompare844;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder sb = new StringBuilder(S);
        StringBuilder tb = new StringBuilder(T);

        this.processString(sb);
        this.processString(tb);

        return sb.toString().equals(tb.toString());
    }
    private void processString(StringBuilder sb) {
        for(int i=0; i< sb.length();) {
            if (sb.charAt(i) == '#') {
                sb.deleteCharAt(i);
                if (i != 0) {
                    sb.deleteCharAt(i - 1);
                    i--;
                }
            } else i++;
        }
    }


}
