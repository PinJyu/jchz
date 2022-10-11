package com.jchz.leetcode.simple.$1941_检查是否所有字符出现次数相同;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 17:43
 */
public class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] map = new int[26];
        char[] cs = s.toCharArray();
        for (char c : cs) {
            map[c - 'a']++;
        }

        int count = 0;
        for (int i : map) {
            if (i != 0) {
                if (count == 0) {
                    count = i;
                }
                else if (count != i){
                    return false;
                }
            }
        }

        return true;
    }
}
