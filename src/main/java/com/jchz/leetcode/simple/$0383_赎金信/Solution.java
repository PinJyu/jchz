package com.jchz.leetcode.simple.$0383_赎金信;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 16:06
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int count = map[c - 'a'];
            if (count > 0)
                map[c - 'a']--;
            else
                return false;
        }

        return true;
    }
}
