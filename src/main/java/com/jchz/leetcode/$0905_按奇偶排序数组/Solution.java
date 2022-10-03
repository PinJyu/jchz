package com.jchz.leetcode.$0905_按奇偶排序数组;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 15:23
 */
public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            if (nums[l] % 2 == 0)  l++;
            else if (nums[r] % 2 == 1)  r--;
            else {
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;

            }
        }

        return nums;
    }
}
