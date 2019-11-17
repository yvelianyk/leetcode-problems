package com.company;

import com.company.CountOfNiceSubarray1248.CountOfNiceSubarray;
import com.company.MinimumRemovetoMakeValidParentheses1249.MinimumRemovetoMakeValidParentheses;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinimumRemovetoMakeValidParentheses solution = new MinimumRemovetoMakeValidParentheses();

        String result = solution.minRemoveToMakeValid("lee(t(c)o)de)");

        System.out.println(result);

    }
}
