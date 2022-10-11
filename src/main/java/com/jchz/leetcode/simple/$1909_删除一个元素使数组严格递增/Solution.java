package com.jchz.leetcode.simple.$1909_删除一个元素使数组严格递增;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 16:50
 */
public class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (count > 0) return false;
                count++;
                if (i == nums.length - 1)
                    return true;
                else if (i == 1) continue;
                else if (nums[i] <= nums[i - 2]) {
                    if (nums[i + 1] <= nums[i - 1])
                        return false;
                }
            }
        }

        return true;
    }
}
