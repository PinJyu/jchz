package com.jchz.leetcode.simple.$1832_判断句子是否为全字母句;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 22:09
 * @see
 * @since
 */
public class Solution {
    public boolean checkIfPangram(String sentence) {
        int bitmap = 0;
        for (char c : sentence.toCharArray()) {
            bitmap |= 1 << (c - 'a');
        }

        return bitmap == 0X3FFFFFF;
    }
}
