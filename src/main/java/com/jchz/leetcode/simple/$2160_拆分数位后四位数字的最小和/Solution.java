package com.jchz.leetcode.simple.$2160_拆分数位后四位数字的最小和;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 23:55
 * @see
 * @since
 */
public class Solution {
    public int minimumSum(int num) {
        int index = 0;
        int[] arr = new int[4];
        while (num > 0) {
            arr[index++] = num % 10;
            num /= 10;
        }

        Arrays.sort(arr);

        return arr[0] * 10 + arr[1] * 10 + arr[2] + arr[3];

    }
}
