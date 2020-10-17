package com.company;

import com.company.BContest37.Fancy;
import com.company.BContest37.Problem1;
import com.company.Challenges.ComplementInteger;
import com.company.Challenges.RotateRight;
import com.company.LinkedListCycleII142.ListNode;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // ["Fancy","append","append","getIndex","append","getIndex","addAll","append","getIndex","getIndex","append","append","getIndex","append","getIndex","append","getIndex","append","getIndex","multAll","addAll","getIndex","append","addAll","getIndex","multAll","getIndex","multAll","addAll","addAll","append","multAll","append","append","append","multAll","getIndex","multAll","multAll","multAll","getIndex","addAll","append","multAll","addAll","addAll","multAll","addAll","addAll","append","append","getIndex"]
        //[[],[12],[8],[1],[12],[0],[12],[8],[2],[2],[4],[13],[4],[12],[6],[11],[1],[10],[2],[3],[1],[6],[14],[5],[6],[12],[3],[12],[15],[6],[7],[8],[13],[15],[15],[10],[9],[12],[12],[9],[9],[9],[9],[4],[8],[11],[15],[9],[1],[4],[10],[9]]

        //[null,null,null,8,null,12,null,null,24,24,null,null,4,null,12,null,20,null,24,null,null,37,null,null,42,null,360,null,null,null,null,null,null,null,null,null,220560,null,null,null,285845760,null,null,null,null,null,null,null,null,null,null,-144220952]

        // [null,null,null,8,null,12,null,null,24,24,null,null,4,null,12,null,20,null,24,null,null,37,null,null,42,null,360,null,null,null,null,null,null,null,null,null,220560,null,null,null,285845760,null,null,null,null,null,null,null,null,null,null,150746316]
        Fancy fancy = new Fancy();
        fancy.append(2);   // fancy sequence: [2]
        fancy.addAll(3);   // fancy sequence: [2+3] -> [5]
        fancy.append(7);   // fancy sequence: [5, 7]
        fancy.multAll(2);  // fancy sequence: [5*2, 7*2] -> [10, 14]
        int res0 = fancy.getIndex(0); // return 10
        fancy.addAll(3);   // fancy sequence: [10+3, 14+3] -> [13, 17]
        fancy.append(10);  // fancy sequence: [13, 17, 10]
        fancy.multAll(2);  // fancy sequence: [13*2, 17*2, 10*2] -> [26, 34, 20]
        int res1 = fancy.getIndex(0); // return 26
        int res2 = fancy.getIndex(1); // return 34
        int res3 = fancy.getIndex(2); // return 20

        System.out.println(res1);
    }
}
