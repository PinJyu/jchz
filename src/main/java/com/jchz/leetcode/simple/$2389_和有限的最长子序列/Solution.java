package com.jchz.leetcode.simple.$2389_和有限的最长子序列;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 01:05
 * @see
 * @since
 */
public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }


        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = 0, r = nums.length - 1;
            while (l < r) {
                int mid = (l + r) / 2 + 1;
                if (nums[mid] <= queries[i]) {
                    l = mid;
                }
                else {
                    r = mid - 1;
                }
            }

            ans[i] = nums[r] <= queries[i] ? l + 1 : 0;
        }

        return ans;
    }

}
