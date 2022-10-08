package com.jchz.leetcode.simple.$1365_有多少小于当前数字的数字;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 15:31
 * @see
 * @since
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] map = new int[101], res = new int[nums.length];

        for (int i : nums) {
            map[i]++;
        }

        int last = 0;
        for (int i = 0; i < map.length; i++) {
            int c = map[i];
            if (c > 0) {
                map[i] = last;
                last += c;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = map[nums[i]];
        }

        return res;
    }

}
