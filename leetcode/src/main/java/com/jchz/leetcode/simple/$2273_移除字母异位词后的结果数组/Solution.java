package com.jchz.leetcode.simple.$2273_移除字母异位词后的结果数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 18:16
 */
public class Solution {
    public List<String> removeAnagrams(String[] words) {
        char[] last = null;
        for (int i = words.length - 1; i > 0; i--) {
            if (words[i].length() != words[i - 1].length()) {
                last = null;
                continue;
            }

            if (last == null) {
                last = words[i].toCharArray();
                Arrays.sort(last);
            }

            char[] cs = words[i - 1].toCharArray();
            Arrays.sort(cs);

            boolean equals = true;
            for (int j = 0; j < last.length; j++) {
                if (last[j] != cs[j]) {
                    equals = false;
                    break;
                }
            }

            if (equals)
                words[i] = null;

            last = cs;
        }

        List<String> l = new ArrayList<>();
        for (String word : words) {
            if (word != null)
                l.add(word);
        }

        return l;
    }
}
