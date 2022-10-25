package com.jchz.leetcode.simple.$剑指OfferII0069_山峰数组的顶部;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 20:28
 * @see
 * @since
 */
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length - 2, ans = arr.length - 2;
        while (l <= r) {
            int m = (r + l) / 2;
            if (arr[m] > arr[m + 1]) {
                ans = m;
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return ans;
    }
    public int peakIndexInMountainArray_1(int[] arr) {
        int max = -1, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }
}
