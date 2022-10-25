package com.jchz.leetcode.simple.$剑指OfferII0006_排序数组中两个数字之和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-21 16:40
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target)
                return new int[]{l, r};
            else if (numbers[l] + numbers[r] < target)
                l++;
            else
                r--;
        }

        return new int[0];
    }

    public int[] twoSum_1(int[] numbers, int target) {
        for (int i = 0; i + 1< numbers.length; i++) {
            int index;
            if ((index = binarySearch(numbers, i + 1, target - numbers[i])) > 0 && i != index)
                return new int[]{i, index};
        }

        return new int[0];
    }

    int binarySearch(int[] arr, int l, int s) {
        int  r = arr.length - 1;
        while (l < r) {
            int mid = (r + l) / 2;
            if (arr[mid] >= s) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }

        return arr[l] == s ? l : -1;
    }
}
