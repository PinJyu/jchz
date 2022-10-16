package com.jchz.leetcode.simple.$LCP0028_采购方案;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 15:07
 * @see
 * @since
 */
public class Solution {
    public int purchasePlans_1(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1, count = 0;
        while (l < r) {
            if (nums[l] + nums[r] > target)
                r--;
            else {
                count += r - l + 1;
                l++;
            }
        }

        return count;
    }

    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += binarySearch(nums, target - nums[i], i + 1) - i - 1;
            count %= 10000_00007;
        }

        return count;
    }

    int binarySearch(int[] nums, int t, int begin) {
        int l = begin, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= t) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return l;
    }
}
