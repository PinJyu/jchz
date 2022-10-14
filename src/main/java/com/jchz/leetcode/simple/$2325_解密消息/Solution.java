package com.jchz.leetcode.simple.$2325_解密消息;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 22:36
 * @see
 * @since
 */
public class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        map.put(' ', ' ');
        char index = 'a';
        for (char c : key.toCharArray()) {
            if (c != ' ' && !map.containsKey(c))
                map.put(c, index++);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            sb.append(map.get(c));
        }


        return sb.toString();
    }
}
