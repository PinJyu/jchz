package com.jchz.leetcode.simple.$剑指Offer0057_I_和为s的两个数字;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 12:08
 */
public class Solution {

    public int[] twoSum_3(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int s = nums[l] + nums[r];
            if (s > target)
                r--;
            else if (s < target)
                l++;
            else
                return new int[]{nums[l], nums[r]};
        }

        return new int[0];
    }

    public int[] twoSum_2(int[] nums, int target) {
        for (int i : nums) {
            int find = target - i;
            if (find < 0)
                break;
            if (find != i && binarySearch(nums, find) > 0) {
                return new int[]{i, find};
            }
        }

        return new int[0];
    }

    int binarySearch(int[] arr, int s) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] >= s) {
                r = m;
            }
            else {
                l = m + 1;
            }
        }

        return arr[l] == s ? 1 : -1;
    }

    public int[] twoSum_1(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            int diff = target - num;
            if (diff != num && set.contains(diff))
                return new int[]{num, diff};

            if (num > target)
                break;
        }

        return new int[0];
    }
}
