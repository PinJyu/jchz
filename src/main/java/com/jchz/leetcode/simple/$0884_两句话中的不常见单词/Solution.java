package com.jchz.leetcode.simple.$0884_两句话中的不常见单词;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 16:42
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().uncommonFromSentences( "this apple is sweet", "this apple is sour");
    }
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] sp1 = s1.split(" ");
        String[] sp2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s : sp1) {
           map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : sp2) {

            map.put(s, map.getOrDefault(s, 0) + 1);
        }


        List<String> l = new ArrayList<>();
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            if (en.getValue() == 1) {
                l.add(en.getKey());
            }
        }

        return l.toArray(new String[0]);
    }
}
