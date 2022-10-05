package com.jchz.leetcode.$1207_独一无二的出现次数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 22:51
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];
        for (int i : arr) {
            count[i + 1000]++;
        }

        int[] distinct = new int[2001];
        for (int i : count) {
            if (i == 0)
                continue;
            if (distinct[i] > 0)
                return false;
            else
                distinct[i]++;
        }

        return true;
    }
}
