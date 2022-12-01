package com.jchz.leetcode.simple.$2269_找到一个数字的K美丽值;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 18:09
 */
public class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i < s.length() - k + 1; i++) {
            int sub = Integer.parseInt(s.substring(i, i + k));

            if (sub != 0 && num % sub == 0)
                count++;
        }

        return count;
    }
}
