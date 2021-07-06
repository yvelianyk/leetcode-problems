package com.company.BContest30;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    public String reformatDate(String date) {
        String[] splitted = date.split("\\s");
        char[] day = splitted[0].toCharArray();
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
        String month = splitted[1];
        String year = splitted[2];

        String resDay = "";
        for (char c : day) if (Character.isDigit(c)) resDay += c;
        if (resDay.length() == 1) resDay = "0" + resDay;
        return year + "-" + monthMap.get(month) + "-" + resDay;

    }
}
