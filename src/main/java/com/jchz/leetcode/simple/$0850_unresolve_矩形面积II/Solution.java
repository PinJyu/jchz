package com.jchz.leetcode.simple.$0850_unresolve_矩形面积II;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 17:50
 */
public class Solution {
    public int rectangleArea(int[][] rectangles) {
//        BitSet xset = new BitSet();
//        BitSet yset = new BitSet();
        Set<String> points = new HashSet<>();
        for (int i = 0; i < rectangles.length; i++) {

            int[] rec = rectangles[i];
            int x1 = rec[0], y1 = rec[1], x2 = rec[2], y2 = rec[3];

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    points.add("(" + (j + 1) + ", " + (k + 1) + ")");
                }
            }
        }



        int res = (int) ((long) points.size()  % (1e9 + 7));
        return res;
    }
}
