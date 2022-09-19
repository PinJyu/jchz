package com.jchz.leetcode.$0387_字符串中的第一个唯一字符;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 16:14
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().firstUniqChar("aadadaad");
    }

    public int firstUniqChar(String s) {

        int[] map = new int[26];
        char[] cs = s.toCharArray();

        for (int i = cs.length - 1; i >= 0; i--) {
            map[cs[i] - 'a']++;
        }

        for (int i = 0; i < cs.length; i++) {
            if (map[cs[i] - 'a'] == 1)
                return i;
        }

        return -1;
    }
}
