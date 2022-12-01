package com.jchz.leetcode.simple.$1534_unresolve_统计好三元组;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-08 21:51
 * @see
 * @since
 */
public class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) <= a
                    && Math.abs(arr[i + 1] - arr[i + 2]) <= b
                    && Math.abs(arr[i] - arr[i + 2]) <= c)
            {
                count++;
            }
        }

        return count;
    }
}
