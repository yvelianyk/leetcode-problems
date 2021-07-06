package com.company.ReverseString344;

public class ReverseString {

    public void reverseString(char[] s) {
        traverse(0, s);
    }

    private void traverse(int index, char[] chars) {
        if (index >= chars.length / 2) return;

        int endIndex = chars.length - 1 - index;
        char temp = chars[index];
        chars[index] = chars[endIndex];
        chars[endIndex] = temp;

        traverse(index + 1, chars);
    }

    // ITERATIVE:
//    public void reverseString(char[] s) {
//        int i = 0;
//        int j = s.length - 1;
//        while (i < j) {
//            char temp = s[i];
//            s[i] = s[j];
//            s[j] = temp;
//            i++;
//            j--;
//        }
//    }
}
