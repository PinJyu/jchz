package com.jchz.leetcode.simple.$面试题08_03_魔术索引;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 19:17
 * @see
 * @since
 */
public class Solution {
    public int findMagicIndex(int[] nums) {
        int l = 0, r = nums.length - 1, ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i])
                return i;
        }
        return -1;
//        while (l < r) {
//            int m = (l + r) / 2;
//            if (nums[m] >= m) {
//                ans = m;
//                r = m - 1;
//            }
//            else {
//                l = m + 1;
//            }
//        }
//
//        return ans;
    }

}
