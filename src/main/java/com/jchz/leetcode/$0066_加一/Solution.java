package com.jchz.leetcode.$0066_加一;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 18:04
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int up = 1;
        int [] res = digits;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + up;
            if (sum > 9) {
                digits[i] = sum % 10;
                up = 1;
            }
            else {
                digits[i] = sum;
                up = 0;
            }
        }

        if (up == 1) {
            res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);
        }

        return res;
    }


    // 短路
    public int[] plusOne_1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
