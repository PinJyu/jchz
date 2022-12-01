package com.jchz.leetcode.simple.$1629_按键持续时间最长的键;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 18:23
 */
public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
//        int[] durtions = new int[26];
        int max = -1;
        char ret = '1';

        char[] cs = keysPressed.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            int d = 0;
            if (i == 0)
                d = releaseTimes[i];
            else
                d = releaseTimes[i] - releaseTimes[i - 1];

//            durtions[c - 'a'] += d;

            if (d > max) {
                max = d;
                ret = c;
            }
            else if (d == max){
                ret = (char) Math.max(c, ret);
            }
        }

        return ret;
    }
}
