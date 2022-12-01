package com.jchz.leetcode.simple.$0896_单调数列;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 17:30
 */
public class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean ge = false, l = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
               ge = true;
            }
            else if (nums[i] < nums[i + 1]){
                l = true;
            }

            if (ge & l)
                return false;
        }

        return true;
    }
}
