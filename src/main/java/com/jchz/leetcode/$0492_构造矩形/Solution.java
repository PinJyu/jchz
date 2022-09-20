package com.jchz.leetcode.$0492_构造矩形;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 16:29
 */
public class Solution {

    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int mid = Math.max(area / 2, 1);
        int diff = Integer.MAX_VALUE;

        for (int i = 1; i <= mid; i++) {
            if (area % i == 0) {
                int lastDiff = diff;
                diff = Math.abs(i - area / i);
                if (diff >= lastDiff)
                    break;
                res[0] = i;
                res[1] = area / i;
            }
        }

        return res;
    }

    public int[] constructRectangle_1(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }

        return new int[]{area / w, w};
    }
}
