package com.company;


import com.company.JumpGame55.JumpGameTopDown;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JumpGameTopDown solution = new JumpGameTopDown();
        boolean result = solution.canJump(new int[]{3,2,1,0,4});
        System.out.println(result);
    }
}
