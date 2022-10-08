package com.jchz.leetcode.simple.$0860_柠檬水找零;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 11:59
 */
public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int m5 = 0, m10 = 0, m20 = 0;

        for (int i : bills) {
            if (i == 5)
                m5++;
            else if (i == 10) {
                if (m5 > 0) {
                    m5--;
                    m10++;
                }
                else return false;
            }
            else {
                if (m10 > 0 && m5 > 0) {
                    m10--;
                    m5--;
                    m20++;
                }
                else if (m5 > 2) {
                    m5 -= 3;
                    m20++;
                }
                else return false;
            }
        }

        return true;
    }
}
