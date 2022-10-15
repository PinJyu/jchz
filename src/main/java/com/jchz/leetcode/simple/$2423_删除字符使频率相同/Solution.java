package com.jchz.leetcode.simple.$2423_删除字符使频率相同;

import java.util.*;
import java.util.function.Function;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 23:43
 * @see
 * @since
 */
public class Solution {
    public boolean equalFrequency_1(String word) {
        int[] cmap = new int[26];
        for (char c : word.toCharArray()) {
            cmap[c - 'a']++;
        }

        Arrays.sort(cmap);
        int begin  = 0;
        for (int i = 0; i < cmap.length; i++) {
            if (cmap[i] > 0) {
                begin = i;
                break;
            }
        }

        return begin == cmap.length - 1
                || (cmap[begin] == 1 && cmap[begin + 1] == cmap[cmap.length - 1])
                || (cmap[begin] == cmap[cmap.length - 2] && cmap[begin] + 1 == cmap[cmap.length - 1]) ;
    }

    public boolean equalFrequency(String word) {
        int[] cmap = new int[26];
        for (char c : word.toCharArray()) {
            cmap[c - 'a']++;
        }

        int min = Integer.MAX_VALUE, charCount = 0;
        for (int i : cmap) {
            if (i > 0) {
                charCount++;
                min = Math.min(min, i);
            }
        }

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i : cmap) {
            if (i > 0) {
                hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
            }
        }
        int minCount = hashMap.get(min);
        hashMap.remove(min);

        return (hashMap.size() == 1 && min == 1 && minCount == 1)
                || (hashMap.size() == 0 && min == 1 && charCount > 1)
                || (charCount == 1 && min > 1)
                || (hashMap.size() == 1 && hashMap.values().stream().reduce(0, Integer::sum) == 1
                && hashMap.keySet().stream().reduce(0, Integer::sum) == min + 1);

    }

}
