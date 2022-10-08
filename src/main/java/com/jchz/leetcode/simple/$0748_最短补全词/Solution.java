package com.jchz.leetcode.simple.$0748_最短补全词;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 16:35
 */
public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        List<Character> lp = new ArrayList<>();
        for (char c : licensePlate.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                lp.add((char) (c | 32));
        }

        int scw = Integer.MAX_VALUE, index = 0;
    outter:
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : word) {
                map.put((char) (c | 32), map.getOrDefault((char) (c | 32), 0) + 1);
            }

            for (Character c : lp) {
                if (map.containsKey(c)) {
                    map.compute(c, (k, v) -> {
                        v--;
                        if (v > 0) return v;
                        else return null;
                    });
                }
                else
                    continue outter;
            }

            if (word.length < scw) {
                scw = word.length;
                index = i;
            }
        }

        return words[index];
    }
}
