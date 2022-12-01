package com.jchz.leetcode.middle.$0215_数组中的第K个最大元素;

import java.util.Arrays;
import java.util.Random;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-02 19:40
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    int quickSelect(int[] nums, int l, int r, int k) {
        if (l == r)
            return nums[l];

        int index = partition(nums, l, r);
        int len = r - index + 1;
        if (len == k) {
            return nums[index];
        }
        else if (len < k) {
            return quickSelect(nums, l, index - 1, k - len);
        }
        else {
            return quickSelect(nums, index, r, k);
        }
    }

    int partition(int[] nums, int l, int r) {
        int m = new Random().nextInt(r - l + 1) + l;
        swap(nums, l, m);
        System.out.println(Arrays.toString(nums));
        int slow = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] <= nums[l]) {
                swap(nums, i, ++slow);
            }
        }
        swap(nums, l, slow);
        System.out.printf("%d, %d, %d, %d\n", l, r, m, slow);
        System.out.println(Arrays.toString(nums));

        return slow;
    }

    void swap(int[] nums, int l, int r) {
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }
}
