package com.jchz.leetcode.$0035_搜索插入位置;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 16:50
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    // stackoverflow
    public int search(int[] nums, int target, int begin, int end) {
        if (begin == end)
            return nums[begin] == target ? begin : begin + 1;

        int mid = begin + (end - begin + 1) / 2;

        if (nums[mid] == target)
            return mid;

        if (nums[mid] < target)
            return search(nums, target, mid, end);
        else
            return search(nums, target, begin, mid);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1, 2, 3, 4, 5}, 6));
    }

    public int searchInsert_1(int[] nums, int target) {
        int ans = nums.length - 1, begin = 0, end = nums.length - 1, mid;

        while (begin <= end) {
            mid = (end - begin) >> 1 + begin;
            if (nums[mid] == target) {
                ans = mid;
                break;
            }

            if (nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            }

            if (nums[mid] < target) {
                begin = mid + 1;
            }
        }


        return ans;
    }
}

