package com.jchz.leetcode.simple.$剑指OfferII0068_查找插入位置;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 20:09
 * @see
 * @since
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = nums.length;

        while (l <= r) {
            int mid = (r + l) / 2;
            if (nums[mid] >= target) {
                ans = r;
                r = mid - 1;
            }
            else
                l = mid + 1;
        }

        return ans;
    }

}
