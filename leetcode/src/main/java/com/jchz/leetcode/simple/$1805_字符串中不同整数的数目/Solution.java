package com.jchz.leetcode.simple.$1805_字符串中不同整数的数目;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 21:33
 * @see
 * @since
 */
public class Solution {
    public int numDifferentIntegers(String word) {
        String[] split = word.split("[a-z]+");
        Set<String> set = new HashSet<>();
        for (String s : split) {
            if (!"".equals(s)) {
                while (s.startsWith("0") && s.length() > 1) s = s.substring(1);
                set.add(s);
            }
        }

        return set.size();
    }
}
