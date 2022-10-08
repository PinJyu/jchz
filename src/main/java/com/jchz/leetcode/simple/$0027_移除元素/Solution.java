package com.jchz.leetcode.simple.$0027_移除元素;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 16:11
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int fowardIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[fowardIndex] = nums[i];
                fowardIndex++;
            }
        }
        return fowardIndex;
    }

    // 从尾部拿东西填补，双指针优化
    public int removeElement_1(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
