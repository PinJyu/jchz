package com.jchz.leetcode.$0242_有效的字母异位词;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-15 17:09
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int checkS = 0;
        int checkT = 0;
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            checkS ^= si;
            checkT ^= ti;
        }

        return checkS == checkT;
    }

    public boolean isAnagram_1(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);

            map.compute(si, (k, v) -> v == null ? Integer.valueOf(1) : v == 0 ? null : ++v);
            map.compute(ti, (k, v) -> v == null ? Integer.valueOf(-1) : v == 0 ? null :--v);
            System.out.println(map);
        }

        return map.size() == 0;
    }

    public boolean isAnagram_2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            map[si]++;
            map[ti]--;
        }

        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) return false;
        }

        return true;
    }
}

