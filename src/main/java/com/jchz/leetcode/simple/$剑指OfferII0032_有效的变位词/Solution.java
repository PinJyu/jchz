package com.jchz.leetcode.simple.$剑指OfferII0032_有效的变位词;

import java.util.Arrays;
import java.util.Collections;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 17:05
 * @see
 * @since
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] map = new int[26];
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        boolean allSame = true;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != ct[i]) {
                allSame = false;
            }
            map[cs[i] - 'a']++;
            map[ct[i] - 'a']--;
        }

        if (allSame)
            return false;

        for (int i : map) {
            if (i != 0)
                return false;
        }

        return true;
    }

    public boolean isAnagram_1(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        boolean allSame = true;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != ct[i]) {
                allSame = false;
                break;
            }
        }
        if (allSame)
            return false;

        Arrays.sort(cs);
        Arrays.sort(ct);

        return Arrays.equals(cs, ct);
    }

}
