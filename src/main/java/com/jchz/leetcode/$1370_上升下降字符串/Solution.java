package com.jchz.leetcode.$1370_上升下降字符串;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 15:44
 * @see
 * @since
 */
public class Solution {
    public String sortString(String s) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }


        StringBuilder sb = new StringBuilder();
        int countZero = 0;
        while(countZero < map.length) {
            for (int i = 0; i < map.length; i++) {
                if (map[i] > 0) {
                    sb.append(((char) (i + 'a')));
                    map[i]--;
                    countZero = 0;
                }
                else {
                    countZero++;
                }
            }
            for (int i = map.length - 1; i >= 0; i--){
                if (map[i] > 0) {
                    sb.append(((char) (i + 'a')));
                    map[i]--;
                    countZero = 0;
                }
                else {
                    countZero++;
                }
            }
        }

        return sb.toString();
    }
}
