package com.jchz.leetcode.simple.$1408_数组中的字符串匹配;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 18:06
 * @see
 * @since
 */
public class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));

        List<String> ret = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].length() > words[i].length() && words[j].contains(words[i])) {
                    ret.add(words[i]);
                    break;
                }
            }
        }

        return ret;
    }
}
