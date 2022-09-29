package com.jchz.leetcode.$0804_唯一摩尔斯密码词;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 11:48
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(map[c - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}
