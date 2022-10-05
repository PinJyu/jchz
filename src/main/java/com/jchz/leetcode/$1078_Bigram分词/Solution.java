package com.jchz.leetcode.$1078_Bigram分词;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 18:05
 */
public class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] s = text.split(" ");
        List<String> l = new ArrayList<>();
        for (int i = 0; i < s.length - 2; i++) {
            if (s[i].equals(first) && s[i + 1].equals(second)) {
                l.add(s[i+2]);
            }
        }

        return l.toArray(new String[0]);
    }
}
