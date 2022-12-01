package com.jchz.leetcode.simple.$剑指Offer0053_I_在排序数组中查找数字I;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-19 17:40
 */
public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int l = 0, r = nums.length - 1;

        while (l < r && nums[l] != nums[r]) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > target) {
                r = mid - 1;
            }
            else if ( nums[mid] < target) {
                l = mid + 1;
            }
            else {
                if (nums[l] != target) {
                    l++;
                }
                if (nums[r] != target) {
                    r++;
                }
            }
        }

        return target == nums[l] ? r - l + 1 : 0;
    }
}
