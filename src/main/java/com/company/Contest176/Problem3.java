package com.company.Contest176;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

// TODO: ANALYZE IT
public class Problem3 {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[1]>b[1]) return 1;
                else if(a[1]<b[1]) return -1;
                else{
                    return a[0] - b[0];
                }
            }
        });
        Set<Integer> set = new HashSet<>();
        for(int[] event: events){
            for(int i=event[0];i<=event[1];i++){
                if(!set.contains(i)){
                    set.add(i);
                    break;
                }
            }
        }
        return set.size();

    }
}
