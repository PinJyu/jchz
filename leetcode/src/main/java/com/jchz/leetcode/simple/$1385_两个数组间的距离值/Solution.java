package com.jchz.leetcode.simple.$1385_两个数组间的距离值;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 16:27
 * @see
 * @since
 */
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int i : arr1) {
            int lb = i - d, rb = i + d;
            int l = 0, r = arr2.length - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (arr2[mid] >= lb && arr2[mid] <= rb) {
                    count++;
                    break;
                }
                else if (arr2[mid] > rb) {
                    r = mid - 1;
                }
                else if (arr2[mid] < lb) {
                    l = mid + 1;
                }
            }
        }

        return arr1.length - count;
    }
}
