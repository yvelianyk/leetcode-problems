package com.company;

import com.company.MaxNumbersOfBalloons1189.MaxNumbersOfBalloons;
import com.company.StringToInteger8.StringToInteger;
import com.company.WordLadderII126.WordLadderII;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String input = "loonbalxballpooon";
        MaxNumbersOfBalloons solution = new MaxNumbersOfBalloons();
        int result = solution.maxNumberOfBalloons(input);
        System.out.println(result);
    }
}
