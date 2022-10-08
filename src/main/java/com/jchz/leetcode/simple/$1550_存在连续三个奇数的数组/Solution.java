package com.jchz.leetcode.simple.$1550_存在连续三个奇数的数组;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-08 22:35
 * @see
 * @since
 */
public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1)
//                if (arr[i] & arr[i + 1] & arr[i + 2])
                return true;
        }

        return false;
    }
}
