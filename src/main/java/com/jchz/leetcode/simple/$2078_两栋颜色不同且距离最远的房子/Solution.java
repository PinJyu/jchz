package com.jchz.leetcode.simple.$2078_两栋颜色不同且距离最远的房子;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 22:53
 * @see
 * @since
 */
public class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            if (max > colors.length - 1 - i)
                break;
            for (int j = colors.length - 1; j >= i; j--) {
                if (colors[i] != colors[j]) {
                    max = Math.max(max, j - i);
                }
            }
        }

        return max;
    }
}
