package com.jchz.leetcode.simple.$1502_判断能否形成等差数列;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-08 17:41
 */
public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + diff != arr[i + 1])
                return false;
        }

        return true;
    }
}
