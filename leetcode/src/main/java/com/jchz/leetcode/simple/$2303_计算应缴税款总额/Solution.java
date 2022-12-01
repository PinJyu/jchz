package com.jchz.leetcode.simple.$2303_计算应缴税款总额;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 21:54
 * @see
 * @since
 */
public class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int lower = 0;
        double sumTax = 0;
        for (int i = 0; i < brackets.length; i++) {
            int upper = brackets[i][0];
            double percent = brackets[i][1] / 100D;
            if (income >= upper - lower) {
                sumTax += percent * (upper - lower);
                income -= upper - lower;
            }
            else {
                sumTax += percent * income;
                income = 0;
            }
            lower = upper;
            if (income == 0)
                break;
        }

        return sumTax;
    }

}
