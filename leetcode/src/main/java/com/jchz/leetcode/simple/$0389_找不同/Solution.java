package com.jchz.leetcode.simple.$0389_找不同;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 17:00
 */
public class Solution {

    public char findTheDifference(String s, String t) {
        int[] sMap = new int[26];
        int[] tMap = new int[26];
        char[] sCs = s.toCharArray();
        char[] tCs = t.toCharArray();

        for (char c : sCs) {
            sMap[c - 'a']++;
        }

        for (char c : tCs) {
            tMap[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (sMap[i] != tMap[i]) {
                return (char) (i + 'a');
            }
        }

        return 0;
    }
}
