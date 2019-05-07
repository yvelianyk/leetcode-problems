package com.company.PascalsTriangleII119;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        if(rowIndex == 0) return result;
        result.add(1);
        if(rowIndex == 1) return result;

        for (int i = 1; i < rowIndex; i++) {
            int k = 0;
            List<Integer> tempRes = new ArrayList<Integer>();
            tempRes.add(1);
            while (k < i) {
                int temp = result.get(k++) + result.get(k);
                tempRes.add(temp);
            }
            tempRes.add(1);
            result = tempRes;
        }

        return result;
    }
}
