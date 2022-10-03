package com.jchz.leetcode.$0953_验证外星语词典;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 20:46
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().isAlienSorted(new String[]{"hello","leetcode"},
        "hlabcdefgijkmnopqrstuvwxyz");
    }
    public boolean isAlienSorted(String[] words, String order) {

        int[] order_r = new int[26];
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            order_r[c - 'a'] = i + 1;
        }

            for (int j = 1; j < words.length; j++) {
                for (int i = 0; i < 100; i++) {
                    int o1 = 0, o2 = 0;
                    if (words[j].length() > i) {
                        o2 = order_r[words[j].charAt(i) - 'a'];
                    }
                    if (words[j - 1].length() > i) {
                        o1 = order_r[words[j - 1].charAt(i) - 'a'];
                    }
                    if (o1 == 0 && o2 == 0)
                        break;

                    if (o1 < o2)
                        break;
                    else if (o1 > o2) {
                        return false;
                    }
                }
            }


        return true;
    }
}
