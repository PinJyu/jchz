package com.jchz.leetcode.simple.$剑指OfferII0101_unresolve_分割等和子集;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 14:41
 * @see
 * @since
 */
public class Solution {

    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1)
            return false;

        int half = sum >> 1;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] <= half)
                half -= nums[i];
            if (0 == half)
                return true;
            else if (half < 0)
                break;
        }

        return false;
    }

}
