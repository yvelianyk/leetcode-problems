package com.company.AddBinary67;

import java.util.Stack;

public class AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        int aLength = a.length();
        int bLength = b.length();
        int iterLength = aLength > bLength ? aLength : bLength;
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < iterLength; i++) {
            int aI = 0;
            int bI = 0;
            int aIndex = aLength - 1 - i;
            int bIndex = bLength - 1 - i;

            if(aIndex >= 0) aI = Character.getNumericValue(a.charAt(aIndex));
            if(bIndex >= 0) bI = Character.getNumericValue(b.charAt(bIndex));

            int sum = aI + bI + carry;
            carry = sum >= 2 ? 1 : 0;

            stack.push(sum % 2);
        }
        if (carry == 1) stack.push(carry);
        char[] result = new char[stack.size()];
        for (int i = 0; i < result.length; i++)
            result[i] = Character.forDigit(stack.pop(), 10);

        return new String(result);
    }
}
