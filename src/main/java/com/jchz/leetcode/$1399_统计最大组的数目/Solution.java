package com.jchz.leetcode.$1399_统计最大组的数目;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 17:15
 * @see
 * @since
 */
public class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int index = getSum(i);
            count[index]++;
            max = Math.max(max, count[index]);
        }

        int c = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            c += count[i] == max ? 1 : 0;
        }

        return c;
    }

    int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
