package com.jchz.leetcode.$0507_完美数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 14:56
 */
public class Solution {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int mid = Math.max(num / 2, 1);

        int sum = 0;
        while (mid > 0) {
            if (num % mid == 0) {
                sum += mid;
                if (sum > num)
                    return false;
            }
            mid--;
        }

        return sum == num;

    }
}
