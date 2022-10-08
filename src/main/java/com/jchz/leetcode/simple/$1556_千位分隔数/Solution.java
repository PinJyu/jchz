package com.jchz.leetcode.simple.$1556_千位分隔数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-08 22:39
 * @see
 * @since
 */
public class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 0) sb.append('0');
        while (n > 0) {
            int mode = n % 1000;
            n /= 1000;
            if (n > 0)
                sb.insert(0, 1000 + mode).deleteCharAt(0).insert(0, ".");
            else
                sb.insert(0, mode);
        }
        return sb.toString();

    }
}
