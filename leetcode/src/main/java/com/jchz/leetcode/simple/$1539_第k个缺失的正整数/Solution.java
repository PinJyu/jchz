package com.jchz.leetcode.simple.$1539_第k个缺失的正整数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-08 22:04
 * @see
 * @since
 */
public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int q = 1;
        for (int i = 0; i < arr.length; i++) {
            if (q != arr[i]) {
                i--;
                k--;
            }
            if (k == 0)
                return q;
            q++;
        }
        if (k > 0)
            return q - 1 + k;
        else
            return -1;
    }
}
