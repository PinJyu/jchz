package com.jchz.leetcode.simple.$1403_非递增顺序的最小子序列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 17:28
 * @see
 * @since
 */
public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();

        List<Integer> res = new ArrayList<>();
        int sum_ = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum_ += nums[i];
            res.add(nums[i]);
            if (sum_ > sum - sum_) {
                break;
            }
        }

        return res;
    }
}
