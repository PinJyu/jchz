package com.jchz.leetcode.simple.$LCP0002_分式化简;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 01:40
 * @see
 * @since
 */
public class Solution {
    public int[] fraction(int[] cont) {
        int n = 1, m = cont[cont.length - 1];

        for (int i = cont.length - 2; i >= 0; i--) {
            int t = m;
            m = cont[i] * m + n;
            n = t;
        }


        return new int[]{n, m};
    }

}
