package com.jchz.leetcode.simple.$1287_有序数组中出现次数超过25percent的元素;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 19:11
 */
public class Solution {
    public int findSpecialInteger(int[] arr) {
        int[] map = new int[100001];
        double floor = arr.length / 4D;

        for (int i : arr) {
            map[i]++;
            if (map[i] >= floor)
                return i;
        }


        return -1;
    }

}
