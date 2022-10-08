package com.jchz.leetcode.simple.$0594_最长和谐子序列;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 16:32
 */
public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int nextI = -1;
            for (int j = i + 1; j < nums.length; j++) {
                int diff = nums[j] - nums[i];
                if (diff == 0) {

                }
                else if (diff == 1) {
                    if (nextI == -1)
                        nextI = j;

                    max = Math.max(max, j - i + 1);
                }
                else {
                    if (nextI == -1)
                        nextI = j;
                    break;
                }
            }

            if (nextI != -1) {
                i = nextI - 1;
            }
        }

        return max;
    }
}
