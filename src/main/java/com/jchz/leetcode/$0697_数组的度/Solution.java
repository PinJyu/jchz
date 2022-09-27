package com.jchz.leetcode.$0697_数组的度;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 15:50
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().findShortestSubArray(new int[]{1, 2, 2, 3, 1});
    }
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int[] arr = {1, i, i};
                map.put(nums[i], arr);
            }
            else {
                int[] arr = map.get(nums[i]);
                arr[0]++;
                arr[2] = i;
            }
        }

        int max = Integer.MIN_VALUE, key = -1, minLen = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] value = entry.getValue();
            if (value[0] > max) {
                key = entry.getKey();
                max = value[0];
                minLen = value[2] - value[1] + 1;
            }
            else if (value[0] == max && value[2] - value[1] + 1 < minLen) {
                key = entry.getKey();
                minLen = value[2] - value[1] + 1;

            }
        }


        return minLen;

    }
}
