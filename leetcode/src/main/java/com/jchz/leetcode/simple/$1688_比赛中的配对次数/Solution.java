package com.jchz.leetcode.simple.$1688_比赛中的配对次数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 11:58
 */
public class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            count += n / 2;
            n = n / 2 + n % 2;
        }

        return count;
    }
}
