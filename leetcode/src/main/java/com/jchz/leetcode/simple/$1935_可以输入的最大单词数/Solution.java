package com.jchz.leetcode.simple.$1935_可以输入的最大单词数;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 17:38
 */
public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        char[] blcs = brokenLetters.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : blcs) {
            set.add(c);
        }
        int count = s.length;
        for (String s1 : s) {
            char[] cs = s1.toCharArray();
            for (char c : cs) {
               if (set.contains(c)) {
                   count--;
                   break;
               }
            }
        }

        return count;
    }
}
