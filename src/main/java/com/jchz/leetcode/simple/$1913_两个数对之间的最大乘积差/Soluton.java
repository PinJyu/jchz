package com.jchz.leetcode.simple.$1913_两个数对之间的最大乘积差;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 16:59
 */
public class Soluton {
    public int maxProductDifference(int[] nums) {
        int fmax = Integer.MIN_VALUE, smax = Integer.MIN_VALUE, fmin = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > fmax) {
                smax = fmax;
                fmax = i;
            }
            else if (i > smax)
                smax = i;

            if (i < fmin) {
                smin = fmin;
                fmin = i;
            }
            else if (i < smin)
                smin = i;

        }

        return fmax * smax - fmin * smin;
    }
}
