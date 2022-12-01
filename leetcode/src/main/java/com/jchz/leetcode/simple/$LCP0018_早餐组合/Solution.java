package com.jchz.leetcode.simple.$LCP0018_早餐组合;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 13:43
 * @see
 * @since
 */
public class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(drinks);
        int count = 0;
        for (int i : staple) {
            if (i >= x) continue;
            count += binarySearch(drinks, x - i);
        }

        return count;
    }

    int binarySearch(int[] arr, int s) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= s) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }

        return l;
    }

}
