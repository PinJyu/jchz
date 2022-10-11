package com.jchz.leetcode.simple.$1991_找到数组的中间位置;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-11 20:58
 * @see
 * @since
 */
public class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum(), sumr = sum;

        for (int i = 0; i < nums.length; i++) {
            sumr -= nums[i];
            int suml = sum - sumr - nums[i];
            if (sumr == suml)
                return i;
        }

        return -1;
    }
}
