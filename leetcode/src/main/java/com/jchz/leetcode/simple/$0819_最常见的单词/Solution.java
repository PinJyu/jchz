package com.jchz.leetcode.simple.$0819_最常见的单词;

import javax.print.DocFlavor;
import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 13:21
 */
public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for (String s : banned) {
            set.add(s.toLowerCase());
        }
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c))
                sb.append((char) (c | 32));
            else {
                if (!"".equals(sb.toString()) && !set.contains(sb.toString()))
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                sb = new StringBuilder();
            }
        }

        if (!"".equals(sb.toString()) && !set.contains(sb.toString()))
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);

        String key = null;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                key = entry.getKey();
                max = entry.getValue();
            }
        }

        return key;
    }
}