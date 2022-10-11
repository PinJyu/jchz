package com.jchz.leetcode.simple.$1897_重新分配字符使所有字符串都相等;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 16:42
 */
public class Solution {
    public boolean makeEqual(String[] words) {
        int[] map = new int[26];
        int n = words.length;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                map[c - 'a']++;
            }
        }

        for (int i : map) {
            if (i % n != 0)
                return false;
        }

        return true;
    }
}
