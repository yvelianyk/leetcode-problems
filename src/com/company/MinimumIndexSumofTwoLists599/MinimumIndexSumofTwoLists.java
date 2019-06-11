package com.company.MinimumIndexSumofTwoLists599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list1Map = new HashMap<>();
        List<StringItem> result = new ArrayList<>();
        List<String> resultStr = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            list1Map.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            if (list1Map.containsKey(list2[i])) {
               int sumOfIndices = list1Map.get(list2[i]) + i;
                result.add(new StringItem(list2[i], sumOfIndices));
            }
        }


        int minIndex = result.get(0).indexSum;
        for (int i = 0; i < result.size(); i++) {
            int indexSum = result.get(i).indexSum;
            if (indexSum < minIndex) {
                minIndex = indexSum;
            }
        }

        for (int i = 0; i < result.size(); i++) {
            int indexSum = result.get(i).indexSum;
            if(indexSum == minIndex) {
                resultStr.add(result.get(i).value);
            }
        }
        String[] strResult = new String[resultStr.size()];
        for (int i = 0; i < resultStr.size(); i++) {
            strResult[i] = resultStr.get(i);
        }

        return strResult;

    }

    class StringItem {
        public String value;
        public int indexSum;
        StringItem(String item, int indexSum) {
            this.value = item;
            this.indexSum = indexSum;
        }
    }
}
