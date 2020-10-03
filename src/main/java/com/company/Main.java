package com.company;

import com.company.BContest36.Problem12;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem12 solution = new Problem12();


        // ["leslie","leslie","leslie","clare","clare","clare","clare"]
        //["13:00","13:20","14:00","18:00","18:51","19:30","19:49"]
        //["a","a","a","a","a","a","b","b","b","b","b"]
        //["23:27","03:14","12:57","13:35","13:18","21:58","22:39","10:49","19:37","14:14","10:41"]["13:00","13:20","14:00","18:00","18:51","19:30","19:49"]

        // ["a","a","a","a","b","b","b","b","b","b","c","c","c","c"]
        //["01:35","08:43","20:49","00:01","17:44","02:50","18:48","22:27","14:12","18:00","12:38","20:40","03:59","22:24"]
        List<String> res = solution.alertNames(
                new String[]{"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"},
                new String[]{"10:00","10:40","11:00","09:00","09:10","13:00","15:00"});
        System.out.println(res);
    }
}
