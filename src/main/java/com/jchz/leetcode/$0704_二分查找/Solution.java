package com.jchz.leetcode.$0704_二分查找;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 18:11
 */
public class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = (r + l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }

        return nums[r] == target ? r : -1;
    }
}
