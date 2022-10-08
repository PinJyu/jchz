package com.jchz.leetcode.simple.$0859_亲密字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 11:42
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().buddyStrings("abcd", "badc");
    }
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int[] cm = new int[26];
        int[] diff = new int[2];
        int diffCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char gc = goal.charAt(i);
            if (sc != gc) {
                if (diffCount < 2)
                    diff[diffCount] = i;

                diffCount++;
            }
            cm[sc - 'a']++;
        }

        if (diffCount == 0) {
            for (int i : cm) {
                if (i >= 2)
                    return true;
            }
            return false;
        }
        else if (diffCount == 2) {
            return s.charAt(diff[0]) == goal.charAt(diff[1])
                    && s.charAt(diff[1]) == goal.charAt(diff[0]);
        }
        else {
            return false;
        }

    }
}
