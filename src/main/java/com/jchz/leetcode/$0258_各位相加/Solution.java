package com.jchz.leetcode.$0258_各位相加;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-15 18:32
 */
public class Solution {
    public int addDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
            if (num == 0) {
                if (sum < 10) {
                    break;
                }
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
