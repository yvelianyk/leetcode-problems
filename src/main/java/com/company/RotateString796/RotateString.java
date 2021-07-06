package com.company.RotateString796;

public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) return false;
        return (A + A).contains(B);
    }
}
