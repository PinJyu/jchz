package com.jchz.leetcode.simple.$0026_删除有序数组中的重复项;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 16:00
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int prevIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];

            if (cur != nums[prevIndex]) {
                prevIndex++;
                nums[prevIndex] = cur;
            }
        }
        return prevIndex + 1;
    }
}
