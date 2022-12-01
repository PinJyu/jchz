package com.jchz.leetcode.simple.$0944_删列造序;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 20:31
 */
public class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
