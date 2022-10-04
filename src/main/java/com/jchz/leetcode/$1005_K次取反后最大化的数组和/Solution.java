package com.jchz.leetcode.$1005_K次取反后最大化的数组和;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 16:58
 */
public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int sum = 0, countNegetive = -1, ck = k;
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && ck > 0) {
                countNegetive++;
                ck--;
                nums[i] = -nums[i];
                sum += nums[i];
                minAbs = nums[i];
            }
            else {
                break;
            }
        }


        if (ck % 2 != 0) {
            int minAbsIndex = nums.length - 1;
            if (countNegetive == -1) {
                minAbsIndex = 0;
            }
            else if (countNegetive + 1 < nums.length) {
                minAbsIndex = nums[countNegetive + 1] < nums[countNegetive] ? countNegetive + 1 : countNegetive;
            }
            nums[minAbsIndex] = -nums[minAbsIndex];
            if (minAbsIndex == countNegetive) {
                sum += nums[minAbsIndex] << 1;
            }
        }

        for (int i = countNegetive + 1; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
