package com.jchz.leetcode.$0551_学生出勤记录I;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 18:39
 */
public class Solution {
    public boolean checkRecord(String s) {
        char[] cs = s.toCharArray();
        int[] bits = new int[4];

        for (char c : cs) {
            if (c == 'A') {
                bits[0]++;
                bits[1] = 0;
                bits[2] = 0;
                bits[3] = 0;
            }
            else if (c == 'L') {
                if (bits[1] == 0)
                    bits[1] = 1;
                else if (bits[2] == 0)
                    bits[2] = 1;
                else {
                    return false;
                }
            }
            else {
                bits[1] = 0;
                bits[2] = 0;
                bits[3] = 0;
            }
        }

        return bits[0] < 2;
    }
}
