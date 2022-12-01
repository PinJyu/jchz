package com.jchz.leetcode.middle.$0167_两数之和II_输入有序数组;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-01 16:59
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target)
                r--;
            else if (sum < target)
                l++;
            else
                break;
        }

        return new int[]{l + 1, r + 1};
    }
}
