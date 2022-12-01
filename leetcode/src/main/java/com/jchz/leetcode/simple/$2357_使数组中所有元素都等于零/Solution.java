package com.jchz.leetcode.simple.$2357_使数组中所有元素都等于零;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 23:30
 * @see
 * @since
 */
public class Solution {
    public int minimumOperations_1(int[] nums) {
        int[] map = new int[101];
        int count = 0;
        for (int i : nums) {
            if (i != 0) {
                map[i]++;
                if (map[i] == 1)
                    count++;
            }
        }

        return count;
    }

    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i != 0)
                nums[i] -= nums[i - 1];
            count += nums[i] > 0 ? 1 : 0;
        }

        return count;
    }

}
