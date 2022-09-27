package com.jchz.leetcode.$0696_计数二进制子串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 14:47
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().countBinarySubstrings("100111001");
    }
    public int countBinarySubstrings(String s) {

        char[] cs = s.toCharArray();
        int begin = 0, sum = 0, lastLen = 0;

        for (int i = 1; i < cs.length; i++) {
            if (cs[i] != cs[i - 1]) {
                int curLen = i - begin + (i == cs.length - 1 ? 1 : 0);
                sum += Math.min(curLen, lastLen);
                begin = i;
                lastLen = curLen;
            }

            if (i == cs.length - 1) {
                int curLen = i - begin + 1;
                sum += Math.min(curLen, lastLen);
                begin = i;
                lastLen = curLen;

            }
        }


        return sum;
    }
}
