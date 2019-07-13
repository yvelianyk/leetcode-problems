package com.company.Flatten2DVector251;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// https://leetcode.com/problems/flatten-2d-vector/
public class Vector2D implements Iterator {

    private int current = 0;
    private List<Integer> list = new ArrayList<>();

    public Vector2D(int[][] v) {
        this.initList(v);
    }

    public Integer next() {
        return list.get(current++);
    }

    public boolean hasNext() {
        return current < list.size();
    }

    private void initList(int[][] v) {
        for (int i = 0; i < v.length; i++) {
            int[] ints = v[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                list.add(anInt);
            }
        }
    }
}


