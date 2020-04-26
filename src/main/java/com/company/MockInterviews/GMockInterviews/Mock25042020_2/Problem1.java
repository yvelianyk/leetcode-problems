package com.company.MockInterviews.GMockInterviews.Mock25042020_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// TODO: sort hours by values and closest to time
public class Problem1 {

    public String nextClosestTime(String time) {
        List<Integer> digits = getDigits(time);
        List<List<Integer>> variants = new ArrayList<>();
        backtrack(0, new ArrayList<>(), digits, variants);
        return "";
    }

    private void backtrack(int index, List<Integer> res, List<Integer> digits, List<List<Integer>> result) {
        if (index == digits.size()) {
            result.add(new ArrayList<>(res));
            return;
        }

        for (Integer digit : digits) {
            res.add(digit);
            backtrack(index + 1, res, digits, result);
            res.remove(res.size() - 1);
        }
    }



    private int toMinutes(int hours, int minutes) {
        return 0;
    }

    private List<Integer> getDigits(String time) {
        String[] splitted = time.split(":");
        List<Integer> result = new ArrayList<>();
        result.add(Integer.parseInt(String.valueOf(splitted[0].charAt(0))));
        result.add(Integer.parseInt(String.valueOf(splitted[0].charAt(1))));
        result.add(Integer.parseInt(String.valueOf(splitted[1].charAt(0))));
        result.add(Integer.parseInt(String.valueOf(splitted[1].charAt(1))));
        return result;
    }


}
