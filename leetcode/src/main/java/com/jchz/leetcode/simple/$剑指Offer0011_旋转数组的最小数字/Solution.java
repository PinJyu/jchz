package com.jchz.leetcode.simple.$剑指Offer0011_旋转数组的最小数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 15:50
 */
public class Solution {
    public int minArray_1(int[] numbers) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (numbers[mid] > numbers[r])
                l = mid + 1;
            else if (numbers[mid] < numbers[r])
                r = mid;
            else if (numbers[mid] == numbers[r])
                r--;
        }

        return numbers[r];
    }

    public int minArray(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] < numbers[i - 1])
                return numbers[i];
        }

        return numbers[0];
    }
}
