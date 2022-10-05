package com.jchz.leetcode.$1160_拼写单词;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 21:31
 */
public class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] map = new int[26];

        int sum = 0;
        for (char c : chars.toCharArray()) {
            map[c - 'a']++;
        }

    outter:
        for (String word : words) {
            int[] wmap = new int[26];
            for (char c : word.toCharArray()) {
                wmap[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if (map[i] < wmap[i])
                    continue outter;
            }
            sum += word.length();
        }

        return sum;
    }
}
