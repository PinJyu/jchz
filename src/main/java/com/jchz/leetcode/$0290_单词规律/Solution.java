package com.jchz.leetcode.$0290_单词规律;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 13:18
 */
public class Solution {

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> cmap = new HashMap<>();

        String[] sarr = s.split(" ");
        if (pattern.length() != sarr.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char pc = pattern.charAt(i);
            String new_ = sarr[i];

            String old = map.put(pc, new_);

            if (old != null && !old.equals(new_)) {
                return false;
            }

            Character oldc= cmap.put(new_, pc);

            if (oldc != null && !oldc.equals(pc)) {
                return false;
            }

        }

        return true;
    }
}
