package com.jchz.leetcode.simple.$2169_得到0的操作数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 00:10
 * @see
 * @since
 */
public class Solution {

    public int countOperations(int num1, int num2) {
        if (num1 > num2)
            return countOperations(num1, num2);
        int count = 0;
        while (num1 > 0) {
            int mode = num2 % num1;
            count += num2 / num1;
            num2 = num1;
            num1 = mode;
        }

        return count;
    }
}
