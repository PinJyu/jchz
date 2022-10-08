package com.jchz.leetcode.simple.$1002_查找共用字符;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 16:42
 */
public class Solution {
    public List<String> commonChars(String[] words) {

        char[] r = new char[26];
        Arrays.fill(r, Character.MAX_VALUE);

        for (String word : words) {
            char[] map = new char[26];
            char[] cs = word.toCharArray();
            for (char c : cs) {
                map[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                r[i] = (char) Math.min(r[i], map[i]);
            }
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < ((int) r[i]); j++) {
                res.add(String.valueOf((char) ('a' + i)));
            }
        }

        return res;
    }
}
